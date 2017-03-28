package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest
{
	@Test
	public void tt()
	{
		WebDriver driver=new FirefoxDriver();
		
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.org_login(lp.u, lp.p);
		
		Sleeper.sleepTightInSeconds(5);
		AdminPage ap=PageFactory.initElements(driver, AdminPage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		 
	}

}
