package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://my.microfocus.com/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		
		txtUserName.sendKeys("MAHI");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
