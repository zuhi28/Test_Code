package org.movoto.AutomationScriptsSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class ReusableMethods {
    private static WebDriver driver = null;

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
            driver = new FirefoxDriver();
        } else if (name.equalsIgnoreCase("chrome")) {
            System.out.println("chrome entered");
            System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
            driver = new ChromeDriver();
        } else if (name.equalsIgnoreCase("ie")) {
            System.out.println("chrome entered");
            System.setProperty("webdriver.ie.driver", "webdriver/geckodriver");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

    public void enterText(WebElement obj, String textVal, String objNmae) {
        if (obj.isDisplayed()) {
            obj.sendKeys(textVal);
            System.out.println("Pass: " + objNmae + " field is entered");
        } else
            System.out.println("Fail: " + objNmae + " field is not displayed, Please check your application.");
    }

    public void clickObject(WebElement obj, String objName) {
        if (obj.isDisplayed()) {
            obj.click();
            System.out.println("Pass: " + objName + " is clicked");
        } else
            System.out.println("Fail: " + objName + " is not displayed, please check your application");

    }

    public void checkRememberMe(WebElement obj, String objName) {
        if (obj.isDisplayed()) {
            clickObject(obj, " Remember me");
        }
    }


    /*
    =======================SalesForce Reusable Methods=======================
     */
    public void loginToSFDC() {
        WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
        enterText(un, "zuhi@ericsson.com", "UserName");
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        enterText(pwd, "Saturn2803#", "password");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    public void loginToSFDCWithRemMe() {
        WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
        enterText(un, "zuhi@ericsson.com", "UserName");
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        enterText(pwd, "Saturn2803#", "password");
        checkRememberMe(driver.findElement(By.xpath("//input[@id='rememberUn']")),"remMe");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    public void logoutFromSFDC() {
        driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
        driver.findElement(By.linkText("Logout")).click();
    }


}
