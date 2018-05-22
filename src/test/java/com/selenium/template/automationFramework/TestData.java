package com.selenium.template.automationFramework;

public class TestData {



    public static final int SHORT_WAIT = 5;
    public static final int LONG_WAIT = 20;
    public static final String customerSearchEN = "http://10.1.11.107:9432/customer/search";
    public static final String customerSearchRO = "http://10.1.11.107:9432/customer/search";
    public static final String loginPage = "http://multiauthdev.office.orange.intra/SSO/SignIn.aspx?serviceName=EPOCA&serviceURL=http://localhost:9432/login/afterLogin";

    //Left-side Menu
    //Orange Money
    public static final String nettingTransactions = "http://localhost:9432/omy/netting/show";
    public static final String nettingParameters = "http://localhost:9432/omy/netting-parameters/show";
    public static final String documentMatching = "http://localhost:9432/omy/matching/show";
    public static final String nettingBalanceReport = "http://localhost:9432/omy/matching/report/show";

    //Application Processes
    public static final String reportHistory = "http://localhost:9432/system/report/show";
    public static final String reportTemplates = "http://localhost:9432/system/report/show/templates";
    public static final String scheduledProcesses = "http://localhost:9432/system/jobs";

    //Customer
    public static final String search = "http://10.1.11.107:9432/customer/search";
    public static final String specialCommission = "http://10.1.11.107:9432/customer/special-commission/show";
    public static final String vat = "http://localhost:9432/customer/vat/show";
    public static final String exchangeRate = "http://10.1.11.107:9432/customer/er";
    public static final String bulkCreditLimit = "http://localhost:9432/customer/bulk-credit-limit/import";
    public static final String setupCreditLimit = "http://localhost:9432/customer/bulk-credit-limit/import/setup";

    //Reports
    public static final String reports = "http://localhost:9432/report/list";



    public static final String username = "epoca.superuser";
    public static final String password = "4FS^v!o4Q7Mq";

    public static final String AUTH_ERROR = "Nume utilizator sau parola incorecte!";
    public static final String CRYPTO_MESSAGE = "Nume utilizator sau parola incorecte? Te rog verifica mai intai daca Cryptocard-ul este sincronizat.";

    //waiting
    public static final long wait3sec = 30l;

    //downloads tab

    public static final String DOWNLOADS_TAB = "chrome://downloads";




}