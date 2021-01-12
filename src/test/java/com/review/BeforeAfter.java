package com.review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfter {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }



    @Test
    public void titleTest(){

        String actualTitle= driver.getTitle();
        String expectedTitle="Google";
       Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void imageTest(){

        WebElement imageGoogle = driver.findElement(By.id("hplogo"));
        Assert.assertTrue(imageGoogle.isDisplayed());
    }
    @Test
    public void linkTest(){
        WebElement gmailLink= driver.findElement(By.linkText("Gmail"));
       Assert.assertTrue(gmailLink.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
