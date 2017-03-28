package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Methods 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		Sleeper.sleepTightInSeconds(5);
		//Navigate to facebook
		
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().forward();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().refresh();
		
		
	}
}
