package com.automation.pages;

import com.automation.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private WaitUtils waitUtil;
    private Actions actions;

    private By popUpDismiss = By.className("b3wTlE");
    private By searchBar = By.cssSelector(".nw1UBF.v1zwn26");


    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitUtil = new WaitUtils(driver);
        actions = new Actions(driver);
    }



    public void dismissPopUp(){
        waitUtil.waitForClickable(popUpDismiss).click();
    }

    public void searchProduct(String text){
        waitUtil.waitForClickable(searchBar).sendKeys(text);
        actions.sendKeys(Keys.ENTER).perform();
    }
}
