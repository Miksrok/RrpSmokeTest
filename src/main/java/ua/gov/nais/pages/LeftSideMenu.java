package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftSideMenu extends MotherPage{

    @FindBy (xpath = "//span[text() = 'Реєстрація та обробка заяв']")
    private WebElement registrationAndProcessingButton;

    @FindBy (xpath = "//span[text() = 'Реєстрація заяви']")
    private WebElement applicationRegistrationButton;

    @FindBy (xpath = "//span[text() = 'заява про реєстрацію права власності']")
    private WebElement ownershipButton;

    // check xpath
    @FindBy (xpath = "//span[text() = 'заява про реєстрацію iншого речового права']")
    private WebElement otherOwnershipButton;

    // check xpath
    @FindBy (xpath = "//span[text() = 'заява про реєстрацію обтяження']")
    private WebElement arrestButton;


    public LeftSideMenu(WebDriver driver) {
        super(driver);
    }

    public void pressRegistrationAndProcessingButton(){
        registrationAndProcessingButton.click();
    }
    public void pressApplicationRegistrationButton(){
        applicationRegistrationButton.click();
    }
    public void pressOwnershipButton(){
       ownershipButton.click();
    }


}
