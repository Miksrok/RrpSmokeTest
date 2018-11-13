package ua.gov.nais.pages.createApplicationPages.RealEstateBlock;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.List;

public class RealEstateAddressBlock extends MotherPage {

    //index = 3
    @FindBy(xpath = "(//label[text() = 'Населений пункт']/../../td[2]/*/*/*/*/input)[3]")
    private WebElement cityField;
    @FindBy(xpath = "//span[text() = 'м.Київ']")
    private WebElement cityNameListItem;

    @FindBy(xpath = "(//label[text() = 'Вулиця']/../../td[2]/*/*/*/*/input)[3]")
    private WebElement streetField;
    @FindBy(xpath = "//span[text() = 'Антоновича']")
    private WebElement streetName;

    @FindBy(xpath = "(//fieldset//label[contains(text(), \"Тип\")]/../../td[2]/*/*/*/*/input)[4]")
    private WebElement buildingTypeList;
    @FindBy(xpath = "//span[text() = 'будинок']")
    private WebElement buildingListItem;
    @FindBy(xpath = "(//label[text() = '№']/../../td[2]/input)[9]")
    private WebElement buildingNumber;

    @FindBy(xpath = "(//label[text() = 'Тип номера']/../../td[2]/*/*/*/*/input)[3]")
    private WebElement apartmentTypeField;
    @FindBy(xpath = "//span[text() = 'квартира']")
    private WebElement apartmentTypeItem;
    @FindBy(xpath = "(//label[text() = '№']/../../td[2]/input)[11]")
    private WebElement apartmentNumber;

    @FindBy(xpath = "(//span[text() = 'ОК'])[2]")
    private WebElement okButton;

    public RealEstateAddressBlock(WebDriver driver) {
        super(driver);
    }

    public void typeCityName(String city) {
        ActionsWithElements.init(driver).enterTextInToInput(cityField, city);
    }

    public void selectCity() {
        ActionsWithElements.init(driver).clickOnElement(cityNameListItem);
    }

    public void enterStreet(String street) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).enterTextInToInput(streetField, street);
    }

    public void selectStreetName() {
        ActionsWithElements.init(driver).clickOnElement(streetName);
    }

    public void enterBuildingType(String type) {
        ActionsWithElements.init(driver).enterTextInToInput(buildingTypeList, type);
    }

    public void selectBuildingType() {
        ActionsWithElements.init(driver).clickOnElement(buildingListItem);
    }

    public void enterBuildingNumber(String number) {
        ActionsWithElements.init(driver).enterTextInToInput(buildingNumber, number);
    }

    public void enterApartmentType(String type) {
        ActionsWithElements.init(driver).enterTextInToInput(apartmentTypeField, type);
    }

    public void selectApartmentType() {
        ActionsWithElements.init(driver).clickOnElement(apartmentTypeItem);
    }

    public void enterApartmentNumber(String number) {
        ActionsWithElements.init(driver).enterTextInToInput(apartmentNumber, number);
    }

    public void clickOkButton() {
        ActionsWithElements.init(driver).clickOnElement(okButton);
    }


}
