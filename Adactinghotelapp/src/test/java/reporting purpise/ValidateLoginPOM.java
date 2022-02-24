package regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import pages.SearchHotelPage;

public class ValidateLoginPOM extends BasePage{
	
	
	@Test(dataProvider="getData")
	public void validateLoginTest(String u,String p,String title)
	{
		
		test=extent.createTest("validateLoginTest");
		
		LoginPage loginPage=new LoginPage(driver);
				
		//loginPage.usernameTextBox("reyaz1213");
		
		//loginPage.passwordTextBox("reyaz1234");
		
		//loginPage.loginButton();
		
		loginPage.username(u);
		
		loginPage.password(p);
		
		loginPage.login();
		
		Assert.assertEquals(driver.getTitle(), title);
		
		SearchHotelPage  searchHotelPage=new SearchHotelPage(driver);
		
	}


	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\ExcelData\\LoginData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Iterator<Row> rows=ws.iterator();
		
		//to skip first row
		int noOfCells=rows.next().getPhysicalNumberOfCells();
		
		int noOfRows=ws.getLastRowNum();
		
		Row row=null;
		
		Object[][] obj=new String[noOfRows][noOfCells];
		
		for(int i=0;i<noOfRows;i++)
		{
			row=rows.next();
			for(int j=0;j<noOfCells;j++)
			{
			obj[i][j]=row.getCell(j).getStringCellValue();
			
			System.out.println("row"+i+"cell"+j+obj[i][j]);
			}
		}
		
				
		return obj;
		
	}
	
	
	
}
