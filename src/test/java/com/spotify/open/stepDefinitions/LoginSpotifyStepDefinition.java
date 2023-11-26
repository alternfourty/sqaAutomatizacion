package com.spotify.open.stepDefinitions;

import com.spotify.open.questions.CheckLogin;
import com.spotify.open.tasks.LoginCredentialsTask;
import com.spotify.open.tasks.ClickLoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
                ClickLoginTask.on()
        );
    }
    @And("fill in its email and password")
    public void fillInItsEmailAndPassword() {
        theActorInTheSpotlight().attemptsTo(
                LoginCredentialsTask.on()
        );
    }
    @Then("it should be redirected to the home of its spotify account")
    public void itShouldBeRedirectedToTheHomeOfItsSpotifyAccount() {
        theActorInTheSpotlight().should(
                seeThat(
                        CheckLogin.check(), Matchers.equalTo(true)
                )
        );
    }
}
