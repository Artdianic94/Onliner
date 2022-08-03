package pages;

import org.openqa.selenium.*;
import staticdata.Locators;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickElectronicBtn() {
        driver.findElement(Locators.ELECTRONICS_BTN).click();
    }

    public void clickMobileBtn() {
        driver.findElement(Locators.MOBILE_BTN).click();
    }

    public void clickPhonesBtn() {
        driver.findElement(Locators.PHONES_BTN).click();
    }
}