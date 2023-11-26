package com.spotify.open.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.spotify.open.UI.LoginUI.BUTTON_USER;

public class CheckLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade userButton = BUTTON_USER.resolveFor(actor);
        return userButton.isDisplayed();
    }
    public static Question<Boolean> check(){
        return new CheckLogin();
    }
}
