package ua.gov.nais.pages.openSectionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class EnterDecisionNumberPage extends MotherPage {

    @FindBy (xpath = "//label[text() = 'Індексний номер рішення']/../../td[2]/input")
    private WebElement enterDecisionNumberField;

    public EnterDecisionNumberPage(WebDriver driver) {
        super(driver);
    }

    public void enterDecisionNumber(String number){
        ActionsWithElements.init(driver).enterTextInToInput(enterDecisionNumberField, number);
    }

}
