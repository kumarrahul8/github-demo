package Testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class Loginapplication {
		// TODO Auto-generated constructor stub
		
		@Test
		public void Login()
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			RediffLoginPage rd = new RediffLoginPage(driver);
			rd.UserName().sendKeys("Hello");
			rd.Password().sendKeys("qwerty");
			rd.SignIn().click();
			rd.Home().click();
			
			RediffHomePage rh = new RediffHomePage(driver);
			rh.Shooping().click();
			rh.ClickSearch().sendKeys("menkurtas");
			rh.ClickSearch().click();
			
		}
		
		
		
		
		
		
	}



