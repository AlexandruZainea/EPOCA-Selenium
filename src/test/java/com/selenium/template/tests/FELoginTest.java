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

public class FELoginTest extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static DesiredCapabilities capabillities;



    @Test(groups = "Test")
    public void LoginSuccessful () throws Exception {
        WebDriver driver = getDriver();


        driver.get(TestData.loginPage);

        FELoginPage feloginpage = new FELoginPage(driver);

        feloginpage.inputUsername (TestData.username);
        feloginpage.inputPassword (TestData.password);
        feloginpage.signIn();

        Assert.assertEquals(feloginpage.getTitle(driver), TestData.customerSearchEN,  "Wrong Login Page");

        driver.quit();

    }
}
