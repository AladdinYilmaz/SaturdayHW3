package com.ejunkie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoElements {

    public ShopDemoElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

   // @FindBy(css = "a[title='My Account']")
   // public WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\"products\"]/div[1]/div/div[2]/a/div/div[2]/button")
    public WebElement DemoEbookAddToChart;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/div[3]/div/button[3]")
    public WebElement PayUsingDebitCard;

    @FindBy(xpath = "/html/body/iframe[1]")
    public WebElement IFrame1;
    @FindBy(xpath = "//input[@placeholder=\"Email\"]")
    public WebElement email;
    @FindBy(xpath = "//input[@placeholder=\"Confirm Email\"]")
    public WebElement confirmEmail;
    @FindBy(xpath = "//input[@placeholder=\"Name On Card\"]")
    public WebElement nameOfCard;
   // @FindBy(xpath = "//form[@class=\"ElementsApp is-empty\"]")
   @FindBy(xpath = "//input[@placeholder='Kart numarası']")
    public WebElement cardNumber;
    @FindBy(xpath = "//*[@id='Stripe-Element']/div/iframe")
    public WebElement IFrame2;

    @FindBy(xpath = "//*[text()='Your card number is invalid.']")
    public WebElement invalidCardMessage;
    @FindBy(xpath = "//input[@placeholder='AA / YY']")
    public WebElement Expiration;

    @FindBy(xpath = "//input[@placeholder='CVC']")
    public WebElement cvv;

    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payButton;


    @FindBy(xpath = "//*[contains(text(),' Thank you!')]")
    public WebElement validCardMessage;

}
