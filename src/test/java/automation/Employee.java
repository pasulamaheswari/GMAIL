package automation;

import java.security.PublicKey;

public class Employee {
	int id ;
	
	double salary;
	
	String  name;
	 
	public  Employee(int empid,double empsalary , String empname) {
		
		id = empid;
		salary = empsalary;
		name = empname;
		
	} 
	
	public void display() {
		
		System.out.println(id);
		
		System.out.println(salary);
		
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1111,999999.99,"MAHI");
		
		e1.display();
		
		Employee e2 = new Employee(1112,888888.88,"Harsha");
		
		e2.display();
	
		}
		
	
	}


