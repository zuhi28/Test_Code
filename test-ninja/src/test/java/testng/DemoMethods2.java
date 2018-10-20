package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoMethods2 {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void testApp(){
        String expectedTitle ="This is expected title";
        String actualTitle ="This is actual title";
        System.out.println("Step1");
        softAssert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Step2");
       // Assert.assertTrue(2>1, "2 is smaller");
        //System.out.println("Step2");
        softAssert.assertAll();

    }
}
