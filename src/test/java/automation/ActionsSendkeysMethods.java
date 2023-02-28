package automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendkeysMethods {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(1000);
		
		actions.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(1000);
		
		actions.sendKeys(Keys.END).perform();
		
		Thread.sleep(1000);
		
		actions.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(1000);
		
		

	}

}
