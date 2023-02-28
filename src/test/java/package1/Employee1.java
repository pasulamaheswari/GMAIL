package package1;


public class Employee1 {
	
	private int id;
	
	private double salary;
	
	private String name;
	
	{
		
		
		this.id=id;
		
		this.salary=salary;
		
		this.name=name;
		
	}
	
	public Employee1(int i, double d, String name) {
		
	}
	
	

	public String tostring() {
		
		return id+ " "+salary+ " "+name;
		
	}

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1111,999999.99,"MAHI");
		
		System.out.println(e1.tostring());
	}

}
