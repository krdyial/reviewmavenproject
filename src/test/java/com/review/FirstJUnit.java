package com.review;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnit {

    @Test
    public void test1 (){
        System.out.println("This is my first test case");

    }

 //   @Ignore
    @Test
    public void test2(){
        System.out.println("This is my second test case");
    }

    @Test
    public void test3(){
        System.out.println("This is my third test case");
    }

    @Before
    public void setUp(){
        System.out.println("This is before method");
    }
    @After
    public void tearDown(){
        System.out.println("This is after method");
    }








}
