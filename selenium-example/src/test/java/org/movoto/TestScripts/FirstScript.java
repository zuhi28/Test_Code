package org.movoto.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {
    public static void main(String[] args) {
        WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.fb.com/");
        driver.close();

    }

}
