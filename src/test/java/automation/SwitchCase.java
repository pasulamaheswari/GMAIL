package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.input.Input;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCase {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String input = "chrome";
		
		switch (input) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			break;
			
			case "firefox":
				
				WebDriverManager.firefoxdriver().setup();
				
				driver = new FirefoxDriver();
				
				break;
				
				case "edge":
					
					WebDriverManager.edgedriver().setup();
					
					driver = new EdgeDriver();
					
					break;

		default:
			
			System.out.println("Invalid Input");
			
		}
			driver.manage().window().maximize();
			
			driver.get("https://mvnrepository.com/");
			
			driver.quit();
			
	}
	
}
		
		
		
		
		
			


			
					
					
			
			
			
			
	
			
		
				
				
				
				
			
			
	
		
	
			
			
			
	

		
	


