package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().minimize();
		
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://mvn repository.com/");
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getPageSource());
	
	driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/");
	
	Thread.sleep(3000);
	
	driver.quit();
	
		
		

	}

}
