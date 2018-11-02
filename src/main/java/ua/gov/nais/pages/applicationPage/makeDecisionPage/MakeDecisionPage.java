package ua.gov.nais.pages.applicationPage.makeDecisionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class MakeDecisionPage extends MotherPage {

    @FindBy (xpath = "//label[text() = 'Тип']/../../td[2]/*/*/*/*/input")
    private WebElement typeList;

    @FindBy (xpath = "//li[text() = 'про державну реєстрацію прав та їх обтяжень (з відкриттям розділу)']")
    private WebElement typeListItem;

    @FindBy (xpath = "//span[text() = 'Зареєструвати']/../..")
    private WebElement submitButton;

    public MakeDecisionPage(WebDriver driver) {
        super(driver);
    }

    public void clickTypeList(){
        ActionsWithElements.init(driver).clickOnElement(typeList);
    }
    public void selectTypeFromList(){
        ActionsWithElements.init(driver).clickOnElement(typeListItem);
    }
    public void clickSummitButton(){
        ActionsWithElements.init(driver).clickOnElement(submitButton);
    }

}
