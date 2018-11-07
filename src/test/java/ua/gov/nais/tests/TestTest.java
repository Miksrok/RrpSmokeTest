package ua.gov.nais.tests;

import org.testng.annotations.Test;
import ua.gov.nais.models.Person;
import ua.gov.nais.models.RealEstate;
import ua.gov.nais.pages.ErrorMessagePage;
import ua.gov.nais.pages.LeftSideMenu;
import ua.gov.nais.pages.LoginPage;
import ua.gov.nais.pages.applicationPage.ApplicationPage;
import ua.gov.nais.pages.applicationPage.makeDecisionPage.MakeDecisionPage;
import ua.gov.nais.pages.createApplicationPages.*;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.AddRealEstateBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateAddressBlock;
import ua.gov.nais.pages.createApplicationPages.RealEstateBlock.RealEstateMainBlock;
import ua.gov.nais.pages.decisionPage.DecisionPage;
import ua.gov.nais.pages.openSectionPage.EnterDecisionNumberPage;
import ua.gov.nais.pages.openSectionPage.EnterRealEstateAddressPage;
import ua.gov.nais.pages.section.Section;
import ua.gov.nais.pages.section.arrestTab.Arrest;
import ua.gov.nais.pages.section.arrestTab.newArrest.CreatArrest;
import ua.gov.nais.pages.section.arrestTab.newArrest.subNewArrest.ArrestOverviewTab;
import ua.gov.nais.pages.section.ownershipTab.Ownership;
import ua.gov.nais.pages.section.ownershipTab.newOwnership.CreateOwnership;
import ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership.DocumentsTab;
import ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership.OwnershipOverviewTab;
import ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership.SubjectTab;

public class TestTest extends BaseTest {

    @Test
    public void test(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.pressConfirmationButtn();
        loginPage.enterKeyInformation();

        ErrorMessagePage errorMessagePage = new ErrorMessagePage(driver);
        if (errorMessagePage.isError()){
            test();
        }

        LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
        leftSideMenu.pressRegistrationAndProcessingButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
               leftSideMenu.pressApplicationRegistrationButton();
        leftSideMenu.pressOwnershipButton();

        StatementDetails statementDetails = new StatementDetails(driver);
        statementDetails.pressTypeOfRegistrationList();
        statementDetails.pressTypeOfRegistrationListItem();
        statementDetails.pressOwnershipList();
        statementDetails.pressOwnershipListItem();
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
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
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

        //=====================================

        ApplicationPage applicationPage = new ApplicationPage(driver);
        applicationPage.closeWindow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //applicationPage.clickPerformTheActionButton();
        applicationPage.select();

        //===========================

        MakeDecisionPage makeDecisionPage = new MakeDecisionPage(driver);
        makeDecisionPage.clickTypeList();
        makeDecisionPage.selectTypeFromList();
        makeDecisionPage.clickSummitButton();

        DecisionPage decisionPage = new DecisionPage(driver);
        decisionPage.closeDocumentPage();
        String number = decisionPage.getDecisionNumber();
        //System.out.println(number);


        leftSideMenu.clickSectionRegistrationButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        leftSideMenu.clickCreateSectionButton();

        // ================================
        EnterDecisionNumberPage enterDecisionNumberPage = new EnterDecisionNumberPage(driver);
        enterDecisionNumberPage.enterDecisionNumber(number);
        enterDecisionNumberPage.checkInfo();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterDecisionNumberPage.addInfoFromApplication();
        enterDecisionNumberPage.clickContinueButton();
        enterDecisionNumberPage.clickContinueButton();


        EnterRealEstateAddressPage enterRealEstateAddressPage  = new EnterRealEstateAddressPage(driver);
        enterRealEstateAddressPage.clickOpenRealEstateBlockButton();
        enterRealEstateAddressPage.enterKoatuu("80000");
        enterRealEstateAddressPage.clickConfirmKoatuuButton();
        enterRealEstateAddressPage.openIsThisRealEstateFieldList();
        enterRealEstateAddressPage.selectYesListItem();
        enterRealEstateAddressPage.clickOkButton();
        enterRealEstateAddressPage.clickSectionRegistrationButton();
        enterRealEstateAddressPage.pressDoNotGoToApplicationButton();

        Section section = new Section(driver);
        //section.pressOwnershipButton();
        section.pressArrestButton();

        /*Ownership ownership = new Ownership(driver);
        ownership.pressRegistrationList();
        ownership.pressNewOwnershipListItem();*/

        Arrest arrest = new Arrest(driver);
        arrest.pressRegistrationList();
        arrest.pressNewArresrListItem();

        /*CreateOwnership createOwnership = new CreateOwnership(driver);
        createOwnership.enterIndexNumberOfSolutionField(number);
        createOwnership.pressVerifyButton();
        createOwnership.pressContinueBotton();*/

        CreatArrest creatArrest = new CreatArrest(driver);
        creatArrest.enterIndexNumberOfSolutionField(number);
        creatArrest.pressVerifyButton();
        creatArrest.pressContinueBotton();

        ArrestOverviewTab arrestOverviewTab = new ArrestOverviewTab(driver);
        arrestOverviewTab.pressArrestOverviewList();
        arrestOverviewTab.pressArrestTypeListItem();

        /*OwnershipOverviewTab ownershipOverviewTab = new OwnershipOverviewTab(driver);
        ownershipOverviewTab.pressOwnershipOverviewList();
        ownershipOverviewTab.pressPrivateOwnershipItem();

        SubjectTab subjectTab = new SubjectTab(driver);
        subjectTab.pressSubjectBotton();
        subjectTab.pressAddDocFromStatementBotton();
        subjectTab.pressFirstSubjectCheckBox();
        subjectTab.pressOkBotton();

        DocumentsTab documentsTab = new DocumentsTab(driver);
        documentsTab.openDocumentTab();
        documentsTab.pressDocumentsButton();
        documentsTab.pressFirstDocCheckBox();
        documentsTab.pressOkDocBotton();
        documentsTab.pressRegisterOwnershipButton();
        documentsTab.pressNoButton();
*/

    }

}
