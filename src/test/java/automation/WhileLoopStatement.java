package automation;

public class WhileLoopStatement {

	public static void main(String[] args) {

		String browser = "chrome";
		
		while (browser.equals("chrome")) {
			
			System.out.println("chrome Browser Execution");
			
			browser = "firefox";
			
		}
	}

}
