package ua.gov.nais.pages.section;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class Section extends MotherPage {

    @FindBy(xpath = "(//span[contains(text(),'Оновити')])[1]")
    private WebElement updateButton;

    @FindBy(xpath = "//span[text() = 'Право власності']/../../..")
    private WebElement ownershipButton;


    @FindBy(xpath = "//span[text() = 'Інші речові права']/../../..")
    private WebElement otherOwnershipButton;

    @FindBy(xpath = "//span[text() = 'Обтяження']/../../..")
    private WebElement arrestButton;

    @FindBy(xpath = "(//span[text() = 'Виконати дію']/../span[2])[3]")
    private WebElement performTheActionButton;

    @FindBy (xpath = "//span[text() = 'Завершення відкриття розділу']")
    private WebElement endOfSectionOpeningButton;

    @FindBy (xpath = "//label[text() = 'Підстава']/../../textarea")
    private WebElement textareaForReason;

    @FindBy (xpath = "//span[text() = 'Продовжити']/../../..")
    private WebElement continueButton;

    @FindBy(xpath = "//span[text() = 'Ні']/../../..")
    private WebElement noButton;


    public Section(WebDriver driver) {
        super(driver);
    }

    public void pressUpdateButton() {
        ActionsWithElements.init(driver).clickOnElement(updateButton);
    }

    public void pressOwnershipButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(ownershipButton);
    }


    public void pressOtherOwnershipButton() {

        ActionsWithElements.init(driver).clickOnElement(ownershipButton);
    }

    public void pressArrestButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(arrestButton);
    }

    public void clickPerformTheActionButton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clicWithOffset(performTheActionButton);
    }
    public void clickEndOfSectionOpening(){
        ActionsWithElements.init(driver).clickOnElement(endOfSectionOpeningButton);
    }
    public void typeTextWithReason(){
        ActionsWithElements.init(driver).enterTextInToInput(textareaForReason,"reason");
    }
    public void pressContinueButton(){
        ActionsWithElements.init(driver).clickOnElement(continueButton);
    }
    public void pressNoButton(){
        ActionsWithElements.init(driver).clickOnElement(noButton);
    }
}
