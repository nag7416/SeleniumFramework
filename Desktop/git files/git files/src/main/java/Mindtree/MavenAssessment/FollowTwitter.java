package Mindtree.MavenAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowTwitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the driver
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
				//webdriver object
				WebDriver driver = new ChromeDriver();
				
				//setting the window to full width and height
				driver.manage().window().maximize();
				
				//opening the urban ladder website
				driver.get("https://www.urbanladder.com/");
				
				//clicking the twitter button
				driver.findElement(By.xpath("//*[@id=\"footer-social\"]/li[4]/a")).click();
	}

}
