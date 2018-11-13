package ua.gov.nais.pages.section.arrestTab.newArrest.subNewArrest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import javax.swing.*;

public class ArrestSubjectTab extends MotherPage {


    @FindBy(xpath = "//span[text() = 'Суб’єкт']")
    private WebElement subjectButton;

    @FindBy(xpath = "//span[contains(text(),\"Додати із заяви\")]")
    private WebElement addSbjFromStatementButton;

    @FindBy(xpath = "(//*[@class=\"x-grid-row-checker\"])[1]")
    private WebElement firstSubjectCheckBox;

    @FindBy(xpath = "//span[text() = 'ОК']/../../..")
    private WebElement okSubjBotton;

    @FindBy(xpath = "(//fieldset/div/*/*/*/*/*/*/a)[1]")
    private WebElement openSubjectModalWindowButton;

    @FindBy(xpath = "//label[contains(text(), 'Роль')]/../../td[2]/*/*/*/td[2]/div")
    private WebElement openCloseRoleListButton;

    @FindBy(xpath = "//li[text() = 'Обтяжувач']")
    private WebElement roleEncumbrancer;

    @FindBy (xpath ="//span[text() = 'ОК']")
    private WebElement okButton;

    public ArrestSubjectTab(WebDriver driver) {
        super(driver);
    }

    public void pressSubjectButton() {
        ActionsWithElements.init(driver).clickOnElement(subjectButton);
    }

    public void pressAddSbjFromStatementButton() {
        ActionsWithElements.init(driver).clickOnElement(addSbjFromStatementButton);
    }

    public void pressFirstSubjectCheckBox() {
        ActionsWithElements.init(driver).clickOnElement(firstSubjectCheckBox);
    }

    public void pressOkSbjButton() {
        ActionsWithElements.init(driver).clickOnElement(okSubjBotton);
    }
    public void clickOpenSubjectModalWindowButton(){
        ActionsWithElements.init(driver).clickOnElement(openSubjectModalWindowButton);
    }
    public void clickOpenCloseRoleListButton(){
        ActionsWithElements.init(driver).clickOnElement(openCloseRoleListButton);
    }
    public void selectRole(){
        ActionsWithElements.init(driver).clickOnElement(roleEncumbrancer);
    }
    public void clickOkButton(){
        ActionsWithElements.init(driver).clickOnElement(okButton);
    }
}

