package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlIntoVisiblearea {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('example').scrollintoview()");
		
		WebElement table = driver.findElement(By.id("example"));
		
		File source = table.getScreenshotAs(OutputType.FILE);
		
		File target = new File("D:\\image1.PNG");
		
		FileHandler.copy(source,target);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
