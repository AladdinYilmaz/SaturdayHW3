package com.ejunkie.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {


         WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://shopdemo.e-junkie.com/");

    }

  //  @AfterMethod
    public void tearDown() {

        driver.quit();

    }



}
