package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.Customer.CustomerVAT;
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

public class CustomerVATTest extends DriverBase {

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
    public void addAnEntry () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickVAT();

        CustomerVAT customerVAT = new CustomerVAT(driver);

        customerVAT.select25entries();

        List<WebElement> rowsPre = driver.findElements(By.xpath("//*[@id=\"vat-config\"]/tbody/tr"));
        int preAddValue = rowsPre.size();



        customerVAT.addEntry();

        List<WebElement> rowsPost = driver.findElements(By.xpath("//*[@id=\"vat-config\"]/tbody/tr"));
        int postAddValue = rowsPost.size();

        Assert.assertEquals(postAddValue, preAddValue+1);


        driver.quit();
    }


    @Test(groups = "Test")
    public void deleteEntry () throws Exception {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(TestData.specialCommission);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername (TestData.username);
        feLoginPage.inputPassword (TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickVAT();

        CustomerVAT customerVAT = new CustomerVAT(driver);

        customerVAT.select25entries();

        Thread.sleep(1000);

        List<WebElement> rowsPre = driver.findElements(By.xpath("//*[@id=\"vat-config\"]/tbody/tr"));
        int preAddValue = rowsPre.size();
        System.out.println(preAddValue);

        //Waiting.elementToBeClickable(driver, driver.findElement(By.xpath("//*[@id=\"vat-config\"]/tbody/tr[1]/td[5]/div/a[2]")));

        customerVAT.deleteEntry();

        Thread.sleep(5000);

        List<WebElement> rowsPost = driver.findElements(By.xpath("//*[@id=\"vat-config\"]/tbody/tr"));
        int postAddValue = rowsPost.size();
        System.out.println(postAddValue);

        Assert.assertEquals(postAddValue, preAddValue-1);

        driver.quit();
    }
}
