package automation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	private WebDriver driver = null;
	
	@Test
	
	public void VerifyTable() {
		
		WebDriverManager.chromedriver().setup();
		
		org.testng.Assert.assertNull(driver);
		
		driver = new ChromeDriver();
		
		org.testng.Assert.assertNotNull(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String expectedValue = "Google";
		
		String actualValue = driver.getTitle();
		
		org.testng.Assert.assertEquals(actualValue,expectedValue);
		
		driver.navigate().to("https://www.thepancard.com/newpancard.php");
		
		boolean expValue = true;
		
		boolean actValue = driver.findElement(By.id("rblCategory_0")).isSelected();
		
		org.testng.Assert.assertEquals(actValue, expValue);
		
		org.testng.Assert.assertTrue(actValue);
		
		driver.quit();
		
		
	
		
	
		
	}
	
	

}
