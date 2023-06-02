package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Q3_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver();
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();

        try {
            // Use XPath to find the desired element
            WebElement element = dr.findElement(By.xpath("//*[@id=\"content\"]/h3"));

            // Print the found element
            System.out.println(element);
            WebElement e1=dr.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/p"));
            System.out.print(e1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver
            dr.quit();
        }
	}

}
