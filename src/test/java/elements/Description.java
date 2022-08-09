package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Description {
    private static final String DESCRIPTION_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::textarea";
    private WebDriver driver;
    private String labelText;

    public Description(WebDriver driver, String labelText) {
        this.labelText = labelText;
        this.driver = driver;
    }

    public void inputDescription(String text) {
        String finalXpath = String.format(DESCRIPTION_XPATH, labelText);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);

    }
}
