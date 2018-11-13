package ua.gov.nais.pages.section.otherOwnershipTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class OtherOwnership extends MotherPage {

    /*OtOw = other ownership*/

    @FindBy(xpath = "(//span[text() = 'Реєстрація'])[2]")
    private WebElement otOwRegistrationList;

    @FindBy (xpath = "//span[text() = 'новий']")
    private WebElement newOtherOwnershipListItem;

    public OtherOwnership(WebDriver driver) {super(driver); }

    public void pressOtOwRegistrationList(){
        ActionsWithElements.init(driver).clicWithOffset(otOwRegistrationList);
    }

    public void pressNewOtherOwnershipListItem(){
        ActionsWithElements.init(driver).clickOnElement (newOtherOwnershipListItem);
    }

}
