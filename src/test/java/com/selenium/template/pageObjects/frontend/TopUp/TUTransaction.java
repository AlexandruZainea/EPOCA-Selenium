package com.selenium.template.pageObjects.frontend.TopUp;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TUTransaction extends PageBase {
    public TUTransaction (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"customerId-flexdatalist\"]")
    private WebElement customerID;

    @FindBy (xpath = "//*[@id=\"transactionDateFrom-div\"]")
    private WebElement transactionDateFrom;

    @FindBy (xpath = "//*[@id=\"transactionDateTo-div\"]")
    private WebElement transactionDateTo;

    @FindBy (xpath = "//*[@id=\"POScode\"]")
    private WebElement posCode;

    @FindBy (xpath = "//*[@id=\"invoicingPeriod\"]")
    private WebElement invoicingInterval;

    @FindBy (xpath = "//*[@id=\"category\"]")
    private WebElement category;

    @FindBy (xpath = "//*[@i d=\"collector\"]")
    private WebElement collector;

    @FindBy (xpath = "//*[@id=\"status\"]")
    private WebElement status;

    @FindBy (xpath = "//*[@id=\"customerName\"]")
    private WebElement customerNameCheckbox;

    @FindBy (xpath = "//*[@id=\"transactionDate\"]")
    private WebElement transactionDate;

    @FindBy (xpath = "//*[@id=\"rechargedMSISDN\"]")
    private WebElement recharged;

    @FindBy (xpath = "//*[@id=\"POScodeCheckbox\"]")
    private WebElement postCodeCheckbox;

    @FindBy (xpath = "//*[@id=\"productName\"]")
    private WebElement productName;

    @FindBy (xpath = "//*[@id=\"cancelDate\"]")
    private WebElement cancelDate;

    @FindBy (xpath = "//*[@id=\"transactionId\"]")
    private WebElement transactionID;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReport;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy(xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

}
