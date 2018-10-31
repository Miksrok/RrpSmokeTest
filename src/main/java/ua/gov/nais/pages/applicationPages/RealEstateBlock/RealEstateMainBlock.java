package ua.gov.nais.pages.applicationPages.RealEstateBlock;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class RealEstateMainBlock extends MotherPage {


    @FindBy (xpath = "//span[contains(text(), \"Об’єкти нерухомого майна\")]")
    private WebElement realEstateBlook;

    @FindBy (xpath = "//*[@id=\"button-1243-btnInnerEl\"]")
    private WebElement addButton;

    @FindBy (xpath = "//span[contains(text(), \"Додати ОНМ\")]")
    private WebElement addRealEstateButton;

    @FindBy (xpath = "//span[contains(text(), \"Додати адресу ОНМ\")]")
    private WebElement addRealEstateAddressButton;


    public RealEstateMainBlock(WebDriver driver) {
        super(driver);
    }

    public void clickRealEstateBlook(){
        ActionsWithElements.init(driver).clickOnElement(realEstateBlook);
    }
    public void clickAddButton(){
        ActionsWithElements.init(driver).clickOnElement(addButton);
    }
    public void clicAddRealEstateButton(){
        ActionsWithElements.init(driver).clickOnElement(addRealEstateButton);
    }
    public void clickAddRealEstateAddressButton(){
        ActionsWithElements.init(driver).clickOnElement(addRealEstateAddressButton);
    }
}
