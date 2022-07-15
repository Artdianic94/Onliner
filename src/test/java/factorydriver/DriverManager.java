package factorydriver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class DriverManager {

    public WebDriver driver;

    public abstract void setUpDriver() throws MalformedURLException;

    public WebDriver getDriver() {
        return driver;
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void quitDriver() {
        driver.quit();
    }
}