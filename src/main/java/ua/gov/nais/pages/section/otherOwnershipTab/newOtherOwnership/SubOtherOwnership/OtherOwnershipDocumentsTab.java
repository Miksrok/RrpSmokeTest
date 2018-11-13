package ua.gov.nais.pages.section.otherOwnershipTab.newOtherOwnership.SubOtherOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class OtherOwnershipDocumentsTab extends MotherPage {

    @FindBy(xpath = "(//span[text() = 'Документи'])[2]")
    private WebElement otOwdocumentTab;

    @FindBy(xpath = "(//span[text() = 'Додати документ з заяви'])[2]")
    private WebElement addOtOwDocumentsButton;

    @FindBy(xpath = "(//*[@class=\"x-form-field x-form-checkbox x-form-cb\"])[7]")
    private WebElement otOwFirstDocCheckBox;

    @FindBy(xpath = "(//span[text() = 'ОК']/../../..)")
    private WebElement otOwOkDocBotton;

    public OtherOwnershipDocumentsTab(WebDriver driver) {
        super(driver);
    }

    public void pressOtOwdocumentTab() {
        ActionsWithElements.init(driver).clickOnElement(otOwdocumentTab);
    }

    public void pressAddOtOwDocumentsButton() {
        ActionsWithElements.init(driver).clickOnElement(addOtOwDocumentsButton);
    }

    public void pressOtOwFirstDocCheckBox() {
        ActionsWithElements.init(driver).clickOnElement(otOwFirstDocCheckBox);
    }

    public void pressOtOwOkDocBotton() {
        ActionsWithElements.init(driver).clickOnElement(otOwOkDocBotton);
    }
}
