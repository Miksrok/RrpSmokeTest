package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.gov.nais.utilities.ActionsWithElements;

import java.awt.*;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_TAB;

public class LoginPage extends MotherPage{

    private final String LOGIN = "ki00cnp0020";
    private final String PASSWORD = "123456789";
    private final String URL = "https://register.test.nais.gov.ua/";

    @FindBy (xpath = "//input[@placeholder = 'Користувач']")
    private WebElement loginField;

    @FindBy (xpath = "//input[@placeholder = 'Пароль']")
    private WebElement passwordField;

    @FindBy (xpath = "//span[text() = 'Увійти']/../../..")
    private WebElement confirmationButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void openLoginPage(){
        driver.get(URL);
    }
    public void enterLogin(){
        ActionsWithElements.init(driver).enterTextInToInput(loginField, LOGIN);
/*wait.until(ExpectedConditions.elementToBeClickable(loginField));
        loginField.sendKeys(LOGIN);*/
    }
    public void enterPassword(){
        ActionsWithElements.init(driver).enterTextInToInput(passwordField, PASSWORD);
        /*passwordField.sendKeys(PASSWORD);*/
    }
    public void pressConfirmationButtn(){
        ActionsWithElements.init(driver).clickOnElement(confirmationButton);
        /*confirmationButton.click();*/
    }

    //Method creates robot for work with modal key-window and enter key data
    public void enterKeyInformation(){

        try {
            Thread.sleep(15000);
            Robot robot = new Robot();

            //go to password field
            robot.keyPress(VK_TAB );
            robot.keyRelease(VK_TAB);

            // Enter password
            robot.keyPress(VK_C );
            robot.keyPress(VK_E );
            robot.keyPress(VK_P );
            robot.keyPress(VK_SHIFT );
            robot.keyPress(VK_T );
            robot.keyRelease(VK_SHIFT );
            robot.keyPress(VK_W );
            robot.keyPress(VK_S );
            robot.keyPress(VK_1 );
            robot.keyPress(VK_3 );

            //go to "Ok" button
            robot.keyPress(VK_TAB );
            robot.keyRelease(VK_TAB);
            robot.keyPress(VK_TAB );
            robot.keyRelease(VK_TAB);
            robot.keyPress(VK_TAB );
            robot.keyRelease(VK_TAB);
            robot.keyPress(VK_TAB );
            robot.keyRelease(VK_TAB);

            //submit
            robot.keyPress(VK_ENTER);

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }

    }




}
