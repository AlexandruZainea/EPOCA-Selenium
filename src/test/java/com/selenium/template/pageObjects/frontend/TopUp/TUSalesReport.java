package com.selenium.template.pageObjects.frontend.TopUp;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TUSalesReport extends PageBase {
    public TUSalesReport (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"customerId-flexdatalist\"]")
    private WebElement customerName;

    @FindBy (xpath = "//*[@id=\"category\"]")
    private WebElement category;

    @FindBy (xpath = "//*[@id=\"collector\"]")
    private WebElement collector;

    @FindBy (xpath = "//*[@id=\"soldDateFrom\"]")
    private WebElement soldDateFrom;

    @FindBy (xpath = "//*[@id=\"soldDateTo\"]")
    private WebElement soldDateTo;

    @FindBy (xpath = "//*[@id=\"invoiceDateFrom-div\"]")
    private WebElement invoiceDateFrom;

    @FindBy (xpath = "//*[@id=\"invoiceDateTo-div\"]")
    private WebElement invoiceDateTo;

    @FindBy (xpath = "//*[@id=\"commission-flexdatalist\"]")
    private WebElement commission;

    @FindBy (xpath = "//*[@id=\"includeDetails\"]")
    private WebElement includingDetails;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReport;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

}
