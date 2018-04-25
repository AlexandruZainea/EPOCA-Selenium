package com.selenium.template.tests;


import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.frontend.ApplicationProcesses.ScheduledProcesses;
import com.selenium.template.pageObjects.frontend.FELeftMenu;
import com.selenium.template.pageObjects.frontend.FELoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class APScheduledProcessesTests extends DriverBase {

    private static final Logger log = Logger.getLogger(APScheduledProcessesTests.class);

    private static Wait<WebDriver> wait;

    private static WebDriver driver;

    @Test(groups = "Test")
    public void searchResults ()  {

//        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickApplicationProcesses();
        feLeftMenu.clickScheduledProcesses();

        ScheduledProcesses scheduledProcesses = new ScheduledProcesses(driver);

        scheduledProcesses.sendKeysSearchField();

        List<WebElement> firstColumnOfEachRow = driver.findElements(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr/td[1]"));
        System.out.println(firstColumnOfEachRow);

        String inputedValue = scheduledProcesses.getTextSearchField();

        for (int i = 0; i < firstColumnOfEachRow.size();i++) {
            Assert.assertTrue(firstColumnOfEachRow.get(i).getText().contains(inputedValue), "Search result validation failed at instance " + i + ".");
        }

    }

    @Test(groups = "Test")
    public void clickOnDetails1stRow () throws MalformedURLException {
        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickApplicationProcesses();
        feLeftMenu.clickScheduledProcesses();

        ScheduledProcesses scheduledProcesses = new ScheduledProcesses(driver);
        scheduledProcesses.clickJobDetails1stRow();
        Waiting.visibilityOfElement(driver, driver.findElement(By.xpath("//*[@id=\"job-modal\"]/div/div")), "job details stuff");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"job-modal\"]/div/div")).isDisplayed());



    }

    @Test(groups = "Test")
    public void changeStatus () throws MalformedURLException {
        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickApplicationProcesses();
        feLeftMenu.clickScheduledProcesses();

        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr[1]/td[8]")));

        ScheduledProcesses scheduledProcesses = new ScheduledProcesses(driver);
        String status = scheduledProcesses.getFirstRowStatusText();

        System.out.println(status);
        scheduledProcesses.clickToggleStatus();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"defaultSuccessModalContent\"]")));

        CommonTask.clickElement(driver, driver.findElement(By.xpath("//*[@id=\"defaultSuccessModalContent\"]")), "success banner");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr[1]/td[8]")));


        String updatedStatus = driver.findElement(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr[1]/td[8]")).getText();
        System.out.println(updatedStatus);

        Assert.assertNotEquals(updatedStatus,status);


    }

    @Test(groups = "Test")
    public void sortCheck () throws MalformedURLException {

        driver.manage().window().maximize();

        driver.get(TestData.customerSearchEN);

        FELoginPage feLoginPage = new FELoginPage(driver);

        feLoginPage.inputUsername(TestData.username);
        feLoginPage.inputPassword(TestData.password);
        feLoginPage.signIn();

        FELeftMenu feLeftMenu = new FELeftMenu(driver);
        feLeftMenu.clickApplicationProcesses();
        feLeftMenu.clickScheduledProcesses();

        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr[1]/td[8]")));

        ScheduledProcesses scheduledProcesses = new ScheduledProcesses(driver);

        List<WebElement> namesOfProcesses = new LinkedList<WebElement>();
        namesOfProcesses = driver.findElements(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr/td[1]"));

        LinkedList<String> textOnFirstColumn = new LinkedList<String>();

        for(int i = 0; i < namesOfProcesses.size(); i++) {
            String s = namesOfProcesses.get(i).getText();
            textOnFirstColumn.add(s.toLowerCase());
        }
        System.out.println("On page load order:" + textOnFirstColumn);

        Assert.assertTrue(CommonTask.chkAlphabeticalOrder(textOnFirstColumn));

        scheduledProcesses.clickSortByName();

        Waiting.elementToBeClickable(driver, driver.findElement(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr[1]/td[9]/div/a[3]")),"row 1 column9");

        scheduledProcesses.select25Entries();

        ArrayList<String> obtainedList = new ArrayList<String>();
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"jobs-table\"]/tbody/tr/td[1]"));
        for (WebElement we:elementList) {
            obtainedList.add(we.getText());
        }
        System.out.println("Obtained list:" + obtainedList);
        ArrayList<String> sortedList = new ArrayList<String>();
        for (String s:obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);

        Collections.reverse(sortedList);
        System.out.println("Sorted list:" + sortedList);
        Assert.assertTrue(sortedList.equals(obtainedList));

        driver.quit();
    }

}