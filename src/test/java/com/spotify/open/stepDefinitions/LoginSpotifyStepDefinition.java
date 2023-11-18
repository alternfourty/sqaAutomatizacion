package com.spotify.open.stepDefinitions;

import com.spotify.open.tasks.LoginCheckTask;
import com.spotify.open.tasks.LoginCredentialsTask;
import com.spotify.open.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.spotify.open.UI.LoginUI.BUTTON_USER;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSpotifyStepDefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("a user is on the spotify website")
    public void aUserIsOnTheSpotifyWebsite() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://open.spotify.com/")
        );
    }
    @When("the user pushes the log in button")
    public void theUserPushesTheLogInButton() {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.on()
        );
    }
    @When("fill in its login credentials")
    public void fillInItsLoginCredentials() {
        theActorInTheSpotlight().attemptsTo(
                LoginCredentialsTask.on()
        );
    }
    @Then("it should be redirected to the home of the spotify player")
    public void itShouldBeRedirectedToTheHomeOfTheSpotifyPlayer() {
        theActorInTheSpotlight().attemptsTo(
                LoginCheckTask.on()
        );
    }
}
