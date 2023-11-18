package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.spotify.open.UI.HomePageUI.BUTTON_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_LOGIN)
        );
    }

    public static LoginTask on() {
        return instrumented(LoginTask.class);
    }



}
