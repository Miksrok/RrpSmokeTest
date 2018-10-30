package ua.gov.nais.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public abstract class MotherPage {

    public WebDriver driver;
    WebDriverWait wait;

    public MotherPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

}
