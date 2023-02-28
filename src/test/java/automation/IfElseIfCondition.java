package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseIfCondition {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		String input = "firefox";
		
		if (input.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}else if (input.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}else if (input.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
		}else {
			
			System.out.println("Invalid Input");
			
			System.exit(1);
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/");
		
		driver.quit();
	}

}
