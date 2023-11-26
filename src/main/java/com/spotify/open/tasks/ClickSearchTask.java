package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.spotify.open.UI.SearchSongUI.BUTTON_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickSearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SEARCH)
        );
    }
    public static ClickSearchTask on() {
        return instrumented(ClickSearchTask.class);
    }
}
