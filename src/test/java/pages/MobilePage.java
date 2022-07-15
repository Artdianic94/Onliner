package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import staticdata.Locators;

public class MobilePage extends BasePage {

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    public void confirmGeoPosition() {
        clickWhenDisplayed(driver.findElement(Locators.CONFIRM_GEO_POSITION_BTN));
        waitForConditionIsTrue(driver -> driver.findElements(Locators.PHONES_LIST).size() == 30
                && driver.findElements(Locators.PHONES_LIST).get(0).isDisplayed()
                && driver.findElements(Locators.PHONES_LIST).get(0).isEnabled());
    }

    public void selectApplePhones() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", driver.findElement(Locators.APPLE_CHECKBOX));
        clickWhenDisplayed(driver.findElement(Locators.APPLE_CHECKBOX));
    }

    public int getPriceOfTheFirstPhone() {
        waitForConditionIsTrue(driver -> driver.findElements(Locators.PHONES_LIST).size() == 30
                && driver.findElements(Locators.PHONES_LIST).get(0).isDisplayed()
                && driver.findElements(Locators.PHONES_LIST).get(0).isEnabled());
        String price = driver.findElements(Locators.PRICES_LIST).get(0).getText().replace(",00 р.", "");
        return Integer.parseInt(price);
    }
}