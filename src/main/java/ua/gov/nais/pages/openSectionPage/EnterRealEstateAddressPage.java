package ua.gov.nais.pages.openSectionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import javax.swing.*;
import java.util.List;


public class EnterRealEstateAddressPage extends MotherPage {

    //index = 0
    @FindBy (xpath = "//fieldset/div/*/*/*/*/*/*/a")
    private List<WebElement> openRealEstateBlockButton;

    @FindBy (xpath = "//label[text() = 'Код КОАТУУ']/../../td[2]/input")
    private WebElement koatuuField;

    @FindBy (xpath = "(//label[text() = 'Код КОАТУУ']/../../../../../a)[1]")
    private WebElement confirmKoatuuButton;

    @FindBy (xpath = "//label[text() = \"Об’єкт житлової нерухомості\"]/../../td[2]/*/*/*/*/input")
    private WebElement isThisRealEstateFieldList;

    @FindBy (xpath = "//li[text() = 'Так']")
    private WebElement yesListItem ;

    @FindBy (xpath = "(//span[text() = 'ОК']/../../..)[1]")
    private WebElement okButton;

    @FindBy (xpath = "//span[text() = 'Зареєструвати ОНМ']/../../..")
    private WebElement sectionRegistrationButton;

    @FindBy (xpath = "//span[text() = 'Ні']/../../..")
    private WebElement doNotGoToApplicationButton;


    public EnterRealEstateAddressPage(WebDriver driver) {
        super(driver);
    }

    public void clickOpenRealEstateBlockButton(){
        ActionsWithElements.init(driver).clickOnElement(openRealEstateBlockButton.get(0));
    }
    public void enterKoatuu(String number){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).enterTextInToInput(koatuuField, number);
    }
    public void clickConfirmKoatuuButton(){
        ActionsWithElements.init(driver).clickOnElement(confirmKoatuuButton);
    }
    public void openIsThisRealEstateFieldList(){
        ActionsWithElements.init(driver).clickOnElement(isThisRealEstateFieldList);
    }
    public void selectYesListItem(){
        ActionsWithElements.init(driver).clickOnElement(yesListItem);
    }
    public void clickOkButton(){
        ActionsWithElements.init(driver).clickOnElement(okButton);
    }
    public void clickSectionRegistrationButton(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).clickOnElement(sectionRegistrationButton);
    }
    public void pressDoNotGoToApplicationButton(){
        ActionsWithElements.init(driver).clickOnElement(doNotGoToApplicationButton);
    }
}
