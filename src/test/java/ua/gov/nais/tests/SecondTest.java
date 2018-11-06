package ua.gov.nais.tests;

import org.testng.annotations.Test;
import ua.gov.nais.models.Person;
import ua.gov.nais.models.RealEstate;
import ua.gov.nais.pages.LeftSideMenu;
import ua.gov.nais.pages.LoginPage;
import ua.gov.nais.pages.createApplicationPages.*;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.AddRealEstateBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateAddressBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateMainBlock;

public class SecondTest extends BaseTest{

    @Test
    public void secondTest(){

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
        leftSideMenu.pressOtherOwnershipButton();

        //====================

        StatementDetails statementDetails = new StatementDetails(driver);
        statementDetails.pressTypeOfRegistrationList();
        statementDetails.pressTypeOfRegistrationListItem();
        statementDetails.pressOtherOwnershipList();
        statementDetails.pressOtherOwnershipListItem();
//==================
        RealEstateMainBlock realEstateMainBlock  = new RealEstateMainBlock(driver);
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
        realEstateAddressBlock.enterCity(realEstate.getCity());
        realEstateAddressBlock.enterStreet(realEstate.getStreet());
        realEstateAddressBlock.selectBuildingType(realEstate.getBuildingType());
        realEstateAddressBlock.enterBuildingNumber(realEstate.getBuildingNumber());
        realEstateAddressBlock.selectApartmentType(realEstate.getApartmentType());
        realEstateAddressBlock.enterApartmentNumber(realEstate.getApartmentNumber());
        realEstateAddressBlock.clickOkButton();
//======================
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
        personBlock.pressOkButton();
//================
        PaymentDetails paymentDetails = new PaymentDetails(driver);
        paymentDetails.pressPaymentdDetailsButton();
        paymentDetails.pressAdditionOfPaymentButton();
        paymentDetails.pressTypeOfpaymentList();
        paymentDetails.pressFeeForRegistrationActionsListItem();
        paymentDetails.pressReasonRadioButton();
        paymentDetails.pressReasonList();
        paymentDetails.pressAtTheRequestOfTheNBUListItem();
        paymentDetails.pressApplyButton();

        paymentDetails.pressAdditionOfPaymentButton();
        paymentDetails.pressTypeOfpaymentList();
        paymentDetails.pressFeeForProvidingInformationListItem();
        paymentDetails.pressReasonRadioButton();
        paymentDetails.pressReasonList();
        paymentDetails.pressAtTheRequestOfTheNBUListItem();
        paymentDetails.pressApplyButton();
//====================
        AccompanyingDocuments documents = new AccompanyingDocuments(driver);
        documents.pressAccompanyingDocumentsButton();
        documents.pressAddDocumentButton();
        documents.pressDocumentTypeList();
        documents.pressCertificateOfDABIlistItem();
        documents.enterNumberOfDoc();
        documents.enterPublisherInfo();
//=====================
        BottomBlock bottomBlock = new BottomBlock(driver);
        bottomBlock.pressApplicationDeadlineList();
        bottomBlock.pressTwoBusinessDaysListItem();
        bottomBlock.pressRegisterButton();


    }

}
