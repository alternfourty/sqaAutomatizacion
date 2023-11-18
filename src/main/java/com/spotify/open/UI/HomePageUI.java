package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    public static Target BUTTON_LOGIN = Target.the("login button").located(By.xpath("//button[@data-testid='login-button']"));
}
