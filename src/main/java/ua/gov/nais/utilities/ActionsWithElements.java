package ua.gov.nais.utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithElements {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait20;
    private static ActionsWithElements obj;

    private ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait20 = new WebDriverWait(webDriver,20);
    }

    /**
     * Method Enter text in to input and textArea
     * @param input
     * @param text
     */
    public void enterTextInToInput(WebElement input, String text){
        try {
            input.click();
            input.clear();
            input.sendKeys(text);
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.p);
        }
    }

    /**
     * Method Click on elements on page
     * @param element
     */
    public void clickOnElement(WebElement element) {
        try {
            webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(element)));
            webDriverWait20.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Warning: Some exception");
           // webDriver.close();
        }
    }

    public static synchronized ActionsWithElements init(WebDriver driver){
        if (obj == null){
            obj = new ActionsWithElements(driver);
        }
        return obj;
    }
}
