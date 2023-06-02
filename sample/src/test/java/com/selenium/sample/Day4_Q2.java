package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Q2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		String url="https://demo.opencart.com/index.php?route=account/login&language=en-gb";
		dr.get(url);
		dr.manage().window().maximize();

		dr.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec101@skct.edu.in");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kani");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		Thread.sleep(2000);
		dr.quit();
	}

}
