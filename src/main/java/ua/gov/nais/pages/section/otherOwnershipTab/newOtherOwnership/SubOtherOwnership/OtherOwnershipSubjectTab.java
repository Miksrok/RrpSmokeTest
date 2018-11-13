package ua.gov.nais.pages.section.otherOwnershipTab.newOtherOwnership.SubOtherOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class OtherOwnershipSubjectTab extends MotherPage {

    /*OtOw = other ownership*/

    @FindBy(xpath = "//span[contains(text(),\"Суб’єкт\")]")
    private WebElement otOwSubjectBotton;

    @FindBy(xpath = "//span[contains(text(),\"Додати із заяви\")]")
    private WebElement otOwAddDocFromStatementBotton;

    @FindBy(xpath = "(//*[@class=\"x-grid-row-checker\"])[1]")
    private WebElement otOwFirstSubjectCheckBox;

    @FindBy(xpath = "//span[(text() = \"ОК\")]")
    private WebElement otOwOkSubjBotton;

    public OtherOwnershipSubjectTab(WebDriver driver) {
        super(driver);
    }

    public void pressOtOwSubjectBotton() {
        ActionsWithElements.init(driver).clickOnElement(otOwSubjectBotton);
    }

    public void pressOtOwAddDocFromStatementBotton() {
        ActionsWithElements.init(driver).clickOnElement(otOwAddDocFromStatementBotton);
    }

    public void pressOtOwFirstSubjectCheckBox() {
        ActionsWithElements.init(driver).clickOnElement(otOwFirstSubjectCheckBox);
    }

    public void pressOtOwOkSubjBotton() {
        ActionsWithElements.init(driver).clickOnElement(otOwOkSubjBotton);
    }

}
