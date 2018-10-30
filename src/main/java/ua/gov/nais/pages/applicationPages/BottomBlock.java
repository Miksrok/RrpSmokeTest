package ua.gov.nais.pages.applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

public class BottomBlock extends MotherPage {

    @FindBy (xpath = "//label[contains(text(),'Термін розгляду заяви')]")
    private WebElement applicationDeadlineList;

    @FindBy (xpath = "//li[contains(text(),'2 робочі дні')]")
    private WebElement twoBusinessDaysListItem;

    @FindBy (xpath = "//span[contains(text(),'Зареєструвати')]")
    private WebElement registerButton;

    @FindBy (xpath = "//span[contains(text(),'Відмінити')]")
    private WebElement alterButton;

    public BottomBlock(WebDriver driver) {
        super(driver);
    }

    public void pressApplicationDeadlineList(){
        ActionsWithElements.init(driver).clickOnElement (applicationDeadlineList); }
    public void pressTwoBusinessDaysListItem(){
        ActionsWithElements.init(driver).clickOnElement (twoBusinessDaysListItem); }
    public void pressRegisterButton(){
        ActionsWithElements.init(driver).clickOnElement (registerButton); }
    public void pressAalterButton(){
        ActionsWithElements.init(driver).clickOnElement (alterButton); }
}
