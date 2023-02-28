package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.ClosedByInterruptException;

public class TestScript1 {

	public static void main(String[] args) throws Exception {
		
		try {
			
			Thread.sleep(1000);
			
			File file = new File("D:\\Testdata.Xlsx");
			
			FileInputStream inputStream = new FileInputStream(file);
			
		}catch(InterruptedException exception) {
			
			System.out.println(exception.toString());
			
		}catch(FileNotFoundException exception) {
			
			System.out.println(exception.toString());
		}finally {
			
		}

	}

}
