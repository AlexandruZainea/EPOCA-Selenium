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

public class CustomerSearch extends PageBase {

    public CustomerSearch(WebDriver passedDriver) { super (passedDriver);}


    @FindBy (css = "#searchButtons")
    private WebElement searchButton;

    @FindBy (css = "#clearButton")
    private WebElement clearButton;

    @FindBy (css = "#customerId-flexdatalist")
    private WebElement customerNameField;

    @FindBy (css = "#salesChannel-flexdatalist")
    private WebElement salesChannelField;

    @FindBy (id = "customerSearchReport")
    private WebElement generateReport;

    @FindBy (css = "#reportDownloadDropdownMenu")
    private WebElement downloadButton;

    @FindBy (css = "#reportDownloadInfo-customerSearchReport > div > ul > li:nth-child(2) > a")
    private WebElement formatCSV;

    @FindBy (css = "#reportDownloadInfo-customerSearchReport > div > ul > li:nth-child(3) > a")
    private WebElement formatXLSX;

    @FindBy (css = "#reportDownloadInfo-customerSearchReport > div > ul > li:nth-child(4) > a")
    private WebElement formatPDF;

    @FindBy (css = "[name=\"customer-parameters_length\"]")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"customer-search\"]/tbody/tr[10]")
    private WebElement tenthRow;

    @FindBy (xpath = "//*[@id=\"customer-search\"]/tbody/tr[25]")
    private WebElement twentyfifthRow;

    @FindBy (xpath = "//*[@id=\"customer-search\"]/tbody/tr[50]")
    private WebElement fifthyRow;

    @FindBy (xpath = "//*[@id=\"customer-search\"]/tbody/tr[100]")
    private WebElement oneHundrethRow;

    @FindBy (xpath = "//*[@id=\"customer-search\"]/tbody/tr[250]")
    private WebElement twoHundredFiftyRow;

    @FindBy (xpath = "//*[@id=\"customer-parameters_next\"]/a")
    private WebElement nextButton;

    @FindBy (xpath = "//*[@id=\"customer-parameters_previous\"]/a")
    private WebElement previousButton;


    public void clickClear () {
        CommonTask.clickElement(driver, clearButton, "clear button");
    }

    public void clickSearch () {
        CommonTask.clickElement(driver, searchButton, "searchbutton");
    }

    public void inputCustomerName () {
        CommonTask.moveToElement(driver, customerNameField, "Customer Name Field");
        CommonTask.sendKeys(customerNameField,"somethingTest", "Customer Search Field");
    }

    public void inputSalesChannel () {
        CommonTask.moveToElement(driver, salesChannelField, "sales Channel Field");
        CommonTask.sendKeys(salesChannelField, "onceupon a time", "Sales Channel Field");
    }

    public String getCustomerNameSearchText () {
        return customerNameField.getText();
    }

    public void clickGenerateReport () {
        Waiting.visibilityOfElement(driver, generateReport, "Generate Report");
        CommonTask.moveToElement(driver, generateReport, "Generate Report");
        CommonTask.clickElement(driver, generateReport, "Generate Report");
    }


    public void waitForDownload () {
        Waiting.visibilityOfElement(driver, downloadButton, "download button");
    }

    public void clickDownloadCSV () {
        CommonTask.moveToElement(driver, downloadButton, "Download Button");
        CommonTask.clickElement(driver, downloadButton, "downloadbutton");

        Waiting.visibilityOfElement(driver, formatCSV, "format csv");
        CommonTask.moveToElement(driver, formatCSV, "format csv");
        CommonTask.clickElement(driver, formatCSV, "format csv");
    }

    public void clickDownloadXLSX () {
        CommonTask.moveToElement(driver, downloadButton, "Download Button");
        CommonTask.clickElement(driver, downloadButton, "downloadbutton");

        Waiting.visibilityOfElement(driver, formatXLSX, "Format xlsx");
        CommonTask.moveToElement(driver, formatXLSX, "FormatXlsx");
        CommonTask.clickElement(driver, formatXLSX, "formatxlsx");
    }

    public void clickDownloadPDF () {
        CommonTask.moveToElement(driver, downloadButton, "Download Button");
        CommonTask.clickElement(driver, downloadButton, "download button");

        Waiting.visibilityOfElement(driver, formatPDF, "formatPDF");
        CommonTask.moveToElement(driver, formatPDF, "format pdf");
        CommonTask.clickElement(driver, formatPDF, "Format pdf");
    }

    public void select5Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("5");
    }

    public void select10Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("10");
    }

    public void waitForTenth () {
        Waiting.visibilityOfElement(driver, tenthRow, "tenth row");}

    public void select25Entries () {
        //CommonTask.clickElement(driver, numberOfEntries);
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"customer-search_length\"]/label/select")));
        dropdown.selectByValue("25");
    }

    public void waitFor25th () {
        Waiting.visibilityOfElement(driver, twentyfifthRow, "Twenty Fifth Row");}

    public void select50Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("50");
    }

    public void waitFor50th () {
        Waiting.visibilityOfElement(driver, fifthyRow, "Fifty Row");}

    public void select100Entries () {
        CommonTask.clickElement(driver, numberOfEntries, " number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("100");
    }

    public void waitFor100th () {
        Waiting.visibilityOfElement(driver, oneHundrethRow, "one hundreth row");}

    public void select250Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"special-commission_length\"]/label/select")));
        dropdown.selectByValue("250");
    }

    public void waitFor250th () {
        Waiting.visibilityOfElement(driver, twoHundredFiftyRow, "250 row");}

    public void waitForPrevious () {
        Waiting.elementToBeClickable(driver, previousButton, "previous button");
    }


    List<WebElement> options = driver.findElements(By.cssSelector("#special-commission_length > label > select > option"));
}
