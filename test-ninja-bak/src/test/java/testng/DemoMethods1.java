package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoMethods1 {
    @Test
    public void testApp(){
        String expectedTitle ="This is expected title";
        String actualTitle ="This is actual title";
        System.out.println("Step1");
        //Assert.assertEquals(actualTitle,expectedTitle);
        //System.out.println("Step2");
        Assert.assertTrue(2>1, "2 is smaller");
        System.out.println("Step2");

    }
}
