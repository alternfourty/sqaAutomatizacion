package com.spotify.open.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.util.List;
import java.util.Random;
import static com.spotify.open.UI.SearchSongUI.LINK_TO_SONG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickAndSelect implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> songList = LINK_TO_SONG.resolveAllFor(actor);
        Random random = new Random();
        int index = random.nextInt(songList.size());
        WebElementFacade song = songList.get(index);
        song.click();
    }


    public static Performable click() {
        return instrumented(ClickAndSelect.class);
    }
}
