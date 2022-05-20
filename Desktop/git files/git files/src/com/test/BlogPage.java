package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlogPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//creating the webdriver object
		WebDriver driver = new ChromeDriver();
		
		//setting the window to full width and height
		driver.manage().window().maximize();
		
		//opening the urban ladder website
		driver.get("https://www.urbanladder.com/");
		
		//clicking on blog button
		driver.findElement(By.xpath("//*[@id=\"footer-links\"]/div[1]/div[1]/ul[1]/li[3]/a")).click();
	}

}
