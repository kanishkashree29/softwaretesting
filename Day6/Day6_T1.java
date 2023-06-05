package com.selenium.sample.Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_T1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		wd.findElement(By.xpath("//*[@id=\'input-firstname\']")).sendKeys("Student");
		wd.findElement(By.xpath("//*[@id=\'input-lastname\']")).sendKeys("name");
		wd.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("Student@gmail.com");
		wd.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("Student12345");
		wd.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();	
		wd.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		wd.findElement(By.xpath("//*[@id='form-register']/div/div/button")).click();
		wd.quit();

	}

}
