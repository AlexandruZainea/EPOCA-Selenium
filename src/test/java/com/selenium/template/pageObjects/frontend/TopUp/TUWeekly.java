package com.selenium.template.pageObjects.frontend.TopUp;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TUWeekly extends PageBase {
    public TUWeekly(WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"customerId-flexdatalist\"]")
    private WebElement customerName;

    @FindBy (xpath = "//*[@id=\"soldDateFrom-div\"]")
    private WebElement soldDateFrom;

    @FindBy (xpath = "//*[@id=\"soldDateTo-div\"]")
    private WebElement soldDateTo;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReport;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

}
