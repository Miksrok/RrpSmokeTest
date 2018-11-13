package ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class SubjectTab extends MotherPage {

    @FindBy(xpath = "//span[text() = 'Суб’єкт']")
    private WebElement subjectButton;

    @FindBy(xpath = "//span[contains(text(),\"Додати із заяви\")]")
    private WebElement addDocFromStatementButton;

    @FindBy(xpath = "(//*[@class=\"x-grid-row-checker\"])[1]")
    private WebElement firstSubjectCheckBox;


   // @FindBy(xpath = "//span[(text() = \"ОК\")]")

    @FindBy(xpath = "//span[text() = 'ОК']/../../..")
    private WebElement okSubjBotton;


    public SubjectTab(WebDriver driver) {super(driver);}

    public void pressSubjectButton(){
        ActionsWithElements.init(driver).clickOnElement (subjectButton); }

    public void pressAddDocFromStatementButton(){
        ActionsWithElements.init(driver).clickOnElement (addDocFromStatementButton); }

    public void pressFirstSubjectCheckBox(){
        ActionsWithElements.init(driver).clickOnElement (firstSubjectCheckBox); }

    public void pressOkButton(){
        ActionsWithElements.init(driver).clickOnElement (okSubjBotton); }

}

