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

public class LeftsideMenuOMTest extends DriverBase {

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
    public void nettingTransactions () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickOrangeMoney();
        WebElement nettingTrans = driver.findElement(By.cssSelector("#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!nettingTrans.isDisplayed()) {
            feLeftMenu.clickOrangeMoney();
        }

        feLeftMenu.clickNettingTransactions();

        Assert.assertEquals(driver.getCurrentUrl(), TestData.nettingTransactions, "incorrect URL");

        driver.quit();
    }

    @Test
    public void nettingParameters () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickOrangeMoney();
        WebElement nettingTrans = driver.findElement(By.cssSelector("#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!nettingTrans.isDisplayed()) {
            feLeftMenu.clickOrangeMoney();
        }

        feLeftMenu.clickNettingParameters();

        Assert.assertEquals(driver.getCurrentUrl(), TestData.nettingParameters);
        driver.quit();
    }

    @Test
    public void documentMatching ()throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickOrangeMoney();
        WebElement nettingTrans = driver.findElement(By.cssSelector("#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!nettingTrans.isDisplayed()) {
            feLeftMenu.clickOrangeMoney();
        }

        feLeftMenu.clickDocumentMatching();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.documentMatching);
        driver.quit();
    }

    @Test
    public void nettingBalanceReport () throws Exception {

        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickOrangeMoney();
        WebElement nettingTrans = driver.findElement(By.cssSelector("#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!nettingTrans.isDisplayed()) {
            feLeftMenu.clickOrangeMoney();
        }

        feLeftMenu.clickNettingBalance();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.nettingBalanceReport);
        driver.quit();
    }
}
