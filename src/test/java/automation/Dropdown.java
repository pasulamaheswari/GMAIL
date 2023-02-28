package automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.SetChildNodes;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
	driver.switchTo().frame("iframeResult");
	
	WebElement lstcars=driver.findElement(By.id("cars"));
	
	Select select= newset(lstcars);
	
	List<WebElement>list=select.getOptions();
			
			for(WebElement element:list) {
				
				System.out.println(element.getText());
				
			}
			
			select.selectByIndex(0);
			select.selectByIndex(2);
			list=select.getAllSelectedOptions();
			for(WebElement webElement:list) {
				System.out.println(webElement.getText());
				
			}
			Thread.sleep(5000);
			
			driver.quit();
			}

	private static Select newset(WebElement lstcars) {
		// TODO Auto-generated method stub
		return null;
	}

	}


