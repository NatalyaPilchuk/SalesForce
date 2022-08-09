package pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By USER_NAME=By.id("username");
    private By PASSWORD_INPUT=By.id("password");
    private By LOGIN_BUTTON=By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginToSalesForce(){
        driver.get(Urls.SALES_FORCE_LOGIN);
        driver.findElement(USER_NAME).sendKeys(Credentials.USERNAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
