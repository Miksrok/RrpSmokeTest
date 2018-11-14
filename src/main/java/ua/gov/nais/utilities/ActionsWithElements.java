package ua.gov.nais.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ActionsWithElements {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait20;
    private static ActionsWithElements obj;

    private ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait20 = new WebDriverWait(webDriver, 20);
    }

    /**
     * Method Enter text in to input and textArea
     *
     * @param input
     * @param text
     */
    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.click();
            input.clear();
            input.sendKeys(text);
            String value = new String(text.getBytes("UTF-8"));
            String info = new String("текст = ".getBytes("UTF-8"));
            Reporter.log(String.format("[%-12s] ACTION: %s",
                    LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME),
                    input.getTagName() + " " + info + value));
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.p);
        }
    }

    /**
     * Method Click on elements on page
     *
     * @param element
     */
    public void clickOnElement(WebElement element) {
        try {
            webDriverWait20.until(ExpectedConditions.and(
                    ExpectedConditions.not(ExpectedConditions.invisibilityOf(element)),
                    ExpectedConditions.elementToBeClickable(element)
            ));

            String info = new String("натиснуто".getBytes("UTF-8"));
            String el = element.getTagName();

            element.click();

            Reporter.log(String.format("[%-12s] ACTION: %s",
                    LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME),
                    el + " " + info));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Warning: Some exception");
        }
    }

    public void clicWithOffset(WebElement element) {
        Actions action = new Actions(webDriver);

        action.moveToElement(element, 120, 0)
                .click()
                .build()
                .perform();
    }

    public void clickAfterDoubleMove(WebElement first, WebElement second) {
        Actions action = new Actions(webDriver);
        action.moveToElement(first)
                .pause(1)
                .moveToElement(second)
                .click()
                .build()
                .perform();
    }

    public String getTextFromElement(WebElement element){
        try{
            webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(element)));
            return element.getText();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }

    }

    public static synchronized ActionsWithElements init(WebDriver driver) {
        if (obj == null) {
            obj = new ActionsWithElements(driver);
        }
        return obj;
    }
}
