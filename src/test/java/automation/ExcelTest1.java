package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sha256WithSM2;

public class ExcelTest1 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Testdata.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		
		System.out.println("sheet1:"+workbook.getNumberOfSheets());
		
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");
		
		sheet.getRow(0).createCell(4).setCellValue("status");
		
		sheet.getRow(1).createCell(4).setCellValue("pass");
		
		workbook.write(new FileOutputStream(file));
		
		System.out.println("#Rows:"+sheet.getPhysicalNumberOfRows());
		
		System.out.println("FirstRowNumber:"+sheet.getFirstRowNum());
		
		System.out.println("LastRowNumber:"+sheet.getFirstRowNum());
		
		System.out.println("#Columns:"+sheet.getRow(0).getPhysicalNumberOfCells());
		
		System.out.println("FirstColumnNumber:"+sheet.getRow(0).getFirstCellNum());
		
		System.out.println("LastColumnNumber:"+sheet.getRow(0).getLastCellNum());
		
		for(int rowIndex = sheet.getFirstRowNum();rowIndex<=sheet.getLastRowNum();rowIndex++) {
			
		for(int colIndex = sheet.getRow(rowIndex).getFirstCellNum();colIndex<=sheet.getRow(rowIndex).getLastCellNum();colIndex++) {
			
			System.out.println(sheet.getRow(rowIndex).getCell(colIndex).toString()+ "\t");
			
		}
		
		System.out.println();
		
		}
	


	}

}
