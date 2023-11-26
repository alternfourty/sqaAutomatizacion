package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.spotify.open.UI.SearchSongUI.BUTTON_PLAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickPlay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_PLAY)
        );
    }
    public static ClickPlay on() {
        return instrumented(ClickPlay.class);
    }
}
