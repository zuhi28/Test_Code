package testng;

import org.testng.annotations.Test;
import org.testng.Assert;

public class NGTest {

    @Test
    public void testCase1() {
        System.out.println("Hello 1!");
        Assert.assertEquals("zuhi", "bakli");
    }

    @Test
    public void testCase2() {
        System.out.println("Hello 2!");
        Assert.assertEquals("zuhi", "zuhi");
    }
}
