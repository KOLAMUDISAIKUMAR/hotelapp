package exceltests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		 FileInputStream fis=  new FileInputStream("src\\test\\resources\\testdata\\excels\\loginData.xlsx");
		
		 XSSFWorkbook   wb=new XSSFWorkbook(fis);
		 
		XSSFSheet ws= wb.getSheet("credentials");
		
		System.out.println(ws.getPhysicalNumberOfRows());
		
		System.out.println(ws.getRow(0).getPhysicalNumberOfCells());
		
	}
	
}
