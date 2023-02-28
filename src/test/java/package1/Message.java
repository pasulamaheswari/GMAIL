package package1;

public class Message {
	
	public static void display() {
		
		System.out.println("Hello....");
		
	}
	
	public static void display(String firstName) {
		
		System.out.println("Hello...."+firstName);
		
	}
	
	public static void display(String firstName,String lastName) {
		
		System.out.println("Hello...."+firstName+" "+lastName);
		
	}

	public static void main(String[] args) {
		
		Message.display();
		
		Message.display("MAHI");
		
		Message.display("MAHI","P");

		
	}

}
