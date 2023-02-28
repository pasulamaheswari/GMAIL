package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement rbarmy=driver.findElement(By.id("rblCategory_1"));
		
		System.out.println(rbarmy.isSelected());
		
		rbarmy.click();
		
		System.out.println(rbarmy.isSelected());
		
		WebElement rbnavy=driver.findElement(By.id("rblCategory_2"));
		
		System.out.println(rbnavy.isSelected());
		
		rbnavy.click();
		
		WebElement txtDOB=driver.findElement(By.id("txtDOB"));
		
		System.out.println(txtDOB.isEnabled());
		
		Thread.sleep(2000);
		
		txtDOB.sendKeys("06/05/1999");
		
		System.out.println(txtDOB.getAttribute("value"));
		
		Thread.sleep(2000);
		
		txtDOB.clear();
		
		WebElement lstPOI=driver.findElement(By.id("proof_dob"));
		
		lstPOI.sendKeys("passport");
		
		Thread.sleep(5000);
		
		WebElement cbtc=driver.findElement(By.id("agreeproof"));
		
		System.out.println(cbtc.isSelected());
		
		Thread.sleep(2000);
		
		cbtc.click();
		
		System.out.println(cbtc.isSelected());
		
		Thread.sleep(2000);
		
		cbtc.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
 
		
		

	}

}
