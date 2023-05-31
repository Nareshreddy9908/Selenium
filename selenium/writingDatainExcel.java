package selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDatainExcel {

	// workbook -> sheets -> rows -> cells;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//create empty workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		
	//create empty sheet 
		XSSFSheet sheet = workbook.createSheet("enpInfo");

		// here [] - first position for row and second position is column
		
		// to maintain the data in two-dimentional formate..
		Object empData[][] = {

				{ "empId", "name", "role" }, 
				{ 101, "Naresh", "SAE" }, 
				{ 102, "Madhu", "manager" },
				{ 103, "Meghanath", "Analyst" }, 
				{ 104, "Harish", "Developer" } };

		// using for loop

		int rows = empData.length; // 5
		int cols = empData[0].length; // 3

		System.out.println(rows);
		System.out.println(cols);

		
		// read the two dimentional array object data and store in the sheet..
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.createCell(c);
				Object value = empData[r][c];

				if (value instanceof String)
					cell.setCellValue((String) value);

				if (value instanceof Integer)
					cell.setCellValue((Integer) value);

				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);

			}
		}
		String path = ".\\datafiles\\employee.xlsx";
		FileOutputStream fos = new FileOutputStream(path);
		workbook.write(fos);
		fos.close();

		System.out.println("Employee.xlsx file written successfully...");

	}

}
