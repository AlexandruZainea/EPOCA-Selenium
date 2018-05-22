package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.Log4Test;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.Customer.CustomerSpecial;
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

import java.util.List;

public class CustomerSpecialTest extends DriverBase {

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
    public void addPopUp () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickSpecialCommission();

        CustomerSpecial customerSpecial = new CustomerSpecial(driver);


        customerSpecial.clickAddButton();

        WebElement popUp = driver.findElement(By.cssSelector("#special-commission-modal > div.modal-dialog.modal-lg > div.modal-content > div.modal-header > h4.modal-title"));

        Assert.assertEquals(true, popUp.isDisplayed());

        driver.quit();
    }

    @Test(groups = "Test")
    public void numberOfEntries() throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickSpecialCommission();

        CustomerSpecial customerSpecial = new CustomerSpecial(driver);

        Log4Test.info("Selecting 10 entries");
        customerSpecial.select10Entries();

        customerSpecial.waitForTenth();


        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"special-commission\"]/tbody/tr"));
        int count = rows.size();
        int expectedRowCount = 10;
        Assert.assertEquals(count, expectedRowCount);


        driver.quit();
    }

    @Test(groups = "Test")
    public void nextPage () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickSpecialCommission();

        CustomerSpecial customerSpecial = new CustomerSpecial(driver);

        customerSpecial.clickNextButton();

        customerSpecial.waitForPrevious();

        String showingEntries = driver.findElement(By.xpath("//*[@id=\"special-commission_info\"]")).getText();


        Assert.assertEquals(showingEntries,"Showing data from 6 to 10");


        driver.quit();


    }

    @Test(groups = "Test")
    public void addEntry () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);

        feLeftMenu.clickSpecialCommission();

        CustomerSpecial customerSpecial = new CustomerSpecial(driver);
        customerSpecial.select25Entries();
        customerSpecial.waitForTenth();

        List<WebElement> preRows = driver.findElements(By.xpath("//*[@id=\"special-commission\"]/tbody/tr"));
        int preCount = preRows.size();
        System.out.println(preCount);

        customerSpecial.addEntry();

        Thread.sleep(5000);

        List<WebElement> postRows = driver.findElements(By.xpath("//*[@id=\"special-commission\"]/tbody/tr"));
        int postCount = postRows.size();
        System.out.println(postCount);

        Assert.assertEquals(postCount, preCount+1);


        driver.quit();


    }
}

