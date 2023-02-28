package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	private WebDriver driver = null;
	
	@Given("open browser and enter application url")
	public void open_browser_and_enter_application_url() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	@When("enter Username,Password and click login")
	public void enter_username_password_and_click_login() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("admin123")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Verification for Homepage")
	public void verification_for_homepage() {
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		Assert.assertNotNull(webElement);
	}

	@When("click on logout button")
	public void click_on_logout_button() {
		
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}

	@When("close browser")
	public void close_browser() {
		
		driver.quit();
	}


}
