package ua.gov.nais.pages.section.ownershipTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class Ownership extends MotherPage {

    @FindBy (xpath = "//span[text() = 'Реєстрація']")
    private WebElement registrationList;

    @FindBy (xpath = "//span[text() = 'новий']")
    private WebElement newOwnershipListItem;

    public Ownership(WebDriver driver) {super(driver); }

    public void pressRegistrationList(){
        ActionsWithElements.init(driver).clicWithOffset(registrationList);
    }

    public void pressNewOwnershipListItem(){
        ActionsWithElements.init(driver).clickOnElement (newOwnershipListItem);
    }

}
