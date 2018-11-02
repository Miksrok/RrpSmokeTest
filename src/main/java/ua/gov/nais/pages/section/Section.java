package ua.gov.nais.pages.section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;

public class Section extends MotherPage {

    @FindBy(xpath = "(//span[contains(text(),'Оновити')])[1]")
    private WebElement updateButton;

    @FindBy(xpath = "//span[contains(text(),'Право власності')]")
    private WebElement propertyButton;

    public Section(WebDriver driver) {super(driver); }
}
