package com.selenium.template.pageObjects.backend;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azaharia on 24.01.2018.
 */
public class BE_ExamplePage extends PageBase{

    public BE_ExamplePage(WebDriver passedDriver) {
        super(passedDriver);
    }


    // ---------------------------------------------------------------------------- Locators

    @FindBy(css = "css")
    private WebElement cssLocator;

    @FindBy(id = "xpath")
    private WebElement xpathLocator;


    // ---------------------------------------------------------------------------- Metods

}
