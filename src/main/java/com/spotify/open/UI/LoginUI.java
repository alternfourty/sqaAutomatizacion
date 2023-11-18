package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static Target TXT_EMAIL = Target.the("email field").located(By.xpath("//input[@id='login-username']"));
    public static Target TXT_PASSWORD = Target.the("email field").located(By.xpath("//input[@id='login-password']"));
    public static Target BUTTON_USER = Target.the("User Profile Menu").located(By.xpath("//button[@data-testid='user-widget-link']"));
}
