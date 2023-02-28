package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificRowContent {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement row = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[3]"));
		
		System.out.println(row.getText());
		
		row = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr[5]"));
		
		System.out.println(row.getText());

		Thread.sleep(5000);
		
		driver.quit();
	}

}
