package ua.gov.nais.pages.decisionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class DecisionAsserts extends MotherPage {

    /*Тип рішення*/
    @FindBy(xpath = "//label[text() = 'про державну реєстрацію прав та їх обтяжень (з відкриттям розділу)']")
    private WebElement decisionType;

    /*Стан*/
    @FindBy(xpath = "//label[text() = 'зареєстровано']")
    private WebElement descisionState;

    public DecisionAsserts(WebDriver driver) {
        super(driver);
    }

    public String getDecisionType() {
        return ActionsWithElements.init(driver).getTextFromElement(decisionType);
    }

    public String getDescisionState() {
        return ActionsWithElements.init(driver).getTextFromElement(descisionState);
    }

}
