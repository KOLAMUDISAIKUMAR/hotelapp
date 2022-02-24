package exceltests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\kosmik9amDecWS\\Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//case 1 Modifing existing cell
		
		//ws.getRow(0).getCell(1).setCellValue(789);
		
		//Case 2 : creating a new cell in existing row
		
		//ws.getRow(0).createCell(4).setCellValue("Failed");
		
		//Case 3 create a new cell in new row
		
		ws.createRow(2).createCell(0).setCellValue("newCell");
		
		FileOutputStream fos=new FileOutputStream("E:\\kosmik9amDecWS\\Data.xlsx");

		wb.write(fos);
		
		fos.close();
		
	}

}
