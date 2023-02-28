package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightOnObject {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement txtDOB = driver.findElement(By.id("txtDOB"));
		
		//((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='2px solid red'");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='2px solid red'",txtDOB);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
