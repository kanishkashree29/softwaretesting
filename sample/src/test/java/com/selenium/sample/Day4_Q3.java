package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Q3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager .chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\"search\"]/input")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
		dr.quit();
		
	}

}
