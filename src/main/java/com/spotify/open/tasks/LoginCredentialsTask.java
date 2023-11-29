package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.spotify.open.UI.LoginUI.TXT_EMAIL;
import static com.spotify.open.UI.LoginUI.TXT_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginCredentialsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("fourtytestzero@proton.me").into(TXT_EMAIL).thenHit(Keys.TAB)
        );

        actor.attemptsTo(
                Enter.theValue("maewS8$#E%wkeu*7eY").into(TXT_PASSWORD).thenHit(Keys.ENTER)
        );
    }

    public static LoginCredentialsTask on() {
        return instrumented(LoginCredentialsTask.class);
    }
}


