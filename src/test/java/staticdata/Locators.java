package staticdata;

import org.openqa.selenium.By;

public class Locators {

    public static final By CATALOGUE_BTN = By.xpath("//span[@class='b-main-navigation__text' and contains(., 'Каталог')]");
    public static final By ELECTRONICS_BTN = By.xpath("//span[contains(., 'Электроника')]/span");
    public static final By MOBILE_BTN = By.xpath("//div[@class='catalog-navigation-list__aside-title' and contains(.,' Мобильные')]");
    public static final By PHONES_BTN = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active' and contains(., 'Мобильные')]//span[@class='catalog-navigation-list__dropdown-title' and contains(.,' Смартфоны ')]");
    public static final By APPLE_CHECKBOX = By.xpath("//div[@class='schema-filter__fieldset' and contains(.,'Производитель' )]//ul[@class='schema-filter__list']//span[contains(.,'Apple')]");
    public static final By PRICES_LIST = By.xpath("//div[contains(@class, 'schema-product__price')]//span[contains(@data-bind, 'minPrice')]");
    public static final By PHONES_LIST = By.xpath("//div[contains(@class, 'product_narrow-sizes')]");
    public static final By CONFIRM_GEO_POSITION_BTN = By.xpath("//span[contains(@class, 'schema-filter__button')]");

}