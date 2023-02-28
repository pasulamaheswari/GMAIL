package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementToBeClickable {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://fast.com/");
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("show-more-details-link")));
		  
		  WebElement lnkshowInfo = driver.findElement(By.id("show-more-details-link"));
		  
		  lnkshowInfo.click();
		  
		  Thread.sleep(5000);
		  
		  driver.quit();
		  
		  
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
