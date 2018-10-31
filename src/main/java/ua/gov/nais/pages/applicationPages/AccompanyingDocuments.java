package ua.gov.nais.pages.applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class AccompanyingDocuments extends MotherPage {

    private final String NUMBER = "ТТ454544";
    private final String PUBLISHER = "Зірка Смерті 1448";

    @FindBy (xpath = "//span[contains(text(),'Супровідні документи')]")
    private WebElement accompanyingDocumentsButton;

    @FindBy (xpath = "//input[contains(@id,'1358')]")
    private WebElement addDocumentButton;

    @FindBy (xpath = "//input[contains(@id,'2448')]")
    private WebElement documentTypeList;

    @FindBy (xpath = "//li[contains(text(),'сертифікат ДАБІ')]")
    private WebElement certificateOfDABIlistItem;

    @FindBy (xpath = "//input[contains(@id,'1629')]")
    private WebElement numberField;

    @FindBy (xpath = "//input[contains(@id,'1631')]")
    private WebElement publisherField;

    public AccompanyingDocuments(WebDriver driver) { super(driver); }

    public void pressAccompanyingDocumentsButton(){
        ActionsWithElements.init(driver).clickOnElement (accompanyingDocumentsButton); }

    public void pressAddDocumentButton(){
        ActionsWithElements.init(driver).clickOnElement (addDocumentButton); }

    public void pressDocumentTypeList(){
        ActionsWithElements.init(driver).clickOnElement (documentTypeList); }

    public void pressCertificateOfDABIlistItem(){
        ActionsWithElements.init(driver).clickOnElement (certificateOfDABIlistItem); }

    public void enterNumberOfDoc(){
        ActionsWithElements.init(driver).enterTextInToInput(numberField, NUMBER); }

    public void enterPublisherInfo(){
        ActionsWithElements.init(driver).enterTextInToInput (publisherField, PUBLISHER); }

    }
