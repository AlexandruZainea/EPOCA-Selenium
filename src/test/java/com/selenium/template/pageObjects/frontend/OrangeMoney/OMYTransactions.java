package com.selenium.template.pageObjects.frontend.OrangeMoney;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OMYTransactions extends PageBase {
    public OMYTransactions(WebDriver passedDriver) { super (passedDriver);}

    @FindBy (xpath = "//*[@id=\"hqCode-flexdatalist\"]")
    private WebElement hqCodeField;

    @FindBy (xpath = "//*[@id=\"documentStatus-flexdatalist\"]")
    private WebElement statusField;

    @FindBy (xpath = "//*[@id=\"nettingStartDate-div\"]")
    private WebElement nettingStartingDate;

    @FindBy (xpath = "//*[@id=\"nettingEndDate-div\"]")
    private WebElement nettingEndDate;

    @FindBy (xpath = "//*[@id=\"searchButton\"]")
    private WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"netting_length\"]/label/select")
    private WebElement numberOfElements;

    @FindBy (xpath = "//*[@id=\"nettingTransactionsReport\"]")
    private WebElement downloadAll;

    @FindBy (xpath = "//*[@id=\"nettingTransactionsSendNotification\"]")
    private WebElement sendToAll;

    @FindBy (xpath = "//*[@id=\"netting_wrapper\"]/div[1]/div[2]/button[1]")
    private WebElement cancelAll;



}
