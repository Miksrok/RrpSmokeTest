package ua.gov.nais.pages.section.ownershipTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class Ownership extends MotherPage {

    @FindBy (xpath = "(//span[contains(text(), 'Реєстрація')])[4]")
    private WebElement registrationList;

    @FindBy (xpath = "//span[contains(text(), 'новий')]")
    private WebElement newOwnershipListItem;

    public Ownership(WebDriver driver) {super(driver); }

    public void pressRegistrationList(){
        ActionsWithElements.init(driver).clickOnElement (registrationList); }

    public void pressNewOwnershipListItem(){
        ActionsWithElements.init(driver).clickOnElement (newOwnershipListItem); }

}
