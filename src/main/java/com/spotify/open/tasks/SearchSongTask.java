package com.spotify.open.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.spotify.open.UI.SearchSongUI.TXT_SONGNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchSongTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("STARSET").into(TXT_SONGNAME).thenHit(Keys.ENTER)
        );
    }
    public static SearchSongTask on() {
        return instrumented(SearchSongTask.class);
    }
}
