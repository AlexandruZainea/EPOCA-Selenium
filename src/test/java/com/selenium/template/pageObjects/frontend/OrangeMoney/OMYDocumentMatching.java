package com.selenium.template.pageObjects.frontend.OrangeMoney;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OMYDocumentMatching extends PageBase {
    public OMYDocumentMatching (WebDriver passedriver) {super (passedriver);}

    @FindBy (xpath = "//*[@id=\"hqCode-flexdatalist\"]")
    private WebElement hqCodeField;

    @FindBy (xpath = "//*[@id=\"documentType\"]")
    private WebElement documentType;

    @FindBy (xpath = "//*[@id=\"documentStatus\"]")
    private WebElement documentStatus;

    @FindBy (xpath = "//*[@id=\"amount\"]")
    private WebElement amount;

    @FindBy (xpath = "//*[@id=\"balance\"]")
    private WebElement balance;

    @FindBy (xpath = "//*[@id=\"createdStartDate-div\"]")
    private WebElement createdStartDate;

    @FindBy (xpath = "//*[@id=\"createdEndDate-div\"]")
    private WebElement createdEndDate;

    @FindBy (xpath = "//*[@id=\"searchButton\"]")
    private WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"main-container\"]/div[2]/div[8]/button[3]")
    private WebElement addReceipt;

    @FindBy (xpath = "//*[@id=\"omy-netting_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"omy-netting_length\"]/label/select")
    private WebElement searchField;

    @FindBy (xpath = "//*[@id=\"omy-netting_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"omy-netting_next\"]/a")
    private WebElement nextButton;


}
