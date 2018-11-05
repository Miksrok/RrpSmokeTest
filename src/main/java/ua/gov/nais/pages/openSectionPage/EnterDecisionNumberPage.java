package ua.gov.nais.pages.openSectionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.List;

public class EnterDecisionNumberPage extends MotherPage {

    @FindBy (xpath = "//label[text() = 'Індексний номер рішення']/../../td[2]/input")
    private WebElement enterDecisionNumberField;

    //index = 0 (check button), ind = 2 (addFromApplication)
    @FindBy (xpath = "//label[text() = 'Індексний номер рішення']/../../../../../a")
    private List<WebElement> checkButtons;

    @FindBy (xpath = "//span[text() = 'Продовжити >>']/../../..")
    private WebElement continueButton;




    public EnterDecisionNumberPage(WebDriver driver) {
        super(driver);
    }

    public void enterDecisionNumber(String number){
        ActionsWithElements.init(driver).enterTextInToInput(enterDecisionNumberField, number);
    }

    public void checkInfo(){
        ActionsWithElements.init(driver).clickOnElement(checkButtons.get(0));
    }

    public void addInfoFromApplication(){
        ActionsWithElements.init(driver).clickOnElement(checkButtons.get(2));
    }

    public void clickContinueButton(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(continueButton);
    }

}
