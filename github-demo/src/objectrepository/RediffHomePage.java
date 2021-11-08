package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffHomePage {




			// TODO Auto-generated constructor stub
			WebDriver driver;
			public RediffHomePage(WebDriver driver) {
				// TODO Auto-generated constructor stub
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			/*
			By shopping = By.xpath("/html/body/div[2]/div/div[2]/a[6]");
			By search = By.xpath("//*[@id=\"srchword\"]");
			By enter = By.xpath("//*[@id=\"div_srchcontainer\"]/input[5]");
			*/
			
			@FindBy(xpath=("/html/body/div[2]/div/div[2]/a[6]"))
			WebElement shopping;
			@FindBy(xpath=("//*[@id=\"srchword\"]"))
			WebElement searchitem;
			@FindBy(xpath=("//*[@id=\"div_srchcontainer\"]/input[5]"))
			WebElement enter;
			
			/*
			public WebElement Shooping()
			{
				return driver.findElement(shopping);
			}
			
			public WebElement Search()
			{
				return driver.findElement(search);
			}
			
			public WebElement ClickSearch()
			{
				return driver.findElement(enter);
			}
			*/
			
			public WebElement Shooping()
			{
				return shopping;
			}
			
			public WebElement Searching()
			{
				return searchitem;
			}
			
			public WebElement ClickSearch()
			{
				return enter;
			}
			
			
}
