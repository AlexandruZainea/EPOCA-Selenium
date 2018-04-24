package com.selenium.template.pageObjects.frontend.ApplicationProcesses;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportHistory extends PageBase {
    public ReportHistory (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"reports-table_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[1]")
    private WebElement sortByID;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[2]")
    private WebElement sortByName;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[3]")
    private WebElement sortByCreatedDate;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[4]")
    private WebElement sortByExecutionDate;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[5]")
    private WebElement sortByUser;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[6]")
    private WebElement sortByContentType;
}
