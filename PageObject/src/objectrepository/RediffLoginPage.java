package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {


		// TODO Auto-generated constructor stub
		WebDriver driver;
		public RediffLoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		

	  
	/*	
	By username = By.xpath("//*[@id=\"login1\"]");
	By password = By.id("password");
	By signin = By.name("proceed");
    By home = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
	*/	
		
		@FindBy(xpath="//*[@id=\'login1\']")
		WebElement username ;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(name="proceed")
		WebElement signin;
		
		@FindBy(xpath=("/html/body/div/div[1]/div[1]/div[1]/a"))
		WebElement home;
		
		
		
		public WebElement UserName()
		{
			return username;
		}
		
		public WebElement Password()
		{
			return password;
		}
		
		public WebElement SignIn()
		{
			return signin;
		}
		
		public WebElement Home()
		{
			return home;
		}
	

	
}
