package ua.gov.nais.pages.applicationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class ApplicationPage extends MotherPage {

    @FindBy(xpath = "//span[contains(text(), 'Виконати дію')]/../span[2]")
    private WebElement performTheActionButon;

    @FindBy(xpath = "//span[text() = 'Рішення']")
    private WebElement decision;

    @FindBy(xpath = "//span[text() = 'Прийняти рішення про державну реєстрацію']")
    private WebElement makeDecision;

    @FindBy(xpath = "//label[text() = 'Заява №:']/../label[2]")
    private WebElement applicationNumber;

    //===============
// tmp element =     ======= need to remove to other class
    @FindBy(xpath = "//span[text() = 'Перегляд документа']/../../div[4]")
    private WebElement closeModalWindowButton;


    public ApplicationPage(WebDriver driver) {
        super(driver);
    }

    public void select() {
        ActionsWithElements.init(driver).clicWithOffset(performTheActionButon);
        ActionsWithElements.init(driver).clickAfterDoubleMove(decision, makeDecision);
    }

    public void closeWindow() {
        ActionsWithElements.init(driver).clickOnElement(closeModalWindowButton);

    }

}
