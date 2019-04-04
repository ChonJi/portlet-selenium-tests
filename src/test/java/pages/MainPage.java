package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    @FindBy(xpath = "//img[@alt='Bayer logo']")
    private WebElement logo;

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}
