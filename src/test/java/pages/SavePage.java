package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavePage extends BasePage {
    private By SAVE_ACCOUNT = By.xpath("//div[contains(@class,'slds-tabs_card')]//span[text()='Account Name']//parent::div//following-sibling::div//span");

    public SavePage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return driver.findElement(SAVE_ACCOUNT).getText();
    }
}
