package pages;

import Models.NewAccountModel;
import elements.Description;
import elements.DropDownList;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {
    private By ACCOUNT_NAME_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropDownList(driver, "Type").selectOptionsInTypeList(newAccount.getType());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new DropDownList(driver, "Industry").selectOptionsInIndustryList(newAccount.getIndustry());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new Description(driver, "Description").inputDescription(newAccount.getDescription());
        new Description(driver, "Billing Street").inputDescription(newAccount.getBillingStreet());
        new Description(driver, "Shipping Street").inputDescription(newAccount.getShippingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipPostalCode());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipPostalCode());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingStateProvince());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());
        driver.findElement(SAVE_BUTTON).click();

    }





}
