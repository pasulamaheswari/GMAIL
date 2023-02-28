package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestScript {

	public static void main(String[] args) throws InterruptedException,FileNotFoundException{
		
		Thread.sleep(1000);
		
		File file = new File("D:\\Testdata.Xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);

	}

}
