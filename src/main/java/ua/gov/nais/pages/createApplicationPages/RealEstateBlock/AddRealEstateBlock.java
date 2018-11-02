package ua.gov.nais.pages.createApplicationPages.RealEstateBlock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.List;

public class AddRealEstateBlock extends MotherPage {

    @FindBy (xpath = "//label[contains(text(), \"Тип ОНМ\")]/../../td[2]/table/*/*/*/input")
    private WebElement typeList;

    @FindBy (xpath = "//li[contains(text(), \"квартира\")]")
    private WebElement apartmentItem;

    @FindBy (xpath = "//span[contains(text(), \"ОК\")]")
    //first element in list ([0] - index)
    private List<WebElement> okButton;


    public AddRealEstateBlock(WebDriver driver) {
        super(driver);
    }

    public void clickTypeList(){
        ActionsWithElements.init(driver).clickOnElement(typeList);
    }
    public void selectApartmentItem(){
        ActionsWithElements.init(driver).clickOnElement(apartmentItem);
    }
    public void clickOkButton(){
        ActionsWithElements.init(driver).clickOnElement(okButton.get(0));
    }
}
