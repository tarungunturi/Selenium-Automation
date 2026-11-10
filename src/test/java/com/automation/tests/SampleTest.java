package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void verifySample() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        HomePage home = new HomePage(driver);
        home.dismissPopUp();
        home.searchProduct("Iphone 17");
        Thread.sleep(1000000);
    }
}
