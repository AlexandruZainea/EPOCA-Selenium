package com.selenium.template.pageObjects.frontend;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FELoginPage extends PageBase {

    public FELoginPage (WebDriver passedDriver) { super (passedDriver);}




    //LOCATORS

    @FindBy(css = "#txtUsername")
    private WebElement userField;

    @FindBy (css = "#txtPassword")
    private WebElement passwordField;

    @FindBy (css = "#btnLogin")
    private WebElement loginButton;

    @FindBy (css = "#btnForgottenPassword")
    private WebElement forgotPasswordButton;

    @FindBy (css = "#lblAuthenticationError")
    private WebElement authError;

    @FindBy (css = "#captcha > tr:nth-of-type(3) > td:nth-of-type(2)")
    private WebElement cryptoMessage1;

    //@FindBy (css = "#captcha > tr:nth-of-type(3) > td:nth-of-type(2)")
    //private WebElement cryptoMessage2;

    @FindBy (css = "#hypCrypto")
    private WebElement cryptoMessageButton;



    public void inputUsername (String text) {
        CommonTask.clickElement(driver, userField, "userField");
        CommonTask.sendKeys(userField, text, "User Field");
    }

    public void inputPassword (String text) {
        CommonTask.clickElement(driver, passwordField, "passwordfield");
        CommonTask.sendKeys(passwordField, text, "Password Field");
    }

    public void signIn () {
        CommonTask.clickElement(driver, loginButton, "login button");
    }

    public static String getTitle (WebDriver driver) {
        return driver.getTitle();
    }

    public String getAuthError () {
        return authError.getText();
    }

    public String getCryptoMessage1 () {
        return cryptoMessage1.getText();
    }

    //public String getCryptoMessage2 () {
        //return CommonTask.getText(driver, cryptoMessage2);
    //}

    public String getCryptoMessageButton () {
        return cryptoMessageButton.getText();
    }


}
