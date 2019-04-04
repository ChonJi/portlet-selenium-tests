package tests;

import core.SetUpTests;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTest extends SetUpTests {

    private MainPage mainPage;

    @Test
    public void shouldGoOnMainPage() {
        mainPage = openMainPage();
        assertThat(mainPage.isLogoDisplayed()).isTrue();
    }

}
