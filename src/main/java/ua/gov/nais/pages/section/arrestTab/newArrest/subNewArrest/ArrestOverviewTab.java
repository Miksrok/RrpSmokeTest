package ua.gov.nais.pages.section.arrestTab.newArrest.subNewArrest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class ArrestOverviewTab extends MotherPage {

    @FindBy (xpath = "//input[@name = 'dcLmType']/../../td[2]/div")
    private WebElement arrestTypeList;


    @FindBy (xpath = "//li[contains(text(), 'заборона на нерухоме майно')]")
    private WebElement arrestTypeListItem;

    public ArrestOverviewTab(WebDriver driver) {
        super(driver);
    }

    public void pressArrestOverviewList(){
        ActionsWithElements.init(driver).clickOnElement (arrestTypeList); }

    public void pressArrestTypeListItem(){
        ActionsWithElements.init(driver).clickOnElement (arrestTypeListItem); }
}
