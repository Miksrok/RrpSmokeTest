package ua.gov.nais.pages.createApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.List;

public class PersonBlock extends MotherPage {

    @FindBy(xpath = "//span[contains(text(), \"Суб'єкт\")]")
    private WebElement personBlock;

    @FindBy(xpath = "//*[@id=\"button-1305\"]")
    //@FindBy (xpath = "//span[contains(text(), 'Додати')]/../../..")
    private WebElement addPersonButton;

    @FindBy(xpath = "//span[contains(text(), 'Фізична особа')]")
    private WebElement addPhisycalPersonButton;

    @FindBy(xpath = "//label[contains(text(), 'Роль')]")
    private WebElement roleList;

    @FindBy(xpath = "//li[contains(text(), 'Заявник')]")
    private WebElement applicantListItem;

    @FindBy(xpath = "//li[contains(text(), \"Суб’єкт права\")]")
    private WebElement personOfLawListItem;


    @FindBy(xpath = "//label[contains(text(), 'Роль')]/../../td[2]/*/*/*/td[2]/div")
    private WebElement closeRoleListButton;
    //*[@id="ext-gen2379"]

    @FindBy(xpath = "//label[contains(text(), 'ПІБ')]/../..//td[2]/input")
    private List<WebElement> fullNameField;

    //private By fullNameLocator = By.xpath("//label[contains(text(), 'ПІБ')]/../..//td[2]/input");

    //index = 3
    @FindBy(xpath = "//label[contains(text(), 'РНОКПП')]/../../td[2]/input")
    private List<WebElement> idField;

    @FindBy(xpath = "//label[contains(text(), 'Серія та номер')]/../../td[2]/input")
    private WebElement passportNumberField;

    @FindBy(xpath = "//label[contains(text(), 'Дата видачі')]/../../td[2]/*/*/*/*/input")
    private WebElement passportDateField;

    //ind = 0
    @FindBy(xpath = "//label[contains(text(), 'Видавник')]/../../td[2]/*/*/*/*/input")
    private List<WebElement> passportPublisherField;

    // ind = 2
    @FindBy(xpath = "//span[contains(text(), 'ОК')]")
    private List<WebElement> okButton;

    public PersonBlock(WebDriver driver) {
        super(driver);
    }

    public void clickPersonBlockButton() {
        ActionsWithElements.init(driver).clickOnElement(personBlock);
    }

    public void clickAddPersonButton() {
        ActionsWithElements.init(driver).clickOnElement(addPersonButton);
    }

    public void clickAddPhisycalPersonButton() {
        ActionsWithElements.init(driver).clickOnElement(addPhisycalPersonButton);
    }

    public void clickRoleList() {
        ActionsWithElements.init(driver).clickOnElement(roleList);
    }

    public void addApplicantItem() {
        ActionsWithElements.init(driver).clickOnElement(applicantListItem);
    }

    public void addPersonOfLaw() {
        ActionsWithElements.init(driver).clickOnElement(personOfLawListItem);
    }

    public void clickCloseRoleList() {
        ActionsWithElements.init(driver).clickOnElement(closeRoleListButton);
    }

    public void enterFullName(String name) {
        //List <WebElement> list = driver.findElements(fullNameLocator);
        ActionsWithElements.init(driver).enterTextInToInput(fullNameField.get(3), name);
    }

    public void enterId(String id) {
        ActionsWithElements.init(driver).enterTextInToInput(idField.get(3), id);
    }

    public void enterPassportNumber(String number) {
        ActionsWithElements.init(driver).enterTextInToInput(passportNumberField, number);
    }

    public void enterPassportDate(String date) {
        ActionsWithElements.init(driver).enterTextInToInput(passportDateField, date);
    }

    public void enterPassportPublisher(String publisher) {
        ActionsWithElements.init(driver).enterTextInToInput(passportPublisherField.get(0), publisher);
    }

    public void pressOkButton() {
        ActionsWithElements.init(driver).clickOnElement(okButton.get(2));
    }


}
