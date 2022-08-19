package tests;

import Models.NewAccountModel;
import TestData.PrepareNewAccountData;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModalPage;
import pages.SavePage;

public class CreateAccountTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info("Input username,input password, click button 'log In'");
        loginPage.loginToSalesForce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        LOGGER.info(String.format("Open %s page", AccountsPage.class.getName()));
        accountsPage.openAccountPage();
        LOGGER.info(String.format("Open %s page", NewAccountModel.class.getName()));
        accountsPage.openNewAccountModal();
        NewAccountModalPage newAccountModalPage = new NewAccountModalPage(driver);
        LOGGER.info("Input all fields");
        newAccountModalPage.fillInAccountForm(accountModel);
        SavePage savePage = new SavePage(driver);
        LOGGER.info("Check if account name is displayed");
        Assert.assertEquals(accountModel.getAccountName(), savePage.getText(), "there isn't such account name");

    }
}
