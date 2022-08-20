package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;

public class AccountsPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());
    private By NEW_BUTTON = By.xpath("//ul[contains(@class, 'branding-actions')]//a[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Account page")
    public AccountsPage openAccountPage() {
        LOGGER.debug(String.format("Attempt to open Url:%s", Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL)));
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    @Step("Open new Account modal")
    public NewAccountModalPage openNewAccountModal() {
        LOGGER.debug(String.format("Attempt to click new Button", NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModalPage(driver);
    }


}
