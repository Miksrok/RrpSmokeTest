package ua.gov.nais.pages.decisionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class DecisionPage extends MotherPage {

    @FindBy(xpath = "//span[text() = 'Перегляд документа']/../../div[4]")
    private WebElement closeModalWindow;

    @FindBy(xpath = "//label[text() = 'Рішення №:']/../../../../../div[2]/*/*/*/label[1]")
    private WebElement decisionNumber;

    public DecisionPage(WebDriver driver) {
        super(driver);
    }

    public void closeDocumentPage() {
        ActionsWithElements.init(driver).clickOnElement(closeModalWindow);
    }

    public String getDecisionNumber() {
        String number = decisionNumber.getText();
        return number;
    }
}
