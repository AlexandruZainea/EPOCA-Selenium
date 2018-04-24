package com.selenium.template.pageObjects.frontend.OrangeMoney;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OMYBalanceReport extends PageBase {
    public OMYBalanceReport (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"hqCode-flexdatalist\"]")
    private WebElement hqCodeField;

    @FindBy (xpath = "//*[@id=\"documentType\"]")
    private WebElement typeField;

    @FindBy (xpath = "//*[@id=\"documentStatus\"]")
    private WebElement statusField;

    @FindBy (xpath = "//*[@id=\"nettingStartDate-div\"]")
    private WebElement startDateField;

    @FindBy (xpath = "//*[@id=\"nettingEndDate-div\"]")
    private WebElement endDateField;

    @FindBy (xpath = "//*[@id=\"activeHqOnly\"]")
    private WebElement activeHQCheckbox;

    @FindBy (xpath = "//*[@id=\"viewDetails\"]")
    private WebElement viewDetails;

    @FindBy (xpath = "//*[@id=\"searchButton\"]")
    private WebElement generateReport;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"fullscreenButton\"]")
    private WebElement fullscreenButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

    @FindBy (xpath = "//*[@id=\"report-content-holder\"]/table")
    private WebElement reportTable;

    @FindBy (xpath = "/html/body/ul/li[1]/span")
    private WebElement firstWithA;


    public void generateAReport () {
        CommonTask.clickElement(driver, hqCodeField,"hqcodefield");
        CommonTask.sendKeys(hqCodeField, "a", "hq Code Field");
        Waiting.visibilityOfElement(driver, firstWithA, "First with A");
        CommonTask.clickElement(driver, firstWithA, "5th with A");

        CommonTask.clickElement(driver, generateReport, "generate report");
    }

    public void generateReport2 () {
        CommonTask.clickElement(driver, generateReport,"generate report");
    }

    public void clickShowFullScreen () {
        Waiting.elementToBeClickable(driver, fullscreenButton, "fullscreen button");
        CommonTask.clickElement(driver, fullscreenButton, "fullscreen button");
    }

}
