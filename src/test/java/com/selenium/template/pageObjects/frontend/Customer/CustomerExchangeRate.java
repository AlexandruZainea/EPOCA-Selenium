package com.selenium.template.pageObjects.frontend.Customer;

import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CustomerExchangeRate extends PageBase {
    public CustomerExchangeRate(WebDriver passedDriver) {
        super(passedDriver);
    }

    @FindBy (xpath = "//*[@id=\"customer-er_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"customer-er-historic\"]")
    private WebElement historyCheckbox;

    @FindBy (xpath = "//*[@id=\"customer-er_wrapper\"]/div[1]/div[2]/button")
    private WebElement addButton;

    @FindBy (xpath = "//*[@id=\"customer-er\"]")
    private WebElement exchangeRateTable;

    @FindBy (xpath = "//*[@id=\"customer-er\"]/tbody/tr[1]/td[5]/div/a[1]")
    private WebElement editOnFirstRow;

    @FindBy (xpath = "//*[@id=\"customer-er\"]/tbody/tr[1]/td[5]/div/a[2]")
    private WebElement deleteOnFirstRow;

    @FindBy (xpath = "//*[@id=\"customer-er_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"customer-er_next\"]/a")
    private WebElement nextButton;

    @FindBy (xpath = "//*[@id=\"customer-er\"]/tbody/tr[6]")
    private WebElement sixthRow;

    @FindBy (xpath = "//*[@id=\"customer-er-startDate\"]")
    private WebElement startDate;

    @FindBy (xpath = "/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement eigthJanuary;

    @FindBy (xpath = "//*[@id=\"customer-er-endDate\"]")
    private WebElement endDate;

    @FindBy (xpath = "/html/body/div[3]/div[1]/table/tbody/tr[5]/td[2]")
    private WebElement twentyNinth;

    @FindBy (xpath = "//*[@id=\"erValue\"]")
    private WebElement valueField;

    @FindBy (xpath = "//*[@id=\"addUpdateModal\"]/div/div/div[3]/button[1]")
    private WebElement saveButton;

    public void select250Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of elements");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"customer-er_length\"]/label/select")));
        dropdown.selectByValue("250");
    }

    public void waitForSixth () {
        Waiting.visibilityOfElement(driver, sixthRow, "6th Row");
    }




    public void addEntry () throws Exception {
        CommonTask.clickElement(driver, addButton, "add button");
        Waiting.visibilityOfElement(driver, startDate, "Start Date");

        CommonTask.clickElement(driver, startDate, "startdate");
        Waiting.visibilityOfElement(driver, eigthJanuary, "8th of January");

        CommonTask.clickElement(driver, eigthJanuary, "8thJanuary");

        CommonTask.clickElement(driver, endDate, "end date");
        Waiting.visibilityOfElement(driver, twentyNinth, "29th");
        CommonTask.clickElement(driver, twentyNinth,  "29th");

        Actions actions = new Actions(driver);
        actions.moveToElement(valueField);
        actions.click();
        actions.sendKeys("1.1");
        actions.build().perform();
        //Actions actions = new Actions(driver);

        //actions.sendKeys("1.1");

        CommonTask.clickElement(driver, saveButton, "save button");
    }

    public void showHistory () {
        if (historyCheckbox.isSelected() == false) {
            historyCheckbox.click();
        }
    }

}
