package com.review;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //step 1 :
        WebDriverManager.edgedriver().setup();
        //Step 2: Create driver object

        WebDriver driver= new EdgeDriver();

        //step3: Go to the webpage
        driver.get("https://www.google.com");

        Faker name= new Faker();

       WebElement searchBox= driver.findElement(By.name("q"));
       searchBox.sendKeys(name.address().fullAddress()+ Keys.ENTER);

       String resultText= driver.findElement(By.id("result-stats")).getText().substring(0,1);
        System.out.println(resultText);

        

    }
}
