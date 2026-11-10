package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--start-maximized");

        driver = new ChromeDriver(chrome);
        System.out.println("Browser launched successfully");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if(driver != null){
            driver.quit();
            System.out.println("Bowser closed !!");
        }
    }

}
