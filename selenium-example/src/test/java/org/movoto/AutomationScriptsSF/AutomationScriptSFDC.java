package org.movoto.AutomationScriptsSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutomationScriptSFDC extends ReusableMethods {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("Tests starting up");
        driver = ReusableMethods.setupWebDriver();
        driver.get("https://login.salesforce.com/");
        System.out.println("SFDC is opened.");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testCase1() {
        WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
        enterText(un, "zuhi@ericsson.com", "UserName");
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        System.out.println("Password field is cleared");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        String actualData = "Please enter your password.";
        String expData = driver.findElement(By.xpath("//div[@id='error']")).getText();
        Assert.assertEquals(actualData, expData);
    }

    @Test
    public void testCase2() throws InterruptedException {
        loginToSFDCWithRemMe();
        logoutFromSFDC();
        String userField = driver.findElement(By.xpath("//span[@id='idcard-identity']")).getText();
        Assert.assertEquals(userField, "zuhi@ericsson.com");
    }

    @Test
    public void testCase4() {
        driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
        System.out.println("SFDC Forgot Password page is displayed.");
        driver.findElement(By.xpath("//input[@id='un']")).sendKeys("zuhi@ericsson.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        String actData = driver.findElement(By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish rese')]")).getText();
        String expectedData = "We’ve sent you an email with a link to finish resetting your password.";
        Assert.assertEquals(actData, expectedData);
    }

    @Test
    public void testCase5() {
        WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
        enterText(un, "User@gmail.com", "UserName");
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        enterText(pwd, "Password", "password");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        String expData = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String actualData = driver.findElement(By.xpath("//div[@id='error']")).getText();
        Assert.assertEquals(expData, actualData);
    }

    @Test
    public void testCase6(){
        loginToSFDC();
        driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();


    }
    @Test
    public void testCase7a(){
        loginToSFDC();
        driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
        driver.findElement(By.linkText("My Profile")).click();
        System.out.println("User Prof page is displayed");
        driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")).click();
        driver.switchTo().frame("contactInfoContentId");
        System.out.println("Entered the frame");
        driver.findElement(By.linkText("About")).click();
        System.out.println("About clicked");
        //driver.findElement(By.xpath("//div[@class='zen-size1of2 zen-lastUnit zen-unit field_lastName']//label[@class='zen-label']")).clear();
        driver.findElement(By.xpath("//div[@class='zen-size1of2 zen-lastUnit zen-unit field_lastName']//label[@class='zen-label']")).sendKeys("Jha");
        System.out.println("Last name filled");
        driver.findElement(By.linkText("Save All")).click();
        System.out.println("Save ALL clicked.");


    }
    @Test
    public void testCase7b() throws InterruptedException {
        loginToSFDC();
        driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
        driver.findElement(By.linkText("My Settings")).click();
        driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
        driver.findElement(By.linkText("Login History")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
        driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
        driver.findElement(By.linkText("Customize My Tabs")).click();
        WebElement dropCustApp=driver.findElement(By.id("p4"));
        Select select = new Select(dropCustApp);
        select.selectByValue("02u6F000002ViqL");
        Select availTabs = new Select(driver.findElement(By.id("duel_select_0")));
        availTabs.selectByValue("report");
        driver.findElement(By.xpath("//img[@title='Add']")).click();
        driver.findElement(By.xpath("//input[contains(@title,'Save')]")).click();
        System.out.println("Report field is added.");
        driver.findElement(By.cssSelector("#EmailSetup_font")).click();
        driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
        driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
        driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("Zuhi Jha");
        driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
        driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("zuhichaudhary@gmail.com");
        List<WebElement> radioButton=driver.findElements(By.name("auto_bcc"));
        System.out.println("ABC");
        if(radioButton.get(1).isSelected())
        radioButton.get(0).click();
        driver.findElement(By.name("save")).click();
        driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
        driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
        driver.findElement(By.xpath("//input[@id='testbtn']")).click();
        System.out.println("Sample event pop window is displayed");
    }
    @Test
    public void testCase8() throws InterruptedException {
        loginToSFDC();
        String parantWin=driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
        driver.findElement(By.linkText("Developer Console")).click();
        Thread.sleep(6000);
        driver.switchTo().window(driver.getWindowHandle());
        Thread.sleep(6000);
        driver.close();
        System.out.print("Developer Console window is closed");

    }
    @Test
    public void testCase9() throws InterruptedException {
        loginToSFDC();
        driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
        List<WebElement> userMenuOption= driver.findElements(By.id("userNav-menuItems"));
        String logout=null;
        for (int i=0; i<userMenuOption.size(); i++) {
            System.out.println(userMenuOption.get(i).getText());
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(6000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://login.salesforce.com/");
    }
    @Test
    public void testCase10() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//input[@title='New']")).click();
        driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Test");
        driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
        System.out.println("New User has been saved!!");

    }
    @Test
    public void testCase11() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
        driver.findElement(By.xpath("//input[@id='fname']")).clear();
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("My_View");
        driver.findElement(By.xpath("//input[@id='devname']")).clear();
        driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("My_Unique_View");
        driver.findElement(By.xpath("//div[@class='pbHeader']//input[@title='Save']")).click();
        System.out.println("New View name has been added");

    }
    @Test
    public void testCase12() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Select select = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
        select.selectByValue("00B6F00000Gwn6h");
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.cssSelector("#fname")).clear();
        driver.findElement(By.cssSelector("#fname")).sendKeys("My_New_View");
        Select select1 = new Select(driver.findElement(By.cssSelector("#fcol1")));
        select1.selectByValue("ACCOUNT.NAME");
        Select select2 = new Select(driver.findElement(By.cssSelector("#fop1")));
        select2.selectByValue("e");
        driver.findElement(By.cssSelector("#fval1")).sendKeys("500MB");
        driver.findElement(By.xpath("//option[@value='SOCIAL_PERSONA_TWITTER']")).click();
        driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']")).click();
        driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Save']")).click();
        System.out.println("New View Edited.");

    }
    @Test
    public void testCase13() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
        driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Test");
        driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[2]")).click();
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Merge']")).click();
        driver.switchTo().alert().accept();
        System.out.println("Both test accounts are merged");
    }

    @Test
    public void testCase14() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
        driver.findElement(By.name("dateColumn")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")).click();
        System.out.println("Created date selected");
        driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
        System.out.println("Pass");
        WebElement table = driver.findElement(By.id("ext-comp-1112"));
        System.out.println("Pass1");
        List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
        System.out.println("Pass2");
        for (WebElement rows:tableRows){
            List<WebElement> cells = table.findElements(By.xpath("//td"));
            System.out.println("Pass3");
            for (WebElement cell:cells){
                if (cell.getText().equals("Today")){
                    table.findElement(By.linkText("Today")).click();
                }
            }
        }
        //driver.findElement(By.className("x-btn x-btn-noicon")).click();
        //driver.findElement(By.id("xt-comp-1112")).click();
    }
    @Test
    public void testCase15() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
       WebElement dropdown = driver.findElement(By.id("fcf"));
       Select select = new Select(dropdown);
       List<WebElement> options = select.getOptions();
       for (WebElement op:options){
           System.out.println(op.getText());
       }
    }

    @Test
    public void testCase16() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//input[@title='New']")).click();
        WebElement oppName = driver.findElement(By.id("opp3"));
        WebElement accName = driver.findElement(By.id("opp4"));
        WebElement port = driver.findElement(By.id("opp12"));
        enterText(oppName,"My Opportunity","oppName");
        enterText(accName,"Test","accName");
        enterText(port,"50","port");
        Select select = new Select(driver.findElement(By.id("opp5")));
        select.selectByValue("Existing Customer - Upgrade");
        Select select1 = new Select(driver.findElement(By.id("opp6")));
        select1.selectByValue("Phone Inquiry");
        Select select2 = new Select(driver.findElement(By.id("opp11")));
        select2.selectByValue("Qualification");
