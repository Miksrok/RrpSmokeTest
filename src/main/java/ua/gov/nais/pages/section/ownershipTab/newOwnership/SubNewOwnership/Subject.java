package ua.gov.nais.pages.section.ownershipTab.newOwnership.SubNewOwnership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;

public class Subject extends MotherPage {

    @FindBy(xpath = "//span[contains(text(),\"Суб’єкт\")]")
    private WebElement subjectBotton;

    @FindBy(xpath = "//span[contains(text(),\"Додати із заяви\")]")
    private WebElement addDocFromStatementBotton;

    @FindBy(xpath = "(//*[@class=\"x-grid-row-checker\"])[1]")
    private WebElement FirstSubjectCheckBox;

    @FindBy(xpath = "(//span[contains(text(),\"ОК\")])[3]")
    private WebElement OkBotton;

    public Subject(WebDriver driver) {super(driver);}

}

