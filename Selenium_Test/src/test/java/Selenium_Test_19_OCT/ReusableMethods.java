package Selenium_Test_19_OCT;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;


public class ReusableMethods {
    public static WebDriver driver = null;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent = null;
    public static ExtentTest logger = null;


    public static void teardownWebDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
    public static WebDriver setupWebDriver() {
        if (driver != null) {
            return driver;
        }
        return setupWebDriver("chrome");
    }

    public static WebDriver setupWebDriver(String name) {
        if (driver != null) {
            return driver;
        }

        if (name.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "webdriver/geckodriver");
            logger.log(Status.PASS, "Firefox entered");
            driver = new FirefoxDriver();
        } else if (name.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
            logger.log(Status.PASS, "Chrome entered");
            driver = new ChromeDriver();
        } else if (name.equalsIgnoreCase("ie")) {
            logger.log(Status.PASS, "IE entered");
            System.setProperty("webdriver.ie.driver", "webdriver/geckodriver");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

    public static void enterText(WebElement obj, String textVal, String objName) {
        if (obj.isDisplayed()) {
            obj.sendKeys(textVal);
            logger.log(Status.PASS, MarkupHelper.createLabel(objName + " is entered", ExtentColor.GREEN));

        } else
            logger.log(Status.FAIL, MarkupHelper.createLabel(objName + " textbox not found", ExtentColor.RED));

    }

    public static void clickObject(WebElement obj, String objName) {
        if (obj.isDisplayed()) {
            obj.click();
            logger.log(Status.PASS, MarkupHelper.createLabel(objName + " is clicked", ExtentColor.GREEN));
        } else
            logger.log(Status.FAIL, MarkupHelper.createLabel(objName + " is not found", ExtentColor.RED));

    }

    public static void checkRememberMe(WebElement obj, String objName) {
        if (obj.isDisplayed()) {
            clickObject(obj, " Remember me");
            logger.log(Status.PASS, MarkupHelper.createLabel(objName + " is checked", ExtentColor.GREEN));
        } else
            logger.log(Status.FAIL, MarkupHelper.createLabel(objName + " is not found", ExtentColor.RED));
    }
    public static void loginToXero(String userName,String password){
        enterText(driver.findElement(By.id("email")), userName, "UserName");
        enterText(driver.findElement(By.id("password")), password, "Password");
        clickObject(driver.findElement(By.id("submitButton")), "LoginButton");

    }

    public static void verifyText(WebElement obj, String objName, String expectedText) throws IOException {
        if (obj.isDisplayed()) {
            if (obj.getText().equals(expectedText))
                logger.log(Status.PASS, MarkupHelper.createLabel(objName + " is displayed as expected", ExtentColor.GREEN));
            else {
                logger.log(Status.FAIL, MarkupHelper.createLabel(objName + "is NOT as expected", ExtentColor.RED));
                //String imagePath=takeScreenShot();
                //logger.addScreenCaptureFromPath(imagePath);
            }
        } else {
            logger.log(Status.FAIL, MarkupHelper.createLabel(objName + " not found", ExtentColor.RED));
        }
    }

    public static String takeScreenShot() throws IOException {
        String reportPath = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String destination = "src/test/resources/ScreenShots" + reportPath + "image.PNG";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(destination), true);
        return destination;
    }

    public static void initializeExtentReport(String reportName) {
        String reportFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
        htmlReporter = new ExtentHtmlReporter("src/test/resources/TestReports/XeroReport" + reportFormat + ".html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "TekArch");
        extent.setSystemInfo("Environment", "QA Automation");
        extent.setSystemInfo("User Name", "Zuhi");

        htmlReporter.config().setDocumentTitle("My Simple report");
        htmlReporter.config().setReportName("First execution");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
    }

    public static ExtentTest createTestScriptReport(String testScriptName) {
        logger = extent.createTest(testScriptName);
        return logger;
    }

    public static void endExtentReport() {
        extent.flush();
    }

    public static String[][] readxlData(String path, String sheetName) throws IOException {
        FileInputStream fs = new FileInputStream(new File(path));
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheet(sheetName);
        int rows = sheet.getLastRowNum() + 1;
        int cols = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                HSSFCell cell = sheet.getRow(i).getCell(j);
                if (cell.getCellTypeEnum() == CellType.STRING) {
                    data[i][j] = cell.getStringCellValue();
                } else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
                    data[i][j] = String.valueOf(cell.getNumericCellValue());
                }

            }
        }
        return data;
    }

}