package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class DropDownList {
    private static final String LIST_TYPE_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::span//following-sibling::div//a";
    private static final String OPTION_TYPE_XPATH = "//div[contains(@class, 'visible')]//a[@title='%s']";
    private static final String LIST_INDUSTRY_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::span//following-sibling::div//a";
    private static final String OPTION_INDUSTRY_XPATH = "//div[contains(@class, 'visible')]//a[@title='%s']";
    private WebDriver driver;
    private String labelText;

    public DropDownList(WebDriver driver, String labelText) {
        this.driver = driver;
        this.labelText = labelText;
    }

    public void selectOptionsInTypeList(String option) {
        String listFinalXpath = String.format(LIST_TYPE_XPATH, labelText);
        driver.findElement(By.xpath(listFinalXpath)).click();
        String optionFinalXpath = String.format(OPTION_TYPE_XPATH, option);
        driver.findElement(By.xpath(optionFinalXpath)).click();

    }

    public void selectOptionsInIndustryList(String option) {
        String listFinalXpath = String.format(LIST_INDUSTRY_XPATH, labelText);
        driver.findElement(By.xpath(listFinalXpath)).click();
        String optionFinalXpath = String.format(OPTION_INDUSTRY_XPATH, option);
        driver.findElement(By.xpath(optionFinalXpath)).click();

    }
}
