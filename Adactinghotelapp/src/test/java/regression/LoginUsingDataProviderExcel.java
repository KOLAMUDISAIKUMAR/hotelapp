package regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProviderExcel {

	WebDriver driver;
	FileInputStream fis1;
	Properties pr1;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		fis1=new FileInputStream("Properties\\config.properties");
		
		pr1=new Properties();
		
		pr1.load(fis1);
		
		String browserName=pr1.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		driver.get(pr1.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String userName,String password,String expTitle)
	{
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), expTitle);	
		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		 FileInputStream fis=  new FileInputStream("src\\test\\resources\\testdata\\excels\\loginData.xlsx");
		
		 XSSFWorkbook   wb=new XSSFWorkbook(fis);
		 
		XSSFSheet ws= wb.getSheet("credentials");
		
		int rows=ws.getPhysicalNumberOfRows()-1;
		
		int cells=ws.getRow(0).getPhysicalNumberOfCells()-1;
		 
		Object[][] obj=new String[rows][cells];
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cells;j++)
			{
				obj[i][j]=ws.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
