package automation;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.OpenAttrs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_AddToCart {
	
	private WebDriver driver = null;
	
	//open Browser
	
	@BeforeTest
	
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		driver.manage().window().maximize();
		
	}
	
	//Login
	
	@BeforeMethod
	
	public void login() {
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	
	public void addtocard() throws Exception{
		
		//AddToCart
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		Thread.sleep(1000);
		
	}
	
	//Logout
	
	@AfterMethod
	
	public void logout() {
		
		driver.findElement(By.id("reset_sidebar_link")).click();
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	
	@AfterTest
	
	public void closeBrowser() throws Exception{
		
		//close Browser

		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	
	
	
	
	

	

}
