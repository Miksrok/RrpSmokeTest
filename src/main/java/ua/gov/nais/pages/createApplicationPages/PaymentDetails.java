package ua.gov.nais.pages.createApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class PaymentDetails extends MotherPage {

    @FindBy (xpath = "//span[contains(text(),'Реквізити оплати')]")
    private WebElement paymentdDetailsButton;

    @FindBy (xpath = "//*[@id=\"button-1315\"]")
    private WebElement addPaymentButton;

    @FindBy (xpath = "//label[contains(text(),'Тип оплати')]")
    private WebElement typeOfpaymentList;

    @FindBy (xpath = "//li[contains(text(),'Адміністративний збір за реєстраційні дії')]")
    private WebElement feeForRegistrationActionsListItem;

    @FindBy (xpath = "//li[contains(text(),'Адміністративний збір за надання інформації')]")
    private WebElement feeForProvidingInformationListItem;

    @FindBy (xpath = "//*[@id=\"radiofield-1321-inputEl\"]")
    private WebElement reasonRadioButton;

    @FindBy (xpath = "//input[contains(@id,'1329')]")
    private WebElement reasonList;

    @FindBy (xpath = "//li[contains(text(),'за заявою/запитом Національного банку України')]")
    private WebElement atTheRequestOfTheNBUListItem;

    @FindBy (xpath = "//span[contains(text(),'Застосувати')]/../..")
    private WebElement applyButton;


    public PaymentDetails(WebDriver driver) { super(driver); }

    public void pressPaymentdDetailsButton(){
        ActionsWithElements.init(driver).clickOnElement (paymentdDetailsButton); }

    public void pressAdditionOfPaymentButton(){
        ActionsWithElements.init(driver).clickOnElement (addPaymentButton); }

    public void pressTypeOfpaymentList(){
        ActionsWithElements.init(driver).clickOnElement (typeOfpaymentList); }

    public void pressFeeForRegistrationActionsListItem(){
        ActionsWithElements.init(driver).clickOnElement (feeForRegistrationActionsListItem); }

    public void pressFeeForProvidingInformationListItem(){
        ActionsWithElements.init(driver).clickOnElement (feeForProvidingInformationListItem); }

        public void pressReasonRadioButton(){
        ActionsWithElements.init(driver).clickOnElement(reasonRadioButton);
        }

    public void pressReasonList(){
        ActionsWithElements.init(driver).clickOnElement (reasonList); }

    public void pressAtTheRequestOfTheNBUListItem(){
        ActionsWithElements.init(driver).clickOnElement (atTheRequestOfTheNBUListItem); }

    public void pressApplyButton(){
        ActionsWithElements.init(driver).clickOnElement (applyButton); }

}
