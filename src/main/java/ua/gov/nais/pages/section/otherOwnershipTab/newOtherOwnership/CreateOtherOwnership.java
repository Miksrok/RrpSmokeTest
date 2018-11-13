package ua.gov.nais.pages.section.otherOwnershipTab.newOtherOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class CreateOtherOwnership extends MotherPage {

    /*OtOw = other ownership*/

    @FindBy(xpath = "//*[@name=\"rnNum\"]")
    private WebElement otOwIndexNumberOfSolutionField;

    @FindBy(xpath = "(//label[text() = 'Індексний номер рішення']/../../../../../a)[1]")
    private WebElement otOwverifyButton;

    @FindBy(xpath = "(//span[contains(text(), 'Продовжити')])[1]")
    private WebElement otOwContinueBotton;

    @FindBy(xpath = "//span[text() = 'Зареєструвати Інше речове право']/../../..")
    private WebElement registerOterOwnershipButton;

    @FindBy(xpath = "//span[text() ='Ні']/../../..")
    private WebElement noOtOwButton;

    public CreateOtherOwnership(WebDriver driver) {
        super(driver);
    }

    public void enterOtOwIndexNumberOfSolutionField(String number) {
        ActionsWithElements.init(driver).enterTextInToInput(otOwIndexNumberOfSolutionField, number);
    }

    public void pressOtOwverifyButton() {
        ActionsWithElements.init(driver).clickOnElement(otOwverifyButton);
    }

    public void pressOtOwcontinueBotton() {
        ActionsWithElements.init(driver).clickOnElement(otOwContinueBotton);
    }

    public void pressRegisterOterOwnershipButton() {
        ActionsWithElements.init(driver).clickOnElement(registerOterOwnershipButton);
    }

    public void pressNoOtOwButton() {
        ActionsWithElements.init(driver).clickOnElement(noOtOwButton);
    }
}
