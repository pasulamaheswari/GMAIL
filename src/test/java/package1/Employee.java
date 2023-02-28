package package1;

public class Employee {
	
	private int id;
	
	private double salary;
	
	private String name;
	

	public void setid(int id) {
		if (id<=0) {
			
			System.out.println("Invalid EmployeeID");
			
			System.exit(1);
			
		}else {
			
			this.id = id;
			
		}
	
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}

