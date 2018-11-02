package ua.gov.nais.pages.createApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class StatementDetails extends MotherPage {

    @FindBy (xpath = "//span[contains(text(),'Відомості')]")
    private WebElement statementDetailsButton;

    @FindBy (xpath = "//div[contains(@id,'1840')]")
    private WebElement typeOfRegistrationList;

    @FindBy (xpath = "//li[contains(text(),'виникнення')]")
    private WebElement typeOfRegistrationListItem;

    @FindBy (xpath = "//div[contains(@id,'1852')]")
    private WebElement ownershipList;

    @FindBy (xpath = "//li[contains(text(),'державна')]")
    private WebElement ownershipListItem;

    public StatementDetails(WebDriver driver) { super(driver); }

    public void pressStatementDetailsButton(){
        ActionsWithElements.init(driver).clickOnElement (statementDetailsButton); }

    public void pressTypeOfRegistrationList(){
        ActionsWithElements.init(driver).clickOnElement (typeOfRegistrationList); }

    public void pressTypeOfRegistrationListItem(){
        ActionsWithElements.init(driver).clickOnElement (typeOfRegistrationListItem); }

    public void pressOwnershipList(){
        ActionsWithElements.init(driver).clickOnElement (ownershipList); }

    public void pressOwnershipListItem(){
        ActionsWithElements.init(driver).clickOnElement (ownershipListItem); }

}
