package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesMethods {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	WebElement lstcars=driver.findElement(By.id("cars"));
	
	lstcars.sendKeys("volvo");
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	

	}

}
