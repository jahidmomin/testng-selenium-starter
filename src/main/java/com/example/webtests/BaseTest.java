package com.example.webtests;

import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {

    protected ExtentSparkReporter extentSparkReporter;
    protected ExtentReports extentReports;
    protected ExtentTest extentTest;

    @BeforeTest
    public void startReporter() {
        String reportPath = System.getProperty("user.dir") + "/target/surefire-reports/extentReport.html";
        extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        // Configuration items to change the look and feel
        extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
        extentSparkReporter.config().setReportName("Test Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, result.getTestName());
        } else {
            extentTest.log(Status.SKIP, result.getTestName());
        }
    }

    @AfterTest
    public void tearDown() {
        extentReports.flush(); // Write updates to the report
    }
}
