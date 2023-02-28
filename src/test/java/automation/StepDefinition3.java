package automation;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;

public class StepDefinition3 {
	
	@Before
	
	public void openbrowser() {
		
		System.out.println("openbrowser");
		
	}
	
	@BeforeStep
	
	public void login() {
		
		System.out.println("login");
		
	}
	
	@When ("addEmployee")
	
	public void add_employee() {
		
		System.out.println("AddEmployee");
		
	}
	
	@When ("editEmployee")
	
	public void edit_employee() {
		
		System.out.println("EditEmployee");
		
	}
	
	@When ("deleteEmployee")
	
	public void delete_employee() {
		
		System.out.println("DeleteEmployee");
		
	}
	
	@AfterStep
	
	public void logout() {
		
		System.out.println("Logout");
		
	}
	
	@After
	
	public void closebrowser() {
		
		System.out.println("closeBrowser");
		
	}
	
	

}
