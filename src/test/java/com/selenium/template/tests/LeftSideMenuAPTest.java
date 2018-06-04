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


public class LeftSideMenuAPTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;





    @Test(groups = "Test")
    public void reportHistory () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickApplicationProcesses();
        WebElement repHistory = driver.findElement(By.cssSelector("#system > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!repHistory.isDisplayed()) {
            feLeftMenu.clickApplicationProcesses();
        }

        feLeftMenu.clickReportHistory();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.reportHistory);
        driver.quit();
    }

    @Test(groups = "Test")
    public void reportTemplates () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickApplicationProcesses();
        WebElement repHistory = driver.findElement(By.cssSelector("#system > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!repHistory.isDisplayed()) {
            feLeftMenu.clickApplicationProcesses();
        }

        feLeftMenu.clickReportTemplates();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.reportTemplates);
        driver.quit();
    }

    @Test(groups = "Test")
    public void scheduledProcesses () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

        driver.get(TestData.search);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickApplicationProcesses();
        WebElement repHistory = driver.findElement(By.cssSelector("#system > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a"));

        if (!repHistory.isDisplayed()) {
            feLeftMenu.clickApplicationProcesses();
        }

        feLeftMenu.clickScheduledProcesses();
        Assert.assertEquals(driver.getCurrentUrl(), TestData.scheduledProcesses);
        driver.quit();
    }
}
