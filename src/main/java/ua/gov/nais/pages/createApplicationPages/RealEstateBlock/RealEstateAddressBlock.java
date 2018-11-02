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
    @FindBy (xpath = "//label[contains(text(), \"Населений пункт\")]/../../td[2]/*/*/*/*/input")
    private List<WebElement> cityField;

    //index = 2
    @FindBy (xpath = "//label[contains(text(), \"Вулиця\")]/../../td[2]/*/*/*/*/input")
    private List<WebElement> streetField;

    //index = 3
    @FindBy (xpath = "//fieldset//label[contains(text(), \"Тип\")]/../../td[2]/*/*/*/*/input")
    private List<WebElement> buildingTypeList;

    //index = enterBuildingNumber (8) and  enterApartmentNumber (10)
    @FindBy (xpath = "//label[contains(text(), \"№\")]/../../td[2]/input")
    private List<WebElement> numbersList;

    //index = 2
    @FindBy (xpath = "//label[contains(text(), \"Тип номера\")]/../../td[2]/*/*/*/*/input")
    private List<WebElement> apartmentTypeList;

    //index = 1
    @FindBy (xpath = "//span[contains(text(), \"ОК\")]")
    private List<WebElement> okButton;



    public RealEstateAddressBlock(WebDriver driver) {
        super(driver);
    }

    public void enterCity(String city){
        ActionsWithElements.init(driver).enterTextInToInput(cityField.get(3), city);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cityField.get(3).sendKeys(Keys.ENTER);
    }
    public void enterStreet(String street){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ActionsWithElements.init(driver).enterTextInToInput(streetField.get(2), street);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        streetField.get(2).sendKeys(Keys.ENTER);
    }
    public void selectBuildingType(String type){
        ActionsWithElements.init(driver).enterTextInToInput(buildingTypeList.get(3), type);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buildingTypeList.get(3).sendKeys(Keys.ENTER);
    }
    public void enterBuildingNumber(String number){

        ActionsWithElements.init(driver).enterTextInToInput(numbersList.get(8), number);
    }
    public void selectApartmentType(String type){
        ActionsWithElements.init(driver).enterTextInToInput(apartmentTypeList.get(2), type);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        apartmentTypeList.get(2).sendKeys(Keys.ENTER);
    }
    public void enterApartmentNumber(String number){
        ActionsWithElements.init(driver).enterTextInToInput(numbersList.get(10), number);
    }
    public void clickOkButton(){
        ActionsWithElements.init(driver).clickOnElement(okButton.get(1));
    }



}
