package com.selenium.template.pageObjects.frontend.OrangeMoney;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OMYParameters extends PageBase {
    public OMYParameters(WebDriver passedDriver) { super (passedDriver);}

    @FindBy (xpath = "//*[@id=\"netting-parameters_length\"]/label/select")
    private WebElement numberOfEntries;

    @FindBy (xpath = "//*[@id=\"netting-parameters_length\"]/label/select")
    private WebElement addButton;

    @FindBy (xpath = "//*[@id=\"showHistoryButton\"]")
    private WebElement showHistory;

    @FindBy (xpath = "//*[@id=\"disableNettingParametersButton\"]")
    private WebElement firstRowDisableButton;

    @FindBy (xpath = "//*[@id=\"netting-parameters_previous\"]/a")
    private WebElement previousButton;

    @FindBy (xpath = "//*[@id=\"netting-parameters_next\"]/a")
    private WebElement nextButton;


}
