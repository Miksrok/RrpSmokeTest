package ua.gov.nais.pages.section.arrestTab.newArrest.subNewArrest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class ArresrDocumentsTab extends MotherPage {

    @FindBy(xpath = "(//span[text() = 'Документи'])[2]")
    private WebElement documentTab;

    @FindBy(xpath = "(//span[text() = 'Додати документ з заяви'])[2]")
    private WebElement documentsButton;

    @FindBy(xpath = "(//*[@class=\"x-form-field x-form-checkbox x-form-cb\"])[3]")
    private WebElement firstDocCheckBox;

    @FindBy(xpath = "//span[text() = 'ОК']/../../..")
    private WebElement okDocBotton;

    public ArresrDocumentsTab(WebDriver driver) {
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

}
