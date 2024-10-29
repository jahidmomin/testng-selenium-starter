package com.example.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebsiteTest extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://student.infinitylearn.com/signin?page=homepage");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30 seconds timeout
    }

    @Test
    public void testEnterValidMobileNumberAndOTP() {
        extentTest = extentReports.createTest("Test Case 1", "This test case has passed"); // Initialize the test in ExtentReports

        driver.get("https://student.infinitylearn.com/signin?page=homepage");

        // Select country code
        WebElement countryCodeSelect = driver.findElement(By.id("country-code"));
        countryCodeSelect.click();
        countryCodeSelect.findElement(By.xpath("//option[@value='91']")).click(); // Select India (+91)

        // Enter valid mobile number
        WebElement mobileNumberField = driver.findElement(By.id("phone"));
        mobileNumberField.sendKeys("9876543210");

        // Click the continue button
        WebElement continueButton = driver.findElement(By.className("continueBtn"));
        continueButton.click();

        // Wait for the OTP input fields to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("otpboxes")));

        // Verify OTP input fields are displayed
        WebElement otpInputFields = driver.findElement(By.id("otpboxes"));
        Assert.assertTrue(otpInputFields.isDisplayed(), "OTP input fields should be displayed after clicking continue.");

        // Log the successful verification in ExtentReports
        extentTest.fail("OTP input fields displayed successfully.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
