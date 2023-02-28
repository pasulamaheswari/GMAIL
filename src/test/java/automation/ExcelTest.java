package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Testdata.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		
		System.out.println("#sheet:"+workbook.getNumberOfSheets());
		
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");
		
		System.out.println("#Rows:"+sheet.getPhysicalNumberOfRows());
		
		System.out.println("FirstRowNumber:"+sheet.getFirstRowNum());
		
		System.out.println("LastRowNumber:"+sheet.getLastRowNum());
		
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
