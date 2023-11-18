package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.spotify.open.UI.LoginUI.BUTTON_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginCheckTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_USER)
        );
    }

    public static LoginCheckTask on() {
        return instrumented(LoginCheckTask.class);
    }
}
