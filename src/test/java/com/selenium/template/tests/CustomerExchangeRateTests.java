package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.Customer.CustomerExchangeRate;
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

public class CustomerExchangeRateTests extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;




    @Test(groups = "Test")
    public void addEntry () throws Exception{
        WebDriver driver = getDriver();
//        driver.manage().window().maximize();

        driver.get(TestData.exchangeRate);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickExchangeRate();

        CustomerExchangeRate exchangeRate = new CustomerExchangeRate(driver);

        exchangeRate.showHistory();
        exchangeRate.select250Entries();

        Thread.sleep(3000);

        List<WebElement> preRows = driver.findElements(By.xpath("//*[@id=\"customer-er\"]/tbody/tr"));
        int preCount = preRows.size();

        System.out.println(preCount);

        exchangeRate.addEntry();

        Thread.sleep(5000);


        List<WebElement> postRows = driver.findElements(By.xpath("//*[@id=\"customer-er\"]/tbody/tr"));
        int postCount = postRows.size();
        System.out.println(postCount);

        Assert.assertEquals(preCount+1, postCount);
        driver.quit();
    }
}
