package com.tekarcch.testing.mobile;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WhatsAppTest {
    public AndroidDriver driver;
    @Test
    public void testApp() throws MalformedURLException, InterruptedException {

        File app = new File("/home/zuhi/Desktop/Tekarch/MobileTesting1/AppsBackup/com.whatsapp.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        /*  Device details*/
        capabilities.setCapability("deviceName", "2c7c4443");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", "true");
        /* Application */
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.whatsapp");
        capabilities.setCapability("appActivity", "com.whatsapp.Main");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement ele=(WebElement) driver.findElementByAndroidUIAutomator("UiSelector().text(\"Mum\")");
//        ele.click();
        //driver.findElementByAndroidUIAutomator("UiSelector().text(\"Mum\")").click();
        AndroidElement ele1= (AndroidElement) driver.findElements(By.id("com.whatsapp:id/conversations_row_contact_name_holder")).get(0);
        TouchAction taction=new TouchAction(driver);
        Thread.sleep(6000);
        TouchAction action = taction.tap(ele1);
        Thread.sleep(6000);
        driver.quit();

    }
}
