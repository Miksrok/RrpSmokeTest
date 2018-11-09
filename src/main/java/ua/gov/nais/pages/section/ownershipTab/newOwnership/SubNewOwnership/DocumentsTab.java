package ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class DocumentsTab extends MotherPage {

    @FindBy(xpath = "(//span[text() = 'Документи'])[2]")
    private WebElement documentTab;

    @FindBy(xpath = "(//span[text() = 'Додати документ з заяви'])[2]")
    private WebElement documentsButton;

    @FindBy(xpath = "//*[@class=\"x-form-field x-form-checkbox x-form-cb\"]")
    private WebElement firstDocCheckBox;

    @FindBy(xpath = "(//span[text() = 'ОК']/../../..)[2]")
    private WebElement okDocBotton;

    @FindBy(xpath = "//span[text() = 'Зареєструвати Право власності']/../../..")
    private WebElement registerOwnershipButton;

    @FindBy(xpath = "//span[text() ='Ні']/../../..")
    private WebElement noButton;

    public DocumentsTab(WebDriver driver) {
        super(driver);
    }

    public void openDocumentTab() {
        ActionsWithElements.init(driver).clickOnElement(documentTab);
    }

    public void pressDocumentsButton() {
        ActionsWithElements.init(driver).clickOnElement(documentsButton);
    }

    public void pressFirstDocCheckBox() {
        ActionsWithElements.init(driver).clickOnElement(firstDocCheckBox);
    }

    public void pressOkDocBotton() {
        ActionsWithElements.init(driver).clickOnElement(okDocBotton);
    }

    public void pressRegisterOwnershipButton() {
        ActionsWithElements.init(driver).clickOnElement(registerOwnershipButton);
    }

    public void pressNoButton() {
        ActionsWithElements.init(driver).clickOnElement(noButton);
    }

}
