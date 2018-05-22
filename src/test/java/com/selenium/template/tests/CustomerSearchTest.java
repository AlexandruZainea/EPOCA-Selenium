package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.Customer.CustomerSearch;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.List;


public class CustomerSearchTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;




    @Test(groups = "Test")
    public void CustomerSearchClear () throws Exception{
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feloginpage = new FELoginPage(driver);


        feloginpage.inputUsername (TestData.username);
        feloginpage.inputPassword (TestData.password);
        feloginpage.signIn();

        CustomerSearch customerSearch = new CustomerSearch(driver);


        customerSearch.inputCustomerName();
        customerSearch.inputSalesChannel();
        customerSearch.clickClear();


        Assert.assertEquals(customerSearch.getCustomerNameSearchText(), "");

        driver.quit();
    }


    @Test(groups = "Test")
    public void GenerateReport () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);
        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        CustomerSearch customerSearch = new CustomerSearch(driver);
        customerSearch.clickGenerateReport();

        customerSearch.waitForDownload();
        WebElement downloadButton = driver.findElement(By.cssSelector("#reportDownloadDropdownMenu"));


        Assert.assertEquals(true, downloadButton.isDisplayed());

        driver.quit();
    }

//    @Test
//    public void downloadCSV () throws Exception {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get(TestData.customerSearchEN);
//
//        FELoginPage feLoginPage = new FELoginPage(driver);
//        feLoginPage.inputUsername(TestData.username);
//        feLoginPage.inputPassword(TestData.password);
//        feLoginPage.signIn();
//
//        CustomerSearch customerSearch = new CustomerSearch(driver);
//        customerSearch.clickGenerateReport();
//
//        customerSearch.waitForDownload();
//
//        customerSearch.clickDownloadCSV();
//
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//
//        driver.get(TestData.DOWNLOADS_TAB);
//
//
//
//
//
//        driver.quit();
//    }

    @Test(groups = "Test")
    public void selectEntries () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);
        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        CustomerSearch customerSearch = new CustomerSearch(driver);
        customerSearch.clickSearch();

        customerSearch.select25Entries();
        customerSearch.waitFor25th();

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customer-search\"]/tbody/tr"));
        int count = rows.size();
        System.out.println(count);
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"customer-search_length\"]/label/select")));
        int expectedRowCount = Integer.parseInt(dropdown.getFirstSelectedOption().getText());
        System.out.println(expectedRowCount);
        // = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"customer-search_length\"]/label/select/option[3]")).getText());
        Assert.assertEquals(count, expectedRowCount);



        driver.quit();

    }

}
