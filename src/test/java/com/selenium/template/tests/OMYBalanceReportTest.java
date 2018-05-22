package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.FELeftMenu;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import com.selenium.template.pageObjects.frontend.OrangeMoney.OMYBalanceReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class OMYBalanceReportTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;


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
    public void reportIsShown () throws Exception {
        WebDriver driver = getDriver();

//        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feloginpage = new FELoginPage(driver);

        feloginpage.inputUsername (TestData.username);
        feloginpage.inputPassword (TestData.password);
        feloginpage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickNettingBalance();

        OMYBalanceReport omyBalanceReport = new OMYBalanceReport(driver);

        omyBalanceReport.generateReport2();

        //Waiting.visibilityOfElement(driver, driver.findElement(By.cssSelector("#report-content-holder > table > thead > tr > th:nth-child(2)")),25);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"report-content-holder\"]/table"))));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"report-content-holder\"]/table")).isDisplayed());

        omyBalanceReport.clickShowFullScreen();

        String URL = driver.getCurrentUrl();

        Assert.assertEquals(URL, "http://10.1.11.107:9432/omy/matching/report/show/fullscreen");

        driver.quit();

    }
}
