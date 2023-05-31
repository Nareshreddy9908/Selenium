package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String path = "C:\\seleniumwebdriverpracticeprograms\\selenium\\datafiles\\employee.xlsx";
		
		//String path =".//datafiles//semployee.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workbook.getSheet("employee");
	XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows =sheet.getLastRowNum();
		int cols =sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row =sheet.getRow(r);
			
		
		for(int c=0;c<cols;c++) {
			XSSFCell cell=row.getCell(c);
			
			switch(cell.getCellType()) {
				
			case STRING : System.out.print(cell.getStringCellValue());break;
			case NUMERIC : System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN : System.out.print(cell.getBooleanCellValue());break;
			
				
			}
		
		System.out.print(" | ");
		}
		
		System.err.println();
		}
		
		
		
	}

}
