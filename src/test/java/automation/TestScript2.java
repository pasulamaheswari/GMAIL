package automation;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class TestScript2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		String[] name = new String[5];
		
		try {
			System.out.println(name[0]);
			
			System.out.println(name[5]);
			
			int i=100/0;
			
		}catch(ArrayIndexOutOfBoundsException exception) {
			
			System.out.println(exception.toString());
			
		}catch(ArithmeticException exception) {
			
			System.out.println(exception.toString());
		}finally {
			
			System.out.println("Finally block");
			
		}
		
		System.out.println("End");
	
	}

}
