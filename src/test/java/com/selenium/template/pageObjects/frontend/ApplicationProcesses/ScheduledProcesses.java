package com.selenium.template.pageObjects.frontend.ApplicationProcesses;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ScheduledProcesses extends PageBase {
    public ScheduledProcesses (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"main-container\"]/div[2]/div/div/div/div/div/button/span")
    private WebElement createNewJob;

    @FindBy (xpath = "//*[@id=\"newJobPopup\"]/div/div")
    private WebElement newJobPopup;

    @FindBy (xpath = "//*[@id=\"newJobPopup\"]/div/div/div[3]/button")
    private WebElement popupCloseButton;

    @FindBy (xpath = "//*[@id=\"newJobPopup\"]/div/div/div[2]/a")
    private WebElement reportsLink;

    @FindBy (xpath = "//*[@id=\"newJobPopup\"]/div/div/div[1]/button/span")
    private WebElement xPopupButton;

    @FindBy (css = "[name=\"jobs-table_length\"]")
    private WebElement numberOfEntries;

    public void select25Entries () {
        CommonTask.clickElement(driver, numberOfEntries, "number of entries");
        Select dropdown;
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"jobs-table_length\"]/label/select")));
        dropdown.selectByValue("25");
    }

    @FindBy (css = "input.form-control.input-sm")
    private WebElement searchField;

    public void sendKeysSearchField () {
        CommonTask.clickElement(driver, searchField, "Search Field");
        CommonTask.sendKeys(searchField, "CNS", "Search Field");
    }

    public void clearSearchField () {
        CommonTask.clearElement(searchField, "Search Field");
    }

    public String expectedPlaceholder = "search ...";

    public String getSearchFieldPlaceholder () {
        return searchField.getAttribute("placeholder");
    }

    public String getTextSearchField () {
        return searchField.getText();
    }

    @FindBy (css = "th.sorting_asc")
    private WebElement sortByName;

    public void clickSortByName () {
        CommonTask.clickElement(driver, sortByName, "sortbyname");
    }

    @FindBy (css = "tbody > tr:first-child > td:nth-of-type(9) > div > a.label.run_now.editor_edit.label-success")
    private WebElement firstRowRunNowButton;

    public boolean firstRunNowIsDisplayed () {
        return firstRowRunNowButton.isDisplayed();
    }

    @FindBy (css = "tbody > tr:first-child > td:nth-of-type(9) > div > a:nth-of-type(2)")
    private WebElement firstRowToggleStatusButton;

    public boolean firstToggleButtonIsDisplayed () {
        return firstRowToggleStatusButton.isDisplayed();
    }

    public void clickToggleStatus () {
        Waiting.elementToBeClickable(driver, firstRowToggleStatusButton,"togglestatus");
        CommonTask.clickElement(driver, firstRowToggleStatusButton,"togglestatus");
    }

    @FindBy (xpath = "//*[@id=\"jobs-table\"]/tbody/tr[1]/td[8]")
    private WebElement firstRowStatus;

    public String getFirstRowStatusText () {
        return firstRowStatus.getText();
    }

    @FindBy (css = "tbody > tr:first-child > td:nth-of-type(9) > div > a:nth-of-type(3)")
    private WebElement firstRowDetailsButton;

    public void clickJobDetails1stRow () {
        Waiting.elementToBeClickable(driver, firstRowDetailsButton,"details");
        CommonTask.clickElement(driver, firstRowDetailsButton, "details");
    }

    public boolean firstDetailsButtonsIsDisplayed () {
        return firstRowDetailsButton.isDisplayed();
    }
    @FindBy (xpath = "//*[@id=\"job-modal\"]/div/div")
    private WebElement jobDetails;

    @FindBy (xpath = "//*[@id=\"jobs-table_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"jobs-table_next\"]/a")
    private WebElement nextButton;
}
