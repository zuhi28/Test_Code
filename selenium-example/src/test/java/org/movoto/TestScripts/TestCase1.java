package org.movoto.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {
    private static void login_Error_Message_1() {
        String expData="Please enter your password.";
        WebDriver driver = null;
        System.setProperty("webdriver.gecko.driver","webdriver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("zuhichaudhary@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
        System.out.println(password);
        login.click();
        WebElement actualError = driver.findElement(By.xpath("//div[@id='error']"));
        String actualData = actualError.getText();
        if (actualData.equals(expData)){
            System.out.println("Test case passed");
        }
        else
            System.out.println("Test case failed" + actualData);
        System.out.println(password);
        //password.clear();
        //driver.close();
    }

    public static void main(String[] args) {
        login_Error_Message_1();

    }
}
