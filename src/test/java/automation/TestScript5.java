package automation;

import org.testng.annotations.Test;

public class TestScript5 {
	
	@Test(priority = 1,groups = {"Regreesion","Smoke"})
	
	public void addEmployee() {
		
		System.out.println("AddEmployee");
		
	}
	
	@Test(priority =2,groups = {"Regression"} )
	
	public void editEmployee() {
		
		System.out.println("EditEmployee");
		
	}
	
	@Test(priority = 3,groups = {"Smoke"})
	
	public void deleteEmployee() {
		
		System.out.println("DeleteEmployee");
		
	}

}
