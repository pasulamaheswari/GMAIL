package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddRemoveCart {
	
	@Test(dataProvider = "getTestData")
	
	public void addRemove(String UserName,String Password) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("UserName");
		
		driver.findElement(By.id("password")).sendKeys("Password");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		
		driver.findElement(By.id("reset_sidebar_link")).click();
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		driver.quit();
		
		
	}
	
	@DataProvider(name = "getTestData")
	
	public Object[][]getTestData(){
		
		Object[][]data = {
				
				{"standard_user","secret_sauce"},
				
				{"standard_user","secret_sauce"},
				
				{"standard_user","secret_sauce"}
				
			
		};
		
		return data;
		
	}
	
	
	
	

}
