package ua.gov.nais.pages.section.arrestTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class Arrest extends MotherPage {

    @FindBy(xpath = "//span[text() = 'Реєстрація']")
    private WebElement registrationList;

    @FindBy (xpath = "//span[text() = 'новий']")
    private WebElement newArrestListItem;


    public Arrest(WebDriver driver) {
        super(driver);
    }

    public void pressRegistrationList(){
        ActionsWithElements.init(driver).clicWithOffset(registrationList);
    }

    public void pressNewArresrListItem(){
        ActionsWithElements.init(driver).clickOnElement (newArrestListItem);
    }
}
