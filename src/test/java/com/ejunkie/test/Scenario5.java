package com.ejunkie.test;

import com.ejunkie.pom.ShopDemoElements;
import com.ejunkie.utils.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scenario5 extends BaseDriver {
    ShopDemoElements shopDemoElements;


    @Test
    public void cardNumberPositiveTest() {

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
        shopDemoElements.cardNumber.sendKeys("4242 4242 4242 4242");
        shopDemoElements.Expiration.sendKeys("12/22");
        shopDemoElements.cvv.sendKeys("000");
        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.visibilityOf(shopDemoElements.payButton));
        shopDemoElements.payButton.click();

        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(shopDemoElements.validCardMessage));
        boolean isMessageDisplayed=shopDemoElements.validCardMessage.isDisplayed();

        Assert.assertTrue(isMessageDisplayed);

    }







}
