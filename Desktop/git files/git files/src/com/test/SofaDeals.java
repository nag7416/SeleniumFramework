package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SofaDeals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setting the webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//webdriver object
		WebDriver driver = new ChromeDriver();
		
		//setting the window to full width and height
		driver.manage().window().maximize();
		
		//opening the urban ladder website
		driver.get("https://www.urbanladder.com/");
		
		//locating the element
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]"));
		
		//creating the action element
		Actions actions = new Actions(driver);
		
		//pointing the action element to the target element
		actions.moveToElement(mainMenu).perform();	
		
		//clicking sofa button
		driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a")).click();
		
		//quitting the driver
		driver.quit();
	}

}
