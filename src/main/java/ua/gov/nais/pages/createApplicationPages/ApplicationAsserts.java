package ua.gov.nais.pages.createApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class ApplicationAsserts extends MotherPage {

    @FindBy(xpath = "//label[text() = 'Тип заяви:']/../label[4]")
    private WebElement applicationName;

    @FindBy(xpath = "//label[text() = 'Стан:']/../label[2]")
    private WebElement applicationState;


    public ApplicationAsserts(WebDriver driver) {
        super(driver);
    }

    public String getApplicationName(){
        return ActionsWithElements.init(driver).getTextFromElement(applicationName);
    }
    public String getApplicationState(){
        return ActionsWithElements.init(driver).getTextFromElement(applicationState);
    }

}
