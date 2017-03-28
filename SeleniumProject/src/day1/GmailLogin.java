package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("Email"));
		
		email.sendKeys("seleniumtrainer449");
		
//		email.clear();
		
		driver.findElement(By.name("signIn")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		

	}

}
