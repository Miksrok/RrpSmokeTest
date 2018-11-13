package ua.gov.nais.pages.section.otherOwnershipTab.newOtherOwnership.SubOtherOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class OtherOwnershipOverviewTab extends MotherPage {

    /*OtOw = other ownership*/

    @FindBy(xpath = "//*[@name=\"dcIrpSort\"]")
    private WebElement otOwnershipOverviewList;

    @FindBy(xpath = "//li[contains(text(), 'право володіння')]")
    private WebElement rightOfOwnershipItem;

    @FindBy(xpath = "//*[@name=\"objectDescription\"]")
    private WebElement descriptionOfSubjectOfOtOwField;

    public OtherOwnershipOverviewTab(WebDriver driver) {
        super(driver);
    }

    public void pressOtOwnershipOverviewList() {
        ActionsWithElements.init(driver).clickOnElement(otOwnershipOverviewList);
    }

    public void pressRightOfOwnershipItem() {
        ActionsWithElements.init(driver).clickOnElement(rightOfOwnershipItem);
    }

    public void pressDescriptionOfSubjectOfOtOwField() {
        ActionsWithElements.init(driver).enterTextInToInput(descriptionOfSubjectOfOtOwField, "Автоматичне запонення значення опису предмета іншого речового права");
    }
}
