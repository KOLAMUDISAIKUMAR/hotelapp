package regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingHybrid {
	
	FileInputStream fis1;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileInputStream fis3;
	XSSFWorkbook wb3;
	XSSFSheet ws3;
	keywords.LoginKeywords keys;
	FileInputStream fis2;
	Properties pr2;
	Iterator<Row> rows;
	
	@BeforeMethod
	public void setExcel() throws IOException
	{
		fis1=new FileInputStream("src\\test\\resources\\LoginKeywords.xlsx");
		
		wb=new XSSFWorkbook(fis1);
		
		ws=wb.getSheet("Sheet1");
		
		
		
		fis2=new FileInputStream("Properties\\locators.properties");
		
		pr2=new Properties();
		
		pr2.load(fis2);
		
		
		keys=new keywords.LoginKeywords();
		
		
		
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String expTitle) throws IOException
	{
		
		rows=ws.iterator();
		
		rows.next();
		
		Row row=null;
		
		while(rows.hasNext())
		{
			
			row=rows.next();
			
			String keyword=row.getCell(4).getStringCellValue();
			
			
			
			if(keyword.equals("startBrowser"))
			{
				keys.startBrowser();
			}
			
			else if(keyword.equals("launchApp"))
			{
				keys.launchApp();
			}
			else if(keyword.equals("enterText"))
			{
							
				keys.enterText(pr2.getProperty(row.getCell(5).getStringCellValue()),row.getCell(2).getStringCellValue());
			}
			else if(keyword.equals("enterUserName"))
			{
							
				keys.enterUserName(pr2.getProperty(row.getCell(5).getStringCellValue()),u);
			}
			else if(keyword.equals("enterPassword"))
			{
							
				keys.enterPassword(pr2.getProperty(row.getCell(5).getStringCellValue()),p);
			}
			else if(keyword.equals("clickButton"))
			{
							
				keys.clickButton(pr2.getProperty(row.getCell(5).getStringCellValue()));
			}
			else if(keyword.equals("quitBrowser"))
			{
							
				keys.quitBrowser();
			}
		}
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		fis3=new FileInputStream("src\\test\\resources\\testdata\\excels\\loginData.xlsx");
		
		wb3=new XSSFWorkbook(fis3);
		
		ws3=wb3.getSheet("credentials");
		
		int noOfRows=ws3.getPhysicalNumberOfRows()-1;
		
		 int noOfCells= ws3.getRow(0).getPhysicalNumberOfCells()-1;
		
		Object[][] obj=new Object[noOfRows][noOfCells];
		
		for(int i=0;i<noOfRows;i++) {
			
			for(int j=0;j<noOfCells;j++)
			{
				obj[i][j]=ws3.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		
	}
	
	
	
	
	
	
	
	

}
