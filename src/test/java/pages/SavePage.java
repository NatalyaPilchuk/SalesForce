package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;

public class SavePage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(SavePage.class.getName());
    private By SAVE_ACCOUNT = By.xpath("//div[contains(@class,'slds-tabs_card')]//span[text()='Account Name']//parent::div//following-sibling::div//span");

    public SavePage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        LOGGER.debug(String.format("Attempt to find account name :%s", driver.findElement(SAVE_ACCOUNT).getText()));
        return driver.findElement(SAVE_ACCOUNT).getText();
    }
}
