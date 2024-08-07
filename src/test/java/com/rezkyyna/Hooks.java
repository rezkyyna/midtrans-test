package com.rezkyyna;

import com.rezkyyna.drivers.DriverSingleton;
import com.rezkyyna.utils.Constants;
import com.rezkyyna.utils.TestCases;
import com.rezkyyna.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;

    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extend-report.html");

    @Before
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshootPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshootPath));
        }
    }
    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }

}
