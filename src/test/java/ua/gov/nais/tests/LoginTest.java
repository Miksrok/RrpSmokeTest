package ua.gov.nais.tests;

import org.testng.annotations.Test;
import ua.gov.nais.models.Person;
import ua.gov.nais.pages.LeftSideMenu;
import ua.gov.nais.pages.LoginPage;
import ua.gov.nais.pages.applicationPages.BottomBlock;
import ua.gov.nais.pages.applicationPages.PersonBlock;

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
        BottomBlock bottomBlock = new BottomBlock(driver);
        bottomBlock.pressApplicationDeadlineList();
        bottomBlock.pressTwoBusinessDaysListItem();

        PersonBlock personBlock = new PersonBlock(driver);
        personBlock.clickPersonBlockButton();
        personBlock.clickAddPersonButton();
        personBlock.clickAddPhisycalPersonButton();
        personBlock.clickRoleList();
        personBlock.addPersonOfLaw();
        personBlock.addApplicantItem();
        personBlock.clickCloseRoleList();
        Person person = new Person();
        personBlock.enterFullName(person.getFullName());
        personBlock.enterId(person.getId());
        personBlock.enterPassportNumber(person.getPassport());
        personBlock.enterPassportDate(person.getPassportDate());
        personBlock.enterPassportPublisher(person.getPassportPublisher());
    }

}
