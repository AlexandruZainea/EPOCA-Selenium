package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class FELoginFailTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;

    private static WebDriver driver;

//    @BeforeClass
//    public void setup() throws Exception {
//        capabillities = DesiredCapabilities.chrome();
//
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabillities);
//
//        capabillities.setBrowserName("chrome");
//
//        wait = new WebDriverWait(driver, 6000);
//
//    }

    @Test(groups = "Test")
    public void loginFail_01() throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.loginPage);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername("sdasd");
        feLoginPage.inputPassword("sdasdsad");
        feLoginPage.signIn();
        Assert.assertEquals(feLoginPage.getAuthError(), TestData.AUTH_ERROR);
        Assert.assertEquals(feLoginPage.getCryptoMessage1(), TestData.CRYPTO_MESSAGE);


        driver.quit();
    }
}