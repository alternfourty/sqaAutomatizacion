package com.spotify.open.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchSongUI {
    public static Target TXT_SONGNAME = Target.the("Search Field").located(By.xpath("//input[@data-testid='search-input']"));
    public static Target BUTTON_SEARCH = Target.the("Search Button").located(By.xpath("//a[@aria-label='Search']"));
    public static Target BUTTON_HOME = Target.the("Home Button").located(By.xpath("//a[@aria-label='Home' and contains(@class,'active')]"));
    public static Target BUTTON_PLAY = Target.the("Play Button").located(By.xpath("//button[@data-testid='play-button' and @class='Button-sc-qlcn5g-0 hCReiC']"));
    public static Target BUTTON_PAUSE = Target.the("Pause Button on Player").located(By.xpath("//button[@aria-label='Pause' and @data-testid='control-button-playpause']"));
    public static Target LINK_TO_SONG = Target.the("Link to the song").located(By.xpath("//a[@class='t_yrXoUO3qGsJS4Y6iXX']"));
}
