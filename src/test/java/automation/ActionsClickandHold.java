package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickandHold {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement sourse = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(sourse).release(target).perform();
		
		driver.switchTo().defaultContent();

	}

}
