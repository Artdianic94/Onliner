package tests.uitests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.MainPage;
import pages.MobilePage;

public class isPriceGreaterThan100Test extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(isPriceGreaterThan100Test.class.getName());

    @Test
    public void isPriceGreaterThan100Test(){
        LOGGER.info("isPriceGreaterThan100 started");

        MainPage mainPage = new MainPage(driver);
        LOGGER.info("Open main page");
        mainPage.openMainPage();
        LOGGER.info("Open a general catalog");
        mainPage.openCatalog();

        CatalogPage catalogPage = new CatalogPage(driver);
        LOGGER.info("Open an electronics tab at the general catalog");
        catalogPage.clickElectronicBtn();
        LOGGER.info("Open a catalog with mobile phones");
        catalogPage.clickMobileBtn();
        LOGGER.info("Open a catalog with phones");
        catalogPage.clickPhonesBtn();

        MobilePage mobilePage = new MobilePage(driver);
        LOGGER.info("Select Apple phones");
        mobilePage.selectApplePhones();

        LOGGER.info("Get the price of the first Apple phone on the list");
        double actualPrice = mobilePage.getPriceOfTheFirstPhone();
        Assertions.assertThat(actualPrice).isGreaterThan(100);
        LOGGER.info("The received price is greater than 100 BYN");
    }
}