package com.spotify.open.stepDefinitions;

import com.spotify.open.questions.CheckHome;
import com.spotify.open.questions.CheckLogin;
import com.spotify.open.questions.CheckPlayingSong;
import com.spotify.open.tasks.ClickPlay;
import com.spotify.open.tasks.ClickSearchTask;
import com.spotify.open.tasks.SearchSongTask;
import com.spotify.open.tasks.SongSelectionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlaySongSpotifyStepDefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("a user is logged on the spotify website")
    public void aUserIsLoggedOnTheSpotifyWebsite() {
        theActorCalled("user").should(
                seeThat(
                        CheckLogin.check(), Matchers.equalTo(true)
                )
        );
    }
    @Given("the user is on the home screen")
    public void theUserIsOnTheHomeScreen() {
        theActorInTheSpotlight().should(
                seeThat(
                        CheckHome.check(), Matchers.equalTo(true)
                )
        );
    }
    @Given("the user selects the search option")
    public void theUserSelectsTheSearchOption() {
        theActorInTheSpotlight().attemptsTo(
                ClickSearchTask.on()
        );
    }
    @When("it types the name of a song and then hits enter")
    public void itTypesTheNameOfASongAndThenHitsEnter() {
        theActorInTheSpotlight().attemptsTo(
                SearchSongTask.on()
        );
    }
    @Then("the user will be able to play that song from the results")
    public void theUserWillBeAbleToPlayThatSongFromTheResults() {
        theActorInTheSpotlight().attemptsTo(
                SongSelectionTask.on()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickPlay.on()
        );
        theActorInTheSpotlight().should(
                seeThat(
                        CheckPlayingSong.itsPlaying(),Matchers.equalTo(true)
                )
        );
    }
}