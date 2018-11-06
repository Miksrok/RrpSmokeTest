package ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class SubjectTab extends MotherPage {

    @FindBy(xpath = "//span[contains(text(),\"Суб’єкт\")]")
    private WebElement subjectBotton;

    @FindBy(xpath = "//span[contains(text(),\"Додати із заяви\")]")
    private WebElement addDocFromStatementBotton;

    @FindBy(xpath = "(//*[@class=\"x-grid-row-checker\"])[1]")
    private WebElement firstSubjectCheckBox;

    @FindBy(xpath = "(//span[contains(text(),\"ОК\")])[3]")
    private WebElement okSubjBotton;

    public SubjectTab(WebDriver driver) {super(driver);}

    public void pressSubjectBotton(){
        ActionsWithElements.init(driver).clickOnElement (subjectBotton); }

    public void pressAddDocFromStatementBotton(){
        ActionsWithElements.init(driver).clickOnElement (addDocFromStatementBotton); }

    public void pressFirstSubjectCheckBox(){
        ActionsWithElements.init(driver).clickOnElement (firstSubjectCheckBox); }

    public void pressOkBotton(){
        ActionsWithElements.init(driver).clickOnElement (okSubjBotton); }

}

