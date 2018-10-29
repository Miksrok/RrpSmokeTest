package ua.gov.nais.tests;

import org.testng.annotations.Test;
import ua.gov.nais.pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.pressConfirmationButtn();
        loginPage.enterKeyInformation();
    }

}
