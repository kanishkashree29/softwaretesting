package com.selenium.sample.Day7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_TC1 {
    public WebDriver dr;

    @Test
    public void f() {
        // Add your test logic here
    }

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        String title = "Guest Registration Form – User Registration";
        String ctitle = dr.getTitle();
        Assert.assertEquals(title, ctitle);
    }

    @AfterTest
    public void afterTest() {
        dr.quit();
    }
}
