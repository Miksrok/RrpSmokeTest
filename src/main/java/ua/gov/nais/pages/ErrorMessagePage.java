package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

public class ErrorMessagePage extends MotherPage{

    @FindBy (xpath = "//div[text() = 'Виникла невідома помилка. Зверніться, будь ласка, до адміністратора системи.']")
    private WebElement errorModalWindow;

    @FindBy (xpath = "//span[text() = 'Реєстрація та обробка заяв']")
    private WebElement leftMenuItem;

    public ErrorMessagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isError() {

        try{
            Thread.sleep(3000);
            boolean marker = wait.until(ExpectedConditions.and(
                    ExpectedConditions.not(ExpectedConditions.invisibilityOf(leftMenuItem)),
                    ExpectedConditions.elementToBeClickable(leftMenuItem)));
            if (marker) {
                return false;
            }
            return true;
        }catch (Exception e){
            return true;
        }



    }
}
