package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream(
				"C:\\eclipse-workspace\\Adactinghotelapp\\src\\test\\resources\\LoginData.xlsx");
		// get file path in workbook
		XSSFWorkbook wb = new XSSFWorkbook(file);
		// get the particular sheet
		XSSFSheet sh = wb.getSheet("LoginData");
		Row row = null;
		Cell cell = null;
		// By using iterator
		Iterator<Row> rows = sh.iterator();
		// using while loop by go to rows
		while (rows.hasNext()) {

			row = rows.next();
			// using while loop by go to cell
			Iterator<Cell> cells = row.iterator();
			while (cells.hasNext()) {
				cell = cells.next();
				if (cell.getCellType() == CellType.STRING) {
					System.out.println(cell.getStringCellValue() + "get string value");
				} else {
					if (cell.getCellType() == CellType.NUMERIC) {
						System.out.println(cell.getStringCellValue() + "get string value pass");
					}
	}
			}
		}
	}
}
