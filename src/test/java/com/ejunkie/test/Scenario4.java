package com.ejunkie.test;

import com.ejunkie.pom.ShopDemoElements;
import com.ejunkie.utils.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scenario4 extends BaseDriver {

    ShopDemoElements shopDemoElements;


    @Test
    public void cardNumberNegativeTest() {

        shopDemoElements = new ShopDemoElements(driver);

        shopDemoElements.DemoEbookAddToChart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(shopDemoElements.IFrame1));
        driver.switchTo().frame(shopDemoElements.IFrame1);
        shopDemoElements.PayUsingDebitCard.click();
        shopDemoElements.email.sendKeys("aaaaa@aa.com");
        shopDemoElements.confirmEmail.sendKeys("aaaaa@aa.com");
        shopDemoElements.nameOfCard.sendKeys("aaaaaaddd dd");

        wait.until(ExpectedConditions.visibilityOf(shopDemoElements.IFrame2));
        driver.switchTo().frame(shopDemoElements.IFrame2);

        wait.until(ExpectedConditions.visibilityOf(shopDemoElements.cardNumber));
        shopDemoElements.cardNumber.sendKeys("1111 1111 1111 1111");
        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.visibilityOf(shopDemoElements.invalidCardMessage));
        boolean isMessageDisplayed=shopDemoElements.invalidCardMessage.isDisplayed();

        Assert.assertTrue(isMessageDisplayed);

    }

   // @Test






}
