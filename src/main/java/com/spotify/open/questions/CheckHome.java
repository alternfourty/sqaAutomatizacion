package com.spotify.open.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.spotify.open.UI.SearchSongUI.BUTTON_HOME;

public class CheckHome implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade homeButton = BUTTON_HOME.resolveFor(actor);
        return homeButton.isDisplayed();
    }
    public static Question<Boolean> check(){
        return new CheckHome();
    }
}
