package com.spotify.open.tasks;
import com.spotify.open.interactions.ClickAndSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SongSelectionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickAndSelect.click()
        );
    }
    public static SongSelectionTask on() {
        return instrumented(SongSelectionTask.class);
    }
}
