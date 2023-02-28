package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript6 {
	
	@Test(priority = 1)
	
	
	public void addEmployee() {
		
		System.out.println("AddEmployee");
		
		Assert.assertTrue(true);
		
	}
	
	@Test(priority = 2,dependsOnGroups = "addEmployee")
	
	public void editEmployee() {
		
		System.out.println("EditEmployee");
		
	}
	
	@Test(priority = 3,dependsOnGroups = "addEmployee")
	
	public void deleteEmployee() {
		
		System.out.println("DeleteEmployee");
		
	}

}
