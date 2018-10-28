package Selenium_Test_19_OCT;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AutomationScripts extends ReusableMethods {
    private static final String excelPath = "/home/zuhi/Desktop/code/Selenium_Test/src/test/resources/InputFile/Test_Suite.xls";
    private static final Assertion hardAssert = new Assertion();
    private static final SoftAssert softAssert = new SoftAssert();
    public static final String USER_NAME = "userName";
    public static final String PASSWORD = "password";
    public static final String EXP_DATA = "expData";


    public static Map<String, String> getTestCaseInputData(String testName) {
        String[][] inputTestData = new String[0][];
        try {
            inputTestData = readxlData(excelPath, testName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> testCaseInputValues = new HashMap<String, String>();
        for (int i = 1; i < inputTestData.length; i++) {
            if (inputTestData[i][1].equalsIgnoreCase(USER_NAME)) {
                testCaseInputValues.put(USER_NAME, inputTestData[i][2]);
            } else if (inputTestData[i][1].equalsIgnoreCase(PASSWORD)) {
                testCaseInputValues.put(PASSWORD, inputTestData[i][2]);
            } else if (inputTestData[i][1].equalsIgnoreCase(EXP_DATA)) {
                testCaseInputValues.put(EXP_DATA, inputTestData[i][2]);
            }
        }
        return testCaseInputValues;
    }

    public static void setup() {
        logger.log(Status.PASS, "Test starting");
        driver = ReusableMethods.setupWebDriver();
        driver.get("https://login.xero.com/us");
        logger.log(Status.PASS, "Xero application page is displayed");
    }

    @Test
    public static void Navigate_To_XERO_A() throws IOException {
        setup();
        Map<String, String> inputData = getTestCaseInputData("Navigate_To_XERO_A");
        loginToXero(inputData.get(USER_NAME), inputData.get(PASSWORD));
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Incorrect_Password() throws IOException {
        setup();
        Map<String, String> inputData = getTestCaseInputData("Incorrect_Password");
        enterText(driver.findElement(By.id("email")), inputData.get(USER_NAME), "userName");
        enterText(driver.findElement(By.id("password")), inputData.get(PASSWORD), "Password");
        clickObject(driver.findElement(By.id("submitButton")), "LoginButton");
        String actData = driver.findElement(By.xpath("//div[@class='x-boxed warning']//p")).getText();

        if (actData == inputData.get(EXP_DATA)) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Error message as expected", ExtentColor.GREEN));
        } else {
            logger.log(Status.FAIL, MarkupHelper.createLabel("Error message is not as expected", ExtentColor.RED));
        }
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Incorrect_Email() throws IOException {
        setup();
        Map<String, String> inputData = getTestCaseInputData("Incorrect_Email");
        enterText(driver.findElement(By.id("email")), inputData.get(USER_NAME), "userName");
        enterText(driver.findElement(By.id("password")), inputData.get(PASSWORD), "Password");
        clickObject(driver.findElement(By.id("submitButton")), "LoginButton");
        String actData = driver.findElement(By.xpath("//div[@class='x-boxed warning']//p")).getText();
        if (actData == inputData.get(EXP_DATA)) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Error message as expected", ExtentColor.GREEN));
        } else {
            logger.log(Status.FAIL, MarkupHelper.createLabel("Error message is not as expected", ExtentColor.RED));
        }
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Navigate_To_XERO_B() throws IOException {
        setup();
        Map<String, String> inputData = getTestCaseInputData("Navigate_To_XERO_B");
        clickObject(driver.findElement(By.className("forgot-password-advert")), "ForgotPass");
        enterText(driver.findElement(By.id("UserName")), inputData.get(USER_NAME), "email");
        clickObject(driver.findElement(By.className("text")), "send_Link");
        String actData = driver.findElement(By.xpath("//div[@class='x-boxed noBorder']//p[1]")).getText();
        if (actData == inputData.get(EXP_DATA)) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Reset link sent to associated email", ExtentColor.GREEN));
        } else {
            logger.log(Status.FAIL, MarkupHelper.createLabel("Something wrong with the application, Please check", ExtentColor.RED));
        }


        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Sign_Up_To_XDC_A() throws IOException {
        setup();
        driver.get("https://www.xero.com/us/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_A");
        clickObject(driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']")), "FreeTrial");
        String actData = driver.findElement(By.xpath("//h2[@class='title title-2']")).getText();
        if (actData.equalsIgnoreCase(inputData.get(EXP_DATA))) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Free Signup page is displayed", ExtentColor.GREEN));
        } else
            logger.log(Status.PASS, MarkupHelper.createLabel("Free Signup page is not displayed", ExtentColor.RED));
        enterText(driver.findElement(By.name("FirstName")), "Zuhi", "FirstName");
        enterText(driver.findElement(By.name("LastName")), "Jha", "LastName");
        enterText(driver.findElement(By.name("EmailAddress")), "zuhichy@gmail", "EmailAddress");
        enterText(driver.findElement(By.name("PhoneNumber")), "7206094533", "PhoneNumber");
        Select select = new Select(driver.findElement(By.name("LocationCode")));
        select.selectByValue("US");
        driver.switchTo().frame("a-ne67ztsawqs0");
        clickObject(driver.findElement(By.className("rc-inline-block")), "VerificationButton");
        clickObject(driver.findElement(By.name("TermsAccepted")), "TermsButton");
        clickObject(driver.findElement(By.xpath("//button[@type='submit']")), "GetStarted");
        logger.log(Status.PASS, MarkupHelper.createLabel("Inbox page should be displayed", ExtentColor.GREEN));

        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Sign_Up_To_XDC_B() throws IOException {
        setup();
        driver.get("https://www.xero.com/us/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_B");
        clickObject(driver.findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']")), "Free Trial");
        clickObject(driver.findElement(By.xpath("//button[@type='submit']")), "GetStarted");
        String actData = driver.findElement(By.id("form-error-message")).getText();
        if (actData == inputData.get(EXP_DATA)) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Email not provided", ExtentColor.GREEN));
        } else {
            logger.log(Status.FAIL, MarkupHelper.createLabel("Expected error message not displayed", ExtentColor.RED));
        }
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Sign_Up_To_XDC_C() throws IOException {
        setup();
        driver.get("https://www.xero.com/us/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_C");
        clickObject(driver.findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']")), "Free Trial");
        clickObject(driver.findElement(By.xpath("//a[contains(text(),'terms of use')]")), "Terms");
        clickObject(driver.findElement(By.xpath("//a[contains(text(),'terms of use')]")), "Terms");
        logger.log(Status.PASS, MarkupHelper.createLabel("Terms and Privacy pages are displayed", ExtentColor.GREEN));
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Sign_Up_To_XDC_D() throws IOException {
        setup();
        driver.get("https://www.xero.com/us/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_D");
        String userName = null;
        clickObject(driver.findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']")), "Free Trial");
        clickObject(driver.findElement(By.xpath("//a[contains(text(),'offer details')]")), "OfferDetails");
        logger.log(Status.PASS, MarkupHelper.createLabel("Offer Details pages are displayed", ExtentColor.GREEN));
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Sign_Up_To_XDC_E() throws IOException {
        setup();
        driver.get("https://www.xero.com/us/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_E");
        clickObject(driver.findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']")), "Free Trial");
        clickObject(driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]")), "OfferDetails");
        logger.log(Status.PASS, MarkupHelper.createLabel("Accountatnt OR Bookeeper page is displayed", ExtentColor.GREEN));
        String actData = driver.findElement(By.xpath("//h2[@class='title title-2']")).getText();
        if (actData.equalsIgnoreCase(inputData.get(EXP_DATA))) {
            logger.log(Status.PASS, MarkupHelper.createLabel("Test case passed", ExtentColor.GREEN));
        } else
            logger.log(Status.FAIL, MarkupHelper.createLabel("Test case failed", ExtentColor.RED));
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Test_All_Tabs_Page() throws IOException, InterruptedException {
        setup();
        driver.get("https://login.xero.com/");
        Map<String, String> inputData = getTestCaseInputData("Sign_Up_To_XDC_E");
        enterText(driver.findElement(By.id("email")), inputData.get(USER_NAME), "EmailAddress");
        enterText(driver.findElement(By.id("password")), inputData.get(PASSWORD), "Password");
        clickObject(driver.findElement(By.id("submitButton")), "loginButton");
        clickObject(driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")), "Dashboard");
        logger.log(Status.PASS, MarkupHelper.createLabel("Dashboard is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.linkText("Accounts")), "Accounts");
        logger.log(Status.PASS, MarkupHelper.createLabel("Account dropdown is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.linkText("Reports")), "Reports");
        logger.log(Status.PASS, MarkupHelper.createLabel("Reports dropdown is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.linkText("Contacts")), "Contacts");
        logger.log(Status.PASS, MarkupHelper.createLabel("Contact dropdown is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.linkText("Settings")), "Settings");
        logger.log(Status.PASS, MarkupHelper.createLabel("Settings dropdown is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.id("quicklaunchTab")), "Additional tab");
        logger.log(Status.PASS, MarkupHelper.createLabel("Expand tab is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.className("files")), "Files");
        logger.log(Status.PASS, MarkupHelper.createLabel("Files page is displayed", ExtentColor.GREEN));
        Thread.sleep(6000);
        clickObject(driver.findElement(By.className("xn-h-notification-count")), "Notific");
        logger.log(Status.PASS, MarkupHelper.createLabel("Notification is displayed", ExtentColor.GREEN));
        clickObject(driver.findElement(By.className("search")), "Search");
        logger.log(Status.PASS, MarkupHelper.createLabel("Search field is entered", ExtentColor.GREEN));
        clickObject(driver.findElement(By.className("help")), "Help");
        logger.log(Status.PASS, MarkupHelper.createLabel("Help field is displayed", ExtentColor.GREEN));
        ReusableMethods.teardownWebDriver();

    }

    @Test
    public static void Test_Logout_Functionality() throws IOException {
        setup();
        Map<String, String> inputData = getTestCaseInputData("Test_Logout_Functionality");
        loginToXero(inputData.get(USER_NAME), inputData.get(PASSWORD));
        clickObject(driver.findElement(By.className("username")), "MenuButton");
        clickObject(driver.findElement(By.linkText("Logout")), "Logout");
        verifyText(driver.findElement(By.id("email")), "Username", inputData.get(USER_NAME));
        ReusableMethods.teardownWebDriver();
    }

    @Test
    public static void Test_Upload_Profile_Image() {

    }

    @AfterClass
    public static void tearDown() {
        ReusableMethods.teardownWebDriver();
        System.out.println("Tests done");
    }
}
