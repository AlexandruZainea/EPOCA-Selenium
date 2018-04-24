package com.selenium.template.pageObjects.frontend.TopUp;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TUCalculationNote extends PageBase {
    public TUCalculationNote (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"customerId-flexdatalist\"]")
    private WebElement customerName;

    @FindBy (xpath = "//*[@id=\"invoicingPeriod\"]")
    private WebElement invoicingInterval;

    @FindBy (xpath = "//*[@id=\"solutionSupplier\"]")
    private WebElement solutionSupplier;

    @FindBy (xpath = "//*[@id=\"category-flexdatalist\"]")
    private WebElement category;

    @FindBy (xpath = "//*[@id=\"soldDateFrom-div\"]")
    private WebElement soldDateFrom;

    @FindBy (xpath = "//*[@id=\"soldDateTo-div\"]")
    private WebElement soldDateTo;

    @FindBy (xpath = "//*[@id=\"cancelDateFrom-div\"]")
    private WebElement cancelDateFrom;

    @FindBy (xpath = "//*[@id=\"cancelDateTo-div\"]")
    private WebElement cancelDateTo;

    @FindBy (xpath = "//*[@id=\"posCodeDetail\"]")
    private WebElement posCodeDetail;

    @FindBy (xpath = "//*[@id=\"emailCalcNote\"]")
    private WebElement emailCalcNote;

    @FindBy (xpath = "//*[@id=\"generateCalculationNote\"]")
    private WebElement generateCalculationNote;

    @FindBy (xpath = "//*[@id=\"generateCorrectionNote\"]")
    private WebElement generateCorrectionNote;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReportButton;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

    @FindBy (xpath = "//*[@id=\"sendEmail\"]")
    private WebElement sendEmail;






}
