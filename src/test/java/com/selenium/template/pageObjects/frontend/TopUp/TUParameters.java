package com.selenium.template.pageObjects.frontend.TopUp;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TUParameters extends PageBase {
    public TUParameters (WebDriver passedriver) {super(passedriver);}

    @FindBy (xpath = "//*[@id=\"customerId-flexdatalist\"]")
    private WebElement customerNameField;

    @FindBy (xpath = "//*[@id=\"profileClass\"]")
    private WebElement profileClass;

    @FindBy (xpath = "//*[@id=\"salesChannel\"]")
    private WebElement salesChannel;

    @FindBy (xpath = "//*[@id=\"collector\"]")
    private WebElement collector;

    @FindBy (xpath = "//*[@id=\"region\"]")
    private WebElement region;

    @FindBy (xpath = "//*[@id=\"activeAgentsOnly\"]")
    private WebElement activeCustomersOnly;

    @FindBy (xpath = "//*[@id=\"allParameters\"]")
    private WebElement allParameters;

    @FindBy (xpath = "//*[@id=\"generateReportButton\"]")
    private WebElement generateReportButton;

    @FindBy (xpath = "//*[@id=\"clearButton\"]")
    private WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"downloadButton\"]")
    private WebElement downloadButton;

    @FindBy (xpath = "//*[@id=\"validateButton\"]")
    private WebElement validateButton;
}
