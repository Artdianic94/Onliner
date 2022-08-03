package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import staticdata.Locators;

public class MobilePage extends BasePage {

    public MobilePage(WebDriver driver) {
        super(driver);
    }


    public void selectApplePhones() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", driver.findElement(Locators.APPLE_CHECKBOX));
        driver.findElement(Locators.APPLE_CHECKBOX).click();
    }

    public double getPriceOfTheFirstPhone() {
        String price = driver.findElements(Locators.PRICES_LIST).get(0).getText().replace("р.", "").replace(",", ".");
        return Double.parseDouble(price);
    }
}