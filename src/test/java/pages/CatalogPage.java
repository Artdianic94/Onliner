package pages;

import org.openqa.selenium.*;
import staticdata.Locators;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickElectronicBtn() {
        clickWhenDisplayed(driver.findElement(Locators.ELECTRONICS_BTN));
    }

    public void clickMobileBtn() {
        clickWhenDisplayed(driver.findElement(Locators.MOBILE_BTN));
    }

    public void clickPhonesBtn() {
        waitForElementIsDisplayedAndHasText(driver.findElement(Locators.PHONES_BTN), "Смартфоны");
        clickWhenDisplayed(driver.findElement(Locators.PHONES_BTN));
    }
}