package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Kanishkashree");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("kanishkashree@gmail.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("kir");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("kir@gmail.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-theme-8\"]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("kajjgvgdjdh");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("100000");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		dr.quit();
		

	}

}
