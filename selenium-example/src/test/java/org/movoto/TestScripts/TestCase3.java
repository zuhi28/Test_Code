package org.movoto.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {
    private static void welcome_Message_1() throws InterruptedException {
        String expData="Please enter your password.";
        WebDriver driver = null;
        System.setProperty("webdriver.gecko.driver","webdriver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("zuhi@ericsson.com");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Saturn2803#");
        WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
        System.out.println(password);
        login.click();
        Thread.sleep(4000);
        WebElement userMenu=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
        userMenu.click();
        Thread.sleep(4000);
        WebElement logout=driver.findElement(By.partialLinkText("Logout"));
        logout.click();
       /** if (actualData.equals(expData)){
            System.out.println("Test case passed");
        }
        else
            System.out.println("Test case failed" + actualData);
        System.out.println(password);
        //password.clear();
        //driver.close();
        **/
    }

    public static void main(String[] args) throws InterruptedException {
        welcome_Message_1();

    }
}