//        driver.findElement(By.id("opp9")).click();
//        System.out.println("Pass");
//        WebElement table = driver.findElement(By.id("datePickerCalendar"));
//        System.out.println("Pass1");
//        List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
//        System.out.println("Pass2");
//        for (WebElement rows:tableRows){
//            List<WebElement> cells = table.findElements(By.xpath("//td"));
//            System.out.println("Pass3");
//            for (WebElement cell:cells){
//                if (cell.getText().equals("18")){
//                    table.findElement(By.linkText("18")).click();
//                }
//            }
//        }
        driver.findElement(By.className("btn")).click();

    }

    @Test
    public void testCase17() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
        System.out.println("Pipelined opportunity should be displayed");
    }

    @Test
    public void testCase18() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
        System.out.println("Stuck opportunity should be displayed");
    }



    @Test
    public void testCase19() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Select select1 = new Select(driver.findElement(By.id("quarter_q")));
        Select select2 = new Select(driver.findElement(By.id("open")));
        select1.selectByValue("current");
        select2.selectByValue("open");
        driver.findElement(By.xpath("//input[@title='Run Report']")).click();
        System.out.println("Reports with above searched criteria should be displayed");
    }

    @Test
    public void testCase20() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(@class,'pageDescription')]")).getText(),"Home");
    }

    @Test
    public void testCase21() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Select select = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
        List<WebElement> options = select.getOptions();
        for (WebElement op:options){
            System.out.println(op.getText());
        }
    }

    @Test
    public void testCase22() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Select select = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
        select.selectByValue("00B6F00000GU4BW");
        logoutFromSFDC();
        loginToSFDC();
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        driver.findElement(By.xpath("//input[@title='Go!']")).click();
        System.out.println("Last selected view was displayed");

    }

    @Test
    public void testCase23() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        Select select = new Select(driver.findElement(By.id("fcf")));
        select.selectByValue("00B6F00000GU4BW");
        System.out.println("Today's Lead page is displayed");
    }

    @Test
    public void testCase24() throws InterruptedException {
        loginToSFDC();
        Thread.sleep(6000);
        driver.findElement(By.className("allTabsArrow")).click();
        driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
        if (driver.findElement(By.className("dialogClose")).isDisplayed()) {
            driver.findElement(By.className("dialogClose")).click();
        }
        driver.findElement(By.xpath("//input[@title='New']")).click();
        driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
        driver.findElement(By.id("lea3")).sendKeys("ABCD");
        driver.findElement(By.className("btn")).click();
        String title = driver.getTitle().substring(6,10);
        Assert.assertEquals(title,"ABCD");


    }




    @AfterClass
    public void tearDown() {
        //driver.close();
        System.out.println("Tests done");
    }
}
