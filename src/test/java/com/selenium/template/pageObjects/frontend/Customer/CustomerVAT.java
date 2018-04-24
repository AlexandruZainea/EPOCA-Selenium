package com.selenium.template.pageObjects.frontend.Customer;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CustomerVAT extends PageBase {
    public CustomerVAT(WebDriver passedDriver) {
        super(passedDriver);
    }

    @FindBy (xpath = "//*[@id=\"vat-config_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"vat-config-historic\"]")
    private WebElement historyCheckbox;

    @FindBy (xpath = "//*[@id=\"vat-config_wrapper\"]/div[1]/div[2]/button")
    private WebElement addButton;

    @FindBy (xpath = "//*[@id=\"value\"]")
    private WebElement vatValue;

    @FindBy (xpath = "//*[@id=\"startDate\"]")
    private WebElement startDate;

    @FindBy (xpath = "/html/body/div[3]/div[1]/table/tbody/tr[1]/td[2]")
    private WebElement firstJanuary;

    @FindBy (xpath = "//*[@id=\"endDate\"]")
    private WebElement endDate;

    @FindBy (xpath = "//*[@id=\"vat-modal\"]/div/div/div[3]/button[2]")
    private WebElement saveButton;

    @FindBy (xpath = "//*[@id=\"vat-config\"]")
    private WebElement vatTable;

    @FindBy (xpath = "//*[@id=\"vat-config_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"vat-config_next\"]/a")
    private WebElement nextButton;

    @FindBy (xpath = "//*[@id=\"vatGenerateRaports\"]")
    private WebElement generateReportButton;

    @FindBy (xpath = "//*[@id=\"vat-config\"]/tbody/tr[1]/td[5]/div/a[2]")
    private WebElement deleteOnFirstRow;

    @FindBy (xpath = "//*[@id=\"delete\"]")
    private WebElement deleteConfirmationButton;


    public void addEntry () {
        CommonTask.moveToElement(driver, addButton, "add button");
        CommonTask.clickElement(driver, addButton, "add button");

        Waiting.visibilityOfElement(driver, saveButton, "save button");

        CommonTask.moveToElement(driver, vatValue, "vat value");
        CommonTask.clickElement(driver, vatValue, "vat value");
        CommonTask.sendKeys(vatValue,"12", "vat value");

        CommonTask.moveToElement(driver, startDate, "start date");
        CommonTask.clickElement(driver, startDate, "start date");

        CommonTask.moveToElement(driver, firstJanuary, "1st January");
        CommonTask.clickElement(driver,firstJanuary, "1st January");

        CommonTask.moveToElement(driver, saveButton, "save button");
        CommonTask.clickElement(driver, saveButton, "save button");

    }

    public void select25entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"vat-config_length\"]/label/select")));
        dropdown.selectByValue("25");
    }

    public void deleteEntry () {
        Waiting.elementToBeClickable(driver, deleteOnFirstRow,"delete on 1st row");
        CommonTask.clickElement(driver, deleteOnFirstRow, "delete on 1st row");
        Waiting.elementToBeClickable(driver, deleteConfirmationButton,"delete confirmation");
        CommonTask.clickElement(driver, deleteConfirmationButton,"delete confirmation");
    }
}
