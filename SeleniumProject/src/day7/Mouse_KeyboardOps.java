package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_KeyboardOps {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		

		Actions act=new Actions(driver);
		
		//Focusing on Gmail
		act.moveToElement(gmail).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Right Click
		act.contextClick().build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		//Clicking down Arrow key 3 times
		
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		
//		Sleeper.sleepTightInSeconds(5);
//
//		//Click on the enter button
//		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.chord("P")).build().perform();
		
	}

}
