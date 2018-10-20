package selenium;

;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReport {
        ExtentHtmlReporter htmlReporter;
        ExtentReports extent;
        ExtentTest logger;


        @BeforeClass
        public void startReport(){

            htmlReporter = new ExtentHtmlReporter("/home/zuhi/Desktop/code/selenium-example/TestReports/My_Extent.html");
            extent = new ExtentReports ();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Host Name", "Tekarch");
            extent.setSystemInfo("Environment", "QA Testing");
            extent.setSystemInfo("User Name", "Zuhi");

            htmlReporter.config().setDocumentTitle("First_Extent_Report");
            htmlReporter.config().setReportName("First_Extent_Report");
            htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
            htmlReporter.config().setTheme(Theme.STANDARD);
        }
    @Test
    public void TestOne(){
            logger = extent.createTest("Test One");
        Assert.assertEquals("abc","abc");
            logger.log(Status.PASS,MarkupHelper.createLabel("Test is passed",ExtentColor.GREEN));
            extent.flush();


    }
}
