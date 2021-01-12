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

public class CheckBoxes {
//    Create a class : CheckBox_RadioButton

//    Go to https://the-internet.herokuapp.com/checkboxes
//    Locate the elements of checkboxes
//    Then click on checkbox1 if box is not selected
//    Then click on checkbox2 if box is not selected

    WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }

    @Test
    public void checkBox(){
        WebElement cb1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (cb1.isSelected()){
            System.out.println("SELECTED");
        }else{
            cb1.click();
            Assert.assertTrue(cb1.isSelected());
        }
    }
    @Test
    public void checkBox2(){
        WebElement cb2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
            if (cb2.isSelected()){
                System.out.println("SELECTED");
            }else{
                cb2.click();
                Assert.assertTrue(cb2.isSelected());
            }
        }




    @After
    public void tearDown(){
        driver.quit();
    }
}
