package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.Customer.CustomerSearch;
import com.selenium.template.pageObjects.frontend.FELeftMenu;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.URL;


public class LanguageChange extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;

    private static WebDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        capabillities = DesiredCapabilities.chrome();

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabillities);

        capabillities.setBrowserName("chrome");

        wait = new WebDriverWait(driver, 6000);

    }

    @Test
    public void EnToRo () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        CustomerSearch customerSearch = new CustomerSearch(driver);
        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        FELoginPage feloginpage = new FELoginPage(driver);

        feloginpage.inputUsername (TestData.username);
        feloginpage.inputPassword (TestData.password);
        feloginpage.signIn();

        feLeftMenu.clickLanguageButton();

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, TestData.customerSearchRO);

        driver.quit();
    }
}
