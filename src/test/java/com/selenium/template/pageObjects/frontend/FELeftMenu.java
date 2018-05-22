package com.selenium.template.pageObjects.frontend;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FELeftMenu extends PageBase {


    public FELeftMenu(WebDriver passedDriver) {
        super(passedDriver);
    }
    //Orange Money

    @FindBy (css = "#sidebar-menu > li:nth-of-type(1) > a.accordion-toggle")
    private WebElement orangeMoeney;

    @FindBy (css = "#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement nettingTransactions;

    @FindBy (css = "#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement nettingParameters;

    @FindBy (css = "#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement documentMatching;

    @FindBy (css = "#omy > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(4) > a")
    private WebElement nettingBalanceReport;

    public void clickOrangeMoney (){
        CommonTask.moveToElement(driver, orangeMoeney,"OMY");
        CommonTask.clickElement(driver, orangeMoeney,"OMY");
    }

    public void clickNettingTransactions (){
        if (!nettingTransactions.isDisplayed()) {
            clickOrangeMoney();
            CommonTask.moveToElement(driver, nettingTransactions, "Netting Transactions");
            CommonTask.clickElement(driver, nettingTransactions, "netTransactions");
        }else {
            CommonTask.moveToElement(driver, nettingTransactions, "Netting Transactions");
            CommonTask.clickElement(driver, nettingTransactions, "netTransactions");
        }
    }

    public void clickNettingParameters () {
        if (!nettingTransactions.isDisplayed()) {
            clickOrangeMoney();
            CommonTask.moveToElement(driver, nettingParameters, "Netting Parameters");
            CommonTask.clickElement(driver, nettingParameters, "netParam");
        } else {
            CommonTask.moveToElement(driver, nettingParameters, "Netting Parameters");
            CommonTask.clickElement(driver, nettingParameters, "netParam");
        }
    }

    public void clickDocumentMatching () {
        if (!nettingTransactions.isDisplayed()) {
            clickOrangeMoney();
            CommonTask.moveToElement(driver, documentMatching, "Dcoument Matching");
            CommonTask.clickElement(driver, documentMatching, "document Matching");
        } else {
            CommonTask.moveToElement(driver, documentMatching, "Document Matching");
            CommonTask.clickElement(driver, documentMatching, "document Matching");
        }
    }

    public void clickNettingBalance () {
        if (!nettingTransactions.isDisplayed()) {
            clickOrangeMoney();
            Waiting.visibilityOfElement(driver,nettingBalanceReport, "Netting Balance Report");
            CommonTask.clickElement(driver, nettingBalanceReport, "nettingBalance");
        } else {
            CommonTask.clickElement(driver, nettingBalanceReport, "nettingBalance");
        }
    }

    //Topup

    @FindBy (css = "#sidebar-menu > li:nth-of-type(2) > a.accordion-toggle")
    private WebElement topUp;

    @FindBy (css = "#topup > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement parameters;

    @FindBy (css = "#topup > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement calculationNote;

    @FindBy (css = "#topup > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement salesReport;

    @FindBy (css = "#topup > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(4) > a")
    private WebElement weeklySalesReport;

    @FindBy (css = "#topup > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(5) > a")
    private WebElement transaction;

    public void clickTopup () {
        CommonTask.moveToElement(driver, topUp, "topup");
        CommonTask.clickElement(driver, topUp, "topup");
    }

    public void clickParameters () {
        CommonTask.moveToElement(driver, parameters, "Parameters");
        CommonTask.clickElement(driver, parameters, "parameters");
    }

    public void clickCalculationNote () {
        CommonTask.moveToElement(driver, calculationNote, "Calculation Note");
        CommonTask.clickElement(driver, calculationNote, "calculationNote");
    }

    public void clickSalesReport () {
        CommonTask.moveToElement(driver, salesReport, "Sales Report");
        CommonTask.clickElement(driver, salesReport, "salesReport");
    }

    public void clickWeeklySalesReport () {
        CommonTask.moveToElement(driver, weeklySalesReport, "Weekly Sales Report");
        CommonTask.clickElement(driver, weeklySalesReport, "weekly");
    }

    public void clickTransaction () {
        CommonTask.moveToElement(driver, transaction, "Transaction");
        CommonTask.clickElement(driver, transaction, "transaction");
    }


    //Application Processes

    @FindBy (xpath = "//*[@id=\"sidebar-menu\"]/li[3]/a")
    private WebElement applicationProcesses;

    @FindBy (css = "#system > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement reportHistory;

    @FindBy (css = "#system > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement reportTemplates;

    @FindBy(xpath = "//*[@id=\"system\"]/ul/li[3]/a")
    private WebElement scheduledProcesses;

    public void clickApplicationProcesses () {
        if (!scheduledProcesses.isDisplayed())
        CommonTask.moveToElement(driver, applicationProcesses, "Application Processes");
        CommonTask.clickElement(driver, applicationProcesses, "app processes");
    }

    public void clickReportHistory () {
        CommonTask.moveToElement(driver, reportHistory, "Report History");
        CommonTask.clickElement(driver, reportHistory, "report history");
    }

    public void clickReportTemplates () {
//        CommonTask.moveToElement(driver, reportTemplates, "Report Templates");
        CommonTask.clickElement(driver, reportTemplates, "report templates");
    }

    public void clickScheduledProcesses () {
//        CommonTask.moveToElement(driver, scheduledProcesses, "Scheduled Processes");
        CommonTask.clickElement(driver, scheduledProcesses, "scheduledProcesses");
    }

    //Customer Search

    @FindBy (css = "#sidebar-menu > li:nth-of-type(3) > a.accordion-toggle")
    private WebElement customer;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement search;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement specialCommission;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement vat;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(4) > a")
    private WebElement exchangeRate;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(5) > a")
    private WebElement bulkCreditLimit;

    @FindBy (css = "#customer > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(6) > a")
    private WebElement setupCreditLimit;

    public void clickCustomer () {
        CommonTask.moveToElement(driver, customer, "Customer");
        CommonTask.clickElement(driver, customer, "customer");
    }

    public void clickSearch () {
        CommonTask.moveToElement(driver, search, "Search");
        CommonTask.clickElement(driver, search,"search");
    }

    public void clickSpecialCommission () {
        CommonTask.moveToElement(driver, specialCommission, "Special Commission");
        CommonTask.clickElement(driver, specialCommission, "special commission");
    }

    public void clickVAT () {
        CommonTask.moveToElement(driver, vat, "VAT");
        CommonTask.clickElement(driver, vat, "vat");
    }

    public void clickExchangeRate () {
        CommonTask.moveToElement(driver, exchangeRate, "Exchange Rate");
        CommonTask.clickElement(driver, exchangeRate, "exchangeRate");
    }

    public void clickBulkCreditLimit () {
        CommonTask.moveToElement(driver, bulkCreditLimit, "Bulk Credit Limit");
        CommonTask.clickElement(driver, bulkCreditLimit, "bulkCreditLimit");
    }

    public void clickSetupCreditLimit () {
        CommonTask.moveToElement(driver, setupCreditLimit, "setup Credit Limit");
        CommonTask.clickElement(driver, setupCreditLimit, "setupCreditLimit");
    }



    //Orders

    @FindBy (css = "#sidebar-menu > li:nth-of-type(5) > a.accordion-toggle")
    private WebElement orders;

    @FindBy (css = "#order > ul.nav.nav-pills.nav-stacked.null > li > a")
    private WebElement ordersSearch;


    public void clickOrders () {
        CommonTask.moveToElement(driver, orders, "Orders");
        CommonTask.clickElement(driver, orders, "orders");
    }

    public void clickOrdersSearch () {
        CommonTask.moveToElement(driver, ordersSearch, "Orders Search");
        CommonTask.clickElement(driver, ordersSearch, "ordersSearch");
    }


    //Clients

    @FindBy (css = "#sidebar-menu > li:nth-of-type(6) > a")
    private WebElement clients;

    public void clickClients () {
        CommonTask.moveToElement(driver, clients, "Clients");
        CommonTask.clickElement(driver, clients, "clients");
    }

    //Products

    @FindBy (css = "#sidebar-menu > li:nth-of-type(7) > a.accordion-toggle.collapsed")
    private WebElement products;

    @FindBy (css = "#items > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement productsSearch;

    @FindBy (css = "#items > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement partners;

    @FindBy (css = "#items > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement partnersMapping;

    public void clickProducts () {
        CommonTask.moveToElement(driver, products, "Products");
        CommonTask.clickElement(driver, products, "products");
    }

    public void clickProductsSearch () {
        CommonTask.moveToElement(driver, productsSearch, "Products Search");
        CommonTask.clickElement(driver, productsSearch, "products");
    }

    public void clickPartners () {
        CommonTask.moveToElement(driver, partners, "Partners");
        CommonTask.clickElement(driver, partners, "partners");
    }

    public void clickPartnersMapping () {
        CommonTask.moveToElement(driver, partnersMapping, "Partners Mapping");
        CommonTask.clickElement(driver, partnersMapping, "partners mapping");
    }

    //Credit Control

    @FindBy (css = "#sidebar-menu > li:nth-of-type(8) > a.accordion-toggle")
    private WebElement creditControl;

    @FindBy (css = "#creditControl > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement creditControlSearch;

    @FindBy (css = "#creditControl > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement todaysList;

    @FindBy (css = "#creditControl > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement unallocatedOACompensationReport;

    public void clickCreditControl () {
        CommonTask.moveToElement(driver, creditControl, "credit Control");
        CommonTask.clickElement(driver, creditControl, "credit control");
    }

    public void clickCreditControlSearch () {
        CommonTask.moveToElement(driver, creditControlSearch, "Credit Control Search");
        CommonTask.clickElement(driver, creditControlSearch, "cc search");
    }

    public void clickTodaysList () {
        CommonTask.moveToElement(driver, todaysList, "Todays List");
        CommonTask.clickElement(driver, todaysList, "todayList");
    }

    public void clickUnallocated () {
        CommonTask.moveToElement(driver, unallocatedOACompensationReport, "Unallocated OA Compensation Report");
        CommonTask.clickElement(driver, unallocatedOACompensationReport, "UOAC report");
    }



    //Series

    @FindBy (css = "#sidebar-menu > li:nth-of-type(9) > a.accordion-toggle")
    private WebElement series;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement seriesSearch;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement importSeries;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement editStatus;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(4) > a")
    private WebElement markAsTestCancelled;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(5) > a")
    private WebElement stocDetails;

    @FindBy (css = "#series > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(6) > a")
    private WebElement pinReport;

    public void clickSeries () {
        CommonTask.moveToElement(driver, series, "Series");
        CommonTask.clickElement(driver, series, "series");
    }

    public void clickSeriesSearch () {
        CommonTask.moveToElement(driver, seriesSearch, "Series Search");
        CommonTask.clickElement(driver, seriesSearch, "S Search");
    }

    public void clickImportSeries () {
        CommonTask.moveToElement(driver, importSeries, "Import Series");
        CommonTask.clickElement(driver, importSeries, "importSeries");
    }

    public void clickEditStatus () {
        CommonTask.moveToElement(driver, editStatus, "Edit Status");
        CommonTask.clickElement(driver, editStatus, "edit status");
    }

    public void clickMarkAsTestCancelled () {
        CommonTask.moveToElement(driver, markAsTestCancelled, "Mark as Test Cancelled");
        CommonTask.clickElement(driver, markAsTestCancelled, "mark test cancelled");
    }

    public void clickStocDetails () {
        CommonTask.moveToElement(driver, stocDetails, "Stock Details");
        CommonTask.clickElement(driver, stocDetails, "stock details");
    }

    public void clickPinReport () {
        CommonTask.moveToElement(driver, pinReport, "PIN Report");
        CommonTask.clickElement(driver, pinReport, "pin report");
    }

    //P&L

    @FindBy (css = "#sidebar-menu > li:nth-of-type(10) > a.accordion-toggle")
    private WebElement pNL;

    @FindBy (css = "#PL > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement pNLImport;

    @FindBy (css = "#PL > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement pNLImportDetails;

    @FindBy (css = "#PL > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement pNLExport;

    public void clickPnL () {
        CommonTask.clickElement(driver, pNL, "pnl");
        CommonTask.moveToElement(driver,pNL,"PNL");
    }

    public void clickPnLImport () {
        CommonTask.moveToElement(driver, pNLImport, "PNL Import");
        CommonTask.clickElement(driver, pNLImport, "pnlimport");
    }

    public void clickPnLImportDetails () {
        CommonTask.moveToElement(driver, pNLImportDetails, "PNL Import with Details");
        CommonTask.clickElement(driver, pNLImportDetails, "pnl with details");
    }

    public void clickPnLExport () {
        CommonTask.moveToElement(driver, pNLExport, "PNL Export");
        CommonTask.clickElement(driver, pNLExport, "pnl export");
    }

    //Forms

    @FindBy (css = "#sidebar-menu > li:nth-of-type(11) > a.accordion-toggle")
    private WebElement forms;

    @FindBy (css = "#forms > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(1) > a")
    private WebElement notifications;

    @FindBy (css = "#forms > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(2) > a")
    private WebElement partnerInvoices;

    @FindBy (css = "#forms > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(3) > a")
    private WebElement exceptionalValidations;

    @FindBy (css = "#forms > ul.nav.nav-pills.nav-stacked.null > li:nth-of-type(4) > a")
    private WebElement collections;

    public void clickForms () {
        CommonTask.moveToElement(driver, forms, "Forms");
        CommonTask.clickElement(driver, forms, "forms");
    }

    public void clickNotifications () {
        CommonTask.moveToElement(driver, notifications, "Notifications");
        CommonTask.clickElement(driver, notifications, "notifications");
    }

    public void clickPartnerInvoices () {
        CommonTask.moveToElement(driver, partnerInvoices, "Partner Invoices");
        CommonTask.clickElement(driver,partnerInvoices, "partner invoices");
    }

    public void clickExceptionalValidations () {
        CommonTask.moveToElement(driver, exceptionalValidations, "Exceptional Validations");
        CommonTask.clickElement(driver, exceptionalValidations, "exceptional validations");
    }

    //Reports & Language

    @FindBy (css = "#sidebar-menu > li:nth-of-type(4) > a")
    private WebElement reports;

    @FindBy (css = "#sidebar-menu > li:nth-of-type(5) > a")
    private WebElement languageButton;

    public void clickReports () {
        CommonTask.moveToElement(driver, reports, "Reports");
        CommonTask.clickElement(driver, reports, "reports");
    }

    public void clickLanguageButton () {
        CommonTask.moveToElement(driver, languageButton, "Language Button");
        CommonTask.clickElement(driver, languageButton, "Language button");
    }

}
