package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;

public class LoginPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());
    private By USER_NAME = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesForce() {
        LOGGER.debug(String.format("Attempt to open Url:%s", Urls.SALES_FORCE_LOGIN));
        driver.get(Urls.SALES_FORCE_LOGIN);
        LOGGER.debug(String.format("Attempt to send username: %s", Credentials.USERNAME));
        driver.findElement(USER_NAME).sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Attempt to send password: %s", Credentials.PASSWORD));
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        LOGGER.debug("Attempt to click Login Button");
        driver.findElement(LOGIN_BUTTON).click();
    }
}
