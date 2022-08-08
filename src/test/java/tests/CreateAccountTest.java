package tests;

import Models.NewAccountModel;
import TestData.PrepareNewAccountData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModalPage;
import pages.SavePage;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesForce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);
        SavePage savePage = new SavePage(driver);
        NewAccountModalPage newAccountModalPage = new NewAccountModalPage(driver);
        Assert.assertEquals(accountModel.getAccountName(),savePage.getText(), "there isn't such account name");
        System.out.println(" ");
    }
}
