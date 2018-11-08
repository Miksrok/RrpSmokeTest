package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.utilities.ActionsWithElements;

public class LeftSideMenu extends MotherPage{

    @FindBy (xpath = "//span[text() = 'Реєстрація та обробка заяв']")
    private WebElement registrationAndProcessingButton;

    @FindBy (xpath = "//span[text() = 'Реєстрація заяви']")
    private WebElement applicationRegistrationButton;

    @FindBy (xpath = "//span[text() = 'заява про реєстрацію права власності']")
    private WebElement ownershipButton;

    // check xpath
    @FindBy (xpath = "//span[text() = 'заява про реєстрацію іншого речового права']")
    private WebElement otherOwnershipButton;

    // check xpath
    @FindBy (xpath = "//span[text() = 'заява про реєстрацію обтяження']")
    private WebElement arrestButton;

    @FindBy (xpath = "//span[text() = 'Реєстрація та обробка розділів']")
    private WebElement sectionRegistrationButton;

    @FindBy (xpath = "//span[text() = 'Відкрити розділ']")
    private WebElement createSectionButton;


    public LeftSideMenu(WebDriver driver) {
        super(driver);
    }

    public void pressRegistrationAndProcessingButton(){
        ActionsWithElements.init(driver).clickOnElement (registrationAndProcessingButton);
    }
    public void pressApplicationRegistrationButton(){
        ActionsWithElements.init(driver).clickOnElement (applicationRegistrationButton);
    }
    public void pressOwnershipButton(){
        ActionsWithElements.init(driver).clickOnElement (ownershipButton);
    }
    public void pressOtherOwnershipButton(){
        ActionsWithElements.init(driver).clickOnElement(otherOwnershipButton);
    }
    public void pressArrestButton(){
        ActionsWithElements.init(driver).clickOnElement(arrestButton);
    }
    public void clickSectionRegistrationButton(){
        ActionsWithElements.init(driver).clickOnElement(sectionRegistrationButton);
    }
    public void clickCreateSectionButton(){
        ActionsWithElements.init(driver).clickOnElement(createSectionButton);
    }

}
