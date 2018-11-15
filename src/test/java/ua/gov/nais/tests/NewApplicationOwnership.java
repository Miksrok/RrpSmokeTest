package ua.gov.nais.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.gov.nais.models.Person;
import ua.gov.nais.models.RealEstate;
import ua.gov.nais.pages.LeftSideMenu;
import ua.gov.nais.pages.LoginPage;
import ua.gov.nais.pages.applicationPage.ApplicationPage;
import ua.gov.nais.pages.createApplicationPages.*;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.AddRealEstateBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateAddressBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateMainBlock;

import java.io.File;

public class NewApplicationOwnership extends BaseTest {

    private final String OWNERSHIP = "заява про державну реєстрацію права власності";
    private final String APPLICATION_STATE = "зареєстровано";

    @Test
    public void createApplicationOwnership() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorizaton();

        LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
        leftSideMenu.openOwnershipApplicationForm();

        StatementDetails statementDetails = new StatementDetails(driver);
        statementDetails.selectRegistrationType();
        statementDetails.enterStatementDetailsForOwnership();
//==================
        RealEstateMainBlock realEstateMainBlock = new RealEstateMainBlock(driver);
        realEstateMainBlock.clickRealEstateBlook();
        realEstateMainBlock.clickAddButton();
        realEstateMainBlock.clicAddRealEstateButton();

        AddRealEstateBlock addRealEstateBlock = new AddRealEstateBlock(driver);
        addRealEstateBlock.clickTypeList();
        addRealEstateBlock.selectApartmentItem();
        addRealEstateBlock.clickOkButton();

        realEstateMainBlock.clickAddButton();
        realEstateMainBlock.clickAddRealEstateAddressButton();

        RealEstateAddressBlock realEstateAddressBlock = new RealEstateAddressBlock(driver);
        RealEstate realEstate = new RealEstate();
        realEstateAddressBlock.enterRealEstateAddress(
                realEstate.getCity(),
                realEstate.getStreet(),
                realEstate.getBuildingType(),
                realEstate.getBuildingNumber(),
                realEstate.getApartmentType(),
                realEstate.getApartmentNumber()
        );
//======================
        PersonBlock personBlock = new PersonBlock(driver);
        Person person = new Person();

        personBlock.enterInformationAboutPerson(
                OWNERSHIP,
                person.getFullName(),
                person.getId(),
                person.getPassport(),
                person.getPassportDate(),
                person.getPassportPublisher()
        );
//================
        PaymentDetails paymentDetails = new PaymentDetails(driver);
        paymentDetails.addPaymantDetails();
//====================
        AccompanyingDocuments documents = new AccompanyingDocuments(driver);
        documents.pressAccompanyingDocumentsButton();
        documents.addDABI();
        documents.addMortageContract();
        documents.addLifeLongMaintenanceAgreement();
//=====================
        BottomBlock bottomBlock = new BottomBlock(driver);
        bottomBlock.pressApplicationDeadlineList();
        bottomBlock.pressTwoBusinessDaysListItem();
        bottomBlock.pressRegisterButton();

        //=====================================

        ApplicationPage applicationPage = new ApplicationPage(driver);
        applicationPage.closeWindow();

        //Asserts
        ApplicationAsserts applicationAsserts = new ApplicationAsserts(driver);
        Assert.assertEquals(OWNERSHIP, applicationAsserts.getApplicationName(), "wrong application name");
        Assert.assertEquals(APPLICATION_STATE, applicationAsserts.getApplicationState(), "wrong application state");

    }

}
