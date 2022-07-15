package tests.uitests;


import factorydriver.DriverFactory;
import factorydriver.DriverManager;
import factorydriver.DriverType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.CatalogPage;

import java.net.MalformedURLException;


public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    private static final Logger LOGGER = LogManager.getLogger(isPriceGreaterThan100Test.class.getName());

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {

        DriverFactory factory = new DriverFactory();
        DriverType driverType = switch (browser) {
            case "chrome" -> DriverType.CHROME;
            case "firefox" -> DriverType.FIREFOX;
            default -> null;
        };
        driverManager = factory.getManager(driverType);
        driverManager.setUpDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        System.getProperty("configuration");
        CatalogPage catalogPage = new CatalogPage(driver);
        LOGGER.info("Attempt to open " + catalogPage.getClass().getName() + " page");

    }

    @AfterTest(alwaysRun = true)
    public void quiteBrowser() {
        driverManager.quitDriver();
    }
}