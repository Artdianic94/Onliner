package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementIsDisplayed(WebElement element) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        Function<WebDriver, Boolean> booleanFunction = driver -> element != null
                && element.isDisplayed()
                && element.isEnabled();
        fluentWait.until(booleanFunction);
    }

    public void waitForConditionIsTrue(Function<WebDriver, Boolean> booleanFunction) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        fluentWait.until(booleanFunction);
    }

    public void waitForElementIsDisplayedAndHasText(WebElement element, String text) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        Function<WebDriver, Boolean> booleanFunction = driver -> element != null
                && element.isDisplayed()
                && element.isEnabled()
                && element.getText().trim().equals(text);
        fluentWait.until(booleanFunction);
    }

    public void clickWhenDisplayed(WebElement element) {
        waitForElementIsDisplayed(element);
        element.click();
    }
}