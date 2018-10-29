package ua.gov.nais.tests;

import org.testng.annotations.Test;
import ua.gov.nais.pages.LeftSideMenu;
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
        LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
        leftSideMenu.pressRegistrationAndProcessingButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        leftSideMenu.pressApplicationRegistrationButton();
        leftSideMenu.pressOwnershipButton();
    }

}
