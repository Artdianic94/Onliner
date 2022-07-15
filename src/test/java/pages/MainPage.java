package pages;

import org.openqa.selenium.WebDriver;
import staticdata.Locators;
import staticdata.WebUrl;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get(WebUrl.ONLINER_URL);
    }

    public void openCatalog() {
        clickWhenDisplayed(driver.findElement(Locators.CATALOGUE_BTN));
    }
}