package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		dr.get(url);
		dr.manage().window().maximize();
		dr.findElement(By.name("firstname")).sendKeys("kiruthiga");
		Thread.sleep(2000);
		dr.findElement(By.name("lastname")).sendKeys("Kumaran");
		dr.findElement(By.name("email")).sendKeys("727821tuec112@skct.edu.in");
		dr.findElement(By.name("password")).sendKeys("kirr");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\'input-newsletter-yes\']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
	   dr.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	   Thread.sleep(2000);
	   dr.quit();	

	}

}
