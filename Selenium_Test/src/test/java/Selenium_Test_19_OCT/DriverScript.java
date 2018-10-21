package Selenium_Test_19_OCT;

import java.lang.reflect.Method;

public class DriverScript extends AutomationScripts {
    public static void main(String[] args) throws Exception {
        String dt_Path = "/home/zuhi/Desktop/code/Selenium_Test/src/test/resources/InputFile/Test_Suite.xls";
        String testCase =null;
        String flag = null;

        initializeExtentReport("XeroTestscriptsReport");
        String[][] TestSuitedata = readxlData(dt_Path,"All_TestCases_Info");
        for(int i = 1; i< TestSuitedata.length; i++) {
            flag = TestSuitedata[i][1];
            if(flag.equalsIgnoreCase("Y")) {
                testCase = TestSuitedata[i][2];
                createTestScriptReport(testCase);
                Method testScript = AutomationScripts.class.getMethod(testCase);
                testScript.invoke(testScript);

            }else {
                System.out.println("**********Row  number "+ i+" test case Name: "+ TestSuitedata[i][2]+" is not Executed*********");
            }




        }

        endExtentReport();
    }


}
