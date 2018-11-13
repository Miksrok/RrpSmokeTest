package ua.gov.nais.pages.section.arrestTab.newArrest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class CreatArrest extends MotherPage {

    @FindBy(xpath = "//*[@name=\"rnNum\"]")
    private WebElement indexNumberOfSolutionField;

    @FindBy(xpath = "(//label[text() = 'Індексний номер рішення']/../../../../../a)[1]")
    private WebElement verifyButton;

    @FindBy(xpath = "//span[text() = 'Продовжити >>']/../../..")
    private WebElement continueBotton;

    @FindBy(xpath = "//span[text() = 'Зареєструвати Обтяження']/../../..")
    private WebElement createArrestButton;

    @FindBy(xpath = "//span[text() = 'Ні']/../../..")
    private WebElement noButton;

    public CreatArrest(WebDriver driver) {
        super(driver);
    }

    public void enterIndexNumberOfSolutionField(String number) {
        ActionsWithElements.init(driver).enterTextInToInput(indexNumberOfSolutionField, number);
    }

    public void pressVerifyButton() {
        ActionsWithElements.init(driver).clickOnElement(verifyButton);
    }

    public void pressContinueBotton() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(continueBotton);
    }

    public void pressCreateArrestButton() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(createArrestButton);
    }
    public void pressNoButton(){
        ActionsWithElements.init(driver).clickOnElement(noButton);
    }

}
