package ua.gov.nais.pages.section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class Section extends MotherPage {

    @FindBy(xpath = "(//span[contains(text(),'Оновити')])[1]")
    private WebElement updateButton;

    @FindBy(xpath = "//span[contains(text(),'Право власності')]")
    private WebElement ownershipButton;

    public Section(WebDriver driver) {super(driver); }

    public void pressUpdateButton(){
        ActionsWithElements.init(driver).clickOnElement (updateButton); }

    public void pressOwnershipButton(){
        ActionsWithElements.init(driver).clickOnElement (ownershipButton); }


}
