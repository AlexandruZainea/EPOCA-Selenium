package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.FELeftMenu;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.URL;

public class LeftSideMenuCustomerTest extends DriverBase {

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
    public void customerSearch () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickCustomer();
        WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!search.isDisplayed()) {
            feLeftMenu.clickCustomer();
        }

        feLeftMenu.clickSearch();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.search);
        driver.quit();
    }

    @Test
    public void specialCommission () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickCustomer();
        WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!search.isDisplayed()) {
            feLeftMenu.clickCustomer();
        }

        feLeftMenu.clickSpecialCommission();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.specialCommission);
        driver.quit();
    }

    @Test
    public void vat () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickCustomer();
        WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!search.isDisplayed()) {
            feLeftMenu.clickCustomer();
        }

        feLeftMenu.clickVAT();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.vat);
        driver.quit();
    }

        @Test
        public void exchangeRate () throws Exception {

            driver.manage().window().maximize();

            driver.get(TestData.search);

            FELoginPage feLoginPage = new FELoginPage(driver);

            feLoginPage.inputUsername (TestData.username);
            feLoginPage.inputPassword (TestData.password);
            feLoginPage.signIn();

            FELeftMenu feLeftMenu = new FELeftMenu(driver);

            feLeftMenu.clickCustomer();
            WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

            if (!search.isDisplayed()) {
                feLeftMenu.clickCustomer();
            }

            feLeftMenu.clickExchangeRate();
            Assert.assertEquals(driver.getCurrentUrl(), TestData.exchangeRate);
            driver.quit();
        }

    @Test
    public void bulkCreditLimit () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!search.isDisplayed()) {
            feLeftMenu.clickCustomer();
        }

        feLeftMenu.clickBulkCreditLimit();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.bulkCreditLimit);
        driver.quit();
    }

    @Test
    public void setupCreditLimit () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickCustomer();
        WebElement search = driver.findElement(By.cssSelector("#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!search.isDisplayed()) {
            feLeftMenu.clickCustomer();
        }

        feLeftMenu.clickSetupCreditLimit();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.setupCreditLimit);
        driver.quit();
    }
}
