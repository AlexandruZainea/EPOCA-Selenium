package com.selenium.template.pageObjects.frontend.ApplicationProcesses;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ReportTemplates extends PageBase {
    public ReportTemplates (WebDriver passsedriver){super (passsedriver);}

    @FindBy (xpath = "//*[@id=\"global_filter\"]")
    private WebElement searchField;

    @FindBy (xpath = "//*[@id=\"main-container\"]/div[1]/div[2]/div/div/div/div/button[1]/span")
    private WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"main-container\"]/div[1]/div[2]/div/div/div/div/button[2]/span")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"reports-table_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[1]")
    private WebElement sortByTemplateName;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[2]")
    private WebElement sortByCreatedDate;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[3]")
    private WebElement sortByUsername;

    @FindBy (xpath = "//*[@id=\"reports-table\"]/thead/tr/th[4]")
    private WebElement sortByContentType;

    @FindBy (xpath = "//*[@id=\"reports-table_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"reports-table_next\"]/a")
    private WebElement nextButton;

}
