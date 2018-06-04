package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.FELeftMenu;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LeftsideMenuOMTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;




    @Test(groups = "Test")
    public void nettingTransactions () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

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

    @Test(groups = "Test")
    public void nettingParameters () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

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

    @Test(groups = "Test")
    public void documentMatching ()throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

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

    @Test(groups = "Test")
    public void nettingBalanceReport () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

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
