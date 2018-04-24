package com.selenium.template.pageObjects.frontend.PnL;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PnLExport extends PageBase {
    public PnLExport (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"indicator-flexdatalist\"]")
    private WebElement indicators;

    @FindBy (xpath = "//*[@id=\"category\"]")
    private WebElement category;

    @FindBy (xpath = "//*[@id=\"monthOfTransaction\"]")
    private WebElement monthOfTransaction;

    @FindBy (xpath = "//*[@id=\"yearOfTransaction\"]")
    private WebElement yearOfTransaction;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReport;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

    @FindBy (xpath = "//*[@id=\"validateButton\"]")
    private WebElement validateButton;
}
