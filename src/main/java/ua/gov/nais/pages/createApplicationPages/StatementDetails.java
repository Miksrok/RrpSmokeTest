package ua.gov.nais.pages.createApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import javax.swing.*;

public class StatementDetails extends MotherPage {

    @FindBy(xpath = "//span[contains(text(),'Відомості')]")
    private WebElement statementDetailsButton;

    @FindBy(xpath = "//label[text() = 'Вид реєстрації']/../../td[2]/*/*/*/*/input")
    private WebElement typeOfRegistrationList;

    @FindBy(xpath = "//li[contains(text(),'виникнення')]")
    private WebElement typeOfRegistrationListItem;

    //=======================
    @FindBy(xpath = "//label[text() = 'Форма власності']/../../td[2]/*/*/*/*/input")
    private WebElement ownershipList;

    @FindBy(xpath = "//li[contains(text(),'державна')]")
    private WebElement ownershipListItem;

    //=======================


    @FindBy(xpath = "//label[text() = 'Вид іншого речового права']/../../td[2]/*/*/*/*/input")
    private WebElement otherOwnershipList;

    @FindBy(xpath = "//li[contains(text(),'право володіння')]")
    private WebElement otherOwnersipListItem;

    //=====================

    @FindBy(xpath = "//label[text() = 'Вид обтяження']/../../td[2]/*/*/*/*/input")
    private WebElement arrestTypeList;

    @FindBy(xpath = "//li[contains(text(),'заборона на нерухоме майно')]")
    private WebElement arrestTypeListItem;


    public StatementDetails(WebDriver driver) {
        super(driver);
    }

    public void pressStatementDetailsButton() {
        ActionsWithElements.init(driver).clickOnElement(statementDetailsButton);
    }

    public void pressTypeOfRegistrationList() {
        ActionsWithElements.init(driver).clickOnElement(typeOfRegistrationList);
    }

    public void pressTypeOfRegistrationListItem() {
        ActionsWithElements.init(driver).clickOnElement(typeOfRegistrationListItem);
    }

    public void pressOwnershipList() {
        ActionsWithElements.init(driver).clickOnElement(ownershipList);
    }

    public void pressOwnershipListItem() {
        ActionsWithElements.init(driver).clickOnElement(ownershipListItem);
    }

    public void pressOtherOwnershipList() {
        ActionsWithElements.init(driver).clickOnElement(otherOwnershipList);
    }

    public void pressOtherOwnershipListItem() {
        ActionsWithElements.init(driver).clickOnElement(otherOwnersipListItem);
    }
    public void pressArrestTypeList(){
        ActionsWithElements.init(driver).clickOnElement(arrestTypeList);
    }
    public void pressArrestTypeListItem(){
        ActionsWithElements.init(driver).clickOnElement(arrestTypeListItem);
    }


}
