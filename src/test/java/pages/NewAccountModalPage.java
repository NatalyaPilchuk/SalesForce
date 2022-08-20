package pages;

import Models.NewAccountModel;
import constants.Credentials;
import elements.Description;
import elements.DropDownList;
import elements.TextInput;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;

public class NewAccountModalPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(NewAccountModalPage.class.getName());
    private By ACCOUNT_NAME_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Step("Filling account form")
    public void fillInAccountForm(NewAccountModel newAccount) {
        LOGGER.debug(String.format("Attempt to send account name: %s", newAccount.getAccountName()));
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(newAccount.getAccountName());
        LOGGER.debug(String.format("Attempt to send phone number: %s", newAccount.getPhone()));
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        LOGGER.debug(String.format("Attempt to choose the type: %s", newAccount.getType()));
        new DropDownList(driver, "Type").selectOptionsInTypeList(newAccount.getType());
        LOGGER.debug(String.format("Attempt to send the fax: %s", newAccount.getFax()));
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        LOGGER.debug(String.format("Attempt to send the website: %s", newAccount.getWebsite()));
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        LOGGER.debug(String.format("Attempt to choose the industry: %s", newAccount.getIndustry()));
        new DropDownList(driver, "Industry").selectOptionsInIndustryList(newAccount.getIndustry());
        LOGGER.debug(String.format("Attempt to send employees: %s", newAccount.getEmployees()));
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        LOGGER.debug(String.format("Attempt to send Annual Revenue: %s", newAccount.getAnnualRevenue()));
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        LOGGER.debug(String.format("Attempt to send description: %s", newAccount.getDescription()));
        new Description(driver, "Description").inputDescription(newAccount.getDescription());
        LOGGER.debug(String.format("Attempt to send Billing Street: %s", newAccount.getBillingStreet()));
        new Description(driver, "Billing Street").inputDescription(newAccount.getBillingStreet());
        LOGGER.debug(String.format("Attempt to send Shipping Street: %s", newAccount.getShippingStreet()));
        new Description(driver, "Shipping Street").inputDescription(newAccount.getShippingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        LOGGER.debug(String.format("Attempt to send PostalCode: %s", newAccount.getBillingZipPostalCode()));
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipPostalCode());
        LOGGER.debug(String.format("Attempt to send Billing State: %s", newAccount.getBillingStateProvince()));
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        LOGGER.debug(String.format("Attempt to send Shipping City: %s", newAccount.getShippingCity()));
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        LOGGER.debug(String.format("Attempt to send Postal Code: %s", newAccount.getShippingZipPostalCode()));
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipPostalCode());
        LOGGER.debug(String.format("Attempt to send Shipping State: %s", newAccount.getBillingStateProvince()));
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingStateProvince());
        LOGGER.debug(String.format("Attempt to send Shipping Country: %s", newAccount.getShippingCountry()));
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());
        LOGGER.info("Attempt to click Save Button");
        driver.findElement(SAVE_BUTTON).click();

    }


}
