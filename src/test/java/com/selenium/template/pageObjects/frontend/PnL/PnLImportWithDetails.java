package com.selenium.template.pageObjects.frontend.PnL;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PnLImportWithDetails extends PageBase {
    public PnLImportWithDetails (WebDriver passedriver) {super(passedriver);
    }

    @FindBy (xpath = "//*[@id=\"monthOfTransaction\"]")
    private WebElement monthOfTransaction;

    @FindBy (xpath = "//*[@id=\"yearOfTransaction\"]")
    private WebElement yearOfTransaction;

    @FindBy (xpath = "//*[@id=\"blc-input-file\"]")
    private WebElement chooseFile;

    @FindBy (xpath = "//*[@id=\"blc-upload-button\"]")
    private WebElement uploadButton;
}
