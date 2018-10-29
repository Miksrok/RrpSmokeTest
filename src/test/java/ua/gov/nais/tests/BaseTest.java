package ua.gov.nais.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final String CHROME_PATH = "src\\main\\resources\\chromedriver.exe";
    private final String EX_PATH = "src\\main\\resources\\1.0.0_0.crx";
    protected WebDriver driver;

    private WebDriver getDriver(String browser) {
        switch (browser){
            default:{
                System.setProperty("webdriver.chrome.driver", CHROME_PATH);
                return new ChromeDriver();
            }
        }
    }

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File(EX_PATH));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

}
