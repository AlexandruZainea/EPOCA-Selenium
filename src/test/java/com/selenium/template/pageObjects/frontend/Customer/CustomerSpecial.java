package com.selenium.template.pageObjects.frontend.Customer;

import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CustomerSpecial extends PageBase {


    public CustomerSpecial(WebDriver passedDriver) {
        super(passedDriver);
    }

    @FindBy (css ="#special-commission_wrapper > div:nth-of-type(2) > div")
    private WebElement commisionTable;

    @FindBy (css = "button.btn.btn-sm.button-important")
    private WebElement addButton;

    @FindBy (xpath = "//*[@id=\"name\"]")
    private WebElement nameSpecialCommission;

    @FindBy (xpath = "//*[@id=\"value\"]")
    private WebElement valueSpecialCommission;

    @FindBy (xpath = "//*[@id=\"memoDetail\"]")
    private WebElement memoDetail;

    @FindBy (xpath = "//*[@id=\"invoicingMethod\"]")
    private WebElement billingType;

    @FindBy (xpath = "//*[@id=\"special-commission_next\"]")
    private WebElement nextButton;

    public void clickNextButton () {
        CommonTask.moveToElement(driver, nextButton, "next button");
        CommonTask.clickElement(driver, nextButton, "next button");
    }

    @FindBy (xpath = "//*[@id=\"special-commission_previous\"]/a")
    private WebElement previousButton;

    @FindBy (id = "special-commission_length")
    private WebElement numberOfEntries;

    @FindBy (css = "#special-commission > tbody > tr:nth-child(10)")
    private WebElement tenthRow;

    @FindBy (css = " #special-commission > tbody > tr:nth-child(25)")
    private WebElement twentyfifthRow;

    @FindBy (css = " #special-commission > tbody > tr:nth-child(50)")
    private WebElement fifthyRow;

    @FindBy (css = " #special-commission > tbody > tr:nth-child(100)")
    private WebElement oneHundredRow;

    @FindBy (css = " #special-commission > tbody > tr:nth-child(250)")
    private WebElement twoFiftyRow;

    @FindBy (css = "#special-commission-modal > div.modal-dialog.modal-lg > div.modal-content > div.modal-header > h4.modal-title")
    private WebElement scPopupTitle;

    @FindBy (xpath = "//*[@id=\"special-commission-modal\"]/div/div/div[3]/button[2]")
    private WebElement saveButton;

    @FindBy (xpath = "//*[@id=\"special-commission\"]/tbody/tr[1]/td[7]/div/a[2]")
    private WebElement editLineOne;

    @FindBy (xpath = "//*[@id=\"rule\"]")
    private WebElement ruleInput;




    public void addEntry () {
        CommonTask.moveToElement(driver, addButton, "add button");
        CommonTask.clickElement(driver, addButton, "addbutton");

        Waiting.visibilityOfElement(driver, nameSpecialCommission,"special commission");

        CommonTask.clickElement(driver, nameSpecialCommission, "name special commission");
        CommonTask.sendKeys(nameSpecialCommission, "specialTest", "Name Special Commission");

        CommonTask.moveToElement(driver, valueSpecialCommission, "Value Special Commission");
        CommonTask.clickElement(driver, valueSpecialCommission, "value special commission");
        CommonTask.sendKeys(valueSpecialCommission, "7", "Special Commission Value");


        CommonTask.clickElement(driver, billingType, "billing type");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"invoicingMethod\"]")));
        dropdown.selectByValue("NONE");
        CommonTask.clickElement(driver, ruleInput,"rule input");
        CommonTask.sendKeys(ruleInput, "none", "Rule input");

        CommonTask.clickElement(driver, saveButton, "save button");

    }



    public void clickAddButton () {
        CommonTask.moveToElement(driver, addButton, "add button");
        CommonTask.clickElement(driver, addButton, "add button");
    }

    public void select5Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("5");
    }

    public void select10Entries () {
        CommonTask.clickElement(driver, numberOfEntries,"number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("10");
    }

    public void waitForTenth () {
        Waiting.visibilityOfElement(driver, tenthRow, "10th row");}

    public void select25Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("25");
    }

    public void waitFor25th () {
        Waiting.visibilityOfElement(driver, twentyfifthRow, "25th row");}

    public void select50Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("50");
    }

    public void waitFor50th () {
        Waiting.visibilityOfElement(driver, fifthyRow, "50th row");}

    public void select100Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("100");
    }

    public void waitFor100th () {
        Waiting.visibilityOfElement(driver, fifthyRow, "50th row");}

    public void select250Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("250");
    }

    public void waitFor250th () {
        Waiting.visibilityOfElement(driver, fifthyRow, "50th row");}

    public void waitForPrevious () {
        Waiting.elementToBeClickable(driver, previousButton, "previous button");
    }


    List<WebElement> options = driver.findElements(By.cssSelector("#special-commission_length > label > select > option"));
}
