package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



@Epic("Login")
@Feature("Login actions")
public class TestTheTest extends DriverBase {

    @Story("ARO-12")
    @Test(groups = "Test")
    @Description("First test that verifies 1")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("ARO-1233")
    public void Test_01() throws Exception {

        WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");
        driver.findElement(By.id("lst-ib")).sendKeys("sometjhing");

        Assert.assertTrue(true);

    }

    @Story("ARO-12")
    @Test(groups = "Test")
    @Description("Second test verifies 2")
    @Severity(SeverityLevel.TRIVIAL)
    @Issue("ARO-1233")
    public void Test_02() throws Exception {

        WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");
        driver.findElement(By.id("lst-ib")).sendKeys("sometjhing");

        Assert.assertTrue(true);
    }

    @Story("ARO-13")
    @Test(groups = "Test")
    @Description("Second test verifies 2")
    @Severity(SeverityLevel.TRIVIAL)
    @Issue("ARO-1233")
    public void Test_03() throws Exception {

        WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");
        driver.findElement(By.id("lst-ib")).sendKeys("sometjhing");

        Assert.assertTrue(true);
    }


    @Story("ARO-13")
    @Test(groups = "Test")
    @Description("Second test verifies 2")
    @Severity(SeverityLevel.TRIVIAL)
    @Issue("ARO-1233")
    public void Test_04() throws Exception {

        WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");
        driver.findElement(By.id("lst-ib")).sendKeys("sometjhing");

        Assert.assertTrue(true);
    }
}


