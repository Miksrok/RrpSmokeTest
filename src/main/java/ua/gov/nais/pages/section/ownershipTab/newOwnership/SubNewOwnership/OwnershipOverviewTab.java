package ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class OwnershipOverviewTab extends MotherPage {

    @FindBy(xpath = "//*[@name=\"dcPrType\"]")
    private WebElement ownershipOverviewList;

    @FindBy (xpath = "//li[contains(text(), 'приватна')]")
    private WebElement privateOwnershipItem;

    public OwnershipOverviewTab(WebDriver driver) {super(driver);}

    public void pressOwnershipOverviewList(){
        ActionsWithElements.init(driver).clickOnElement (ownershipOverviewList); }

    public void pressPrivateOwnershipItem(){
        ActionsWithElements.init(driver).clickOnElement (privateOwnershipItem); }

}
