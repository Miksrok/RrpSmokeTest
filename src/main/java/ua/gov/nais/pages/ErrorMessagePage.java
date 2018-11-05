package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ErrorMessagePage extends MotherPage{

    @FindBy (xpath = "//div[text() = 'Виникла невідома помилка. Зверніться, будь ласка, до адміністратора системи.']")
    private WebElement errorModalWindow;

    public ErrorMessagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isError(){
        try {
           return wait.until(ExpectedConditions.textToBePresentInElement(errorModalWindow, "Виникла невідома помилка. Зверніться, будь ласка, до адміністратора системи."));

        }catch (Exception e){
            return false;
        }

    }
}
