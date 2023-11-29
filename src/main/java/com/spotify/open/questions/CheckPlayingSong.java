package com.spotify.open.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.spotify.open.UI.SearchSongUI.BUTTON_PAUSE;

public class CheckPlayingSong implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade pauseButton = BUTTON_PAUSE.resolveFor(actor);
        return pauseButton.isVisible();
    }
    public static Question<Boolean> itsPlaying(){
        return new CheckPlayingSong();
    }
}
