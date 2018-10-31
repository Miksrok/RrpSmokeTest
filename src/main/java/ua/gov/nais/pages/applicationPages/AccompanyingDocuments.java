package ua.gov.nais.pages.applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.List;

public class AccompanyingDocuments extends MotherPage {

    private final String NUMBER = "ТТ454544";
    private final String PUBLISHER = "Зірка Смерті 1448";

    @FindBy (xpath = "//span[contains(text(),'Супровідні документи')]/..")
    private WebElement accompanyingDocumentsButton;

    //ind = 5
    @FindBy (xpath = "//span[contains(text(),'Додати')]")
    private List<WebElement> addDocumentButton;

    // ind = 1
    @FindBy (xpath = "//label[contains(text(),'Тип документа')]/../../td[2]/*/*/*/td[2]")
    private List<WebElement> documentTypeList;

    @FindBy (xpath = "//li[contains(text(),'сертифікат ДАБІ')]")
    private WebElement certificateOfDABIlistItem;

    // ind = 6
    @FindBy (xpath = "//label[contains(text(),'Номер')]/../../td[2]/input")
    private List<WebElement> numberField;

    //ind = 2
    @FindBy (xpath = "//label[contains(text(),'Видавник')]/../../td[2]/*/*/*/*/input")
    private List<WebElement> publisherField;

    public AccompanyingDocuments(WebDriver driver) { super(driver); }

    public void pressAccompanyingDocumentsButton(){
        ActionsWithElements.init(driver).clickOnElement (accompanyingDocumentsButton); }

    public void pressAddDocumentButton(){
        ActionsWithElements.init(driver).clickOnElement (addDocumentButton.get(5)); }

    public void pressDocumentTypeList(){
        ActionsWithElements.init(driver).clickOnElement (documentTypeList.get(1)); }

    public void pressCertificateOfDABIlistItem(){
        ActionsWithElements.init(driver).clickOnElement (certificateOfDABIlistItem); }

    public void enterNumberOfDoc(){
        ActionsWithElements.init(driver).enterTextInToInput(numberField.get(6), NUMBER); }

    public void enterPublisherInfo(){
        ActionsWithElements.init(driver).enterTextInToInput (publisherField.get(2), PUBLISHER); }

    }
