
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.excelant.ExcelAntTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasePage<ExtentSparkReporter> {
	
	public static WebDriver driver;
	public static Exports extent;
	public static ExcelAntTest test;
	FileInputStream fis1;
	Properties pr1;
	
	@BeforeTest
	public void initialSetUp()
	{
		String dirPath=System.getProperty("user.dir")+"\\reports\\";
		File srcDir=new File(dirPath);
		srcDir.mkdir();
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		
		date=date.replace(":", "-");
		
		System.out.println(date);
		
		File reportFile=new File(dirPath+date+".html");
		
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportFile);
		
		reporter.config().setDocumentTitle("Test Adactin Regression Suite");
		
		reporter.config().setReportName("Adactin Test Results");
		
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Reyaz Shaik");
		
		
	}
	@BeforeClass
	public void setUp() throws IOException
	{
		fis1=new FileInputStream("Properties\\config.properties");
		pr1=new Properties();
		pr1.load(fis1);
	}
	
	
	@BeforeMethod
	public void startTest()
	{
		
		String browserName=pr1.getProperty("browser");
		
		switch (browserName) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			driver = new ChromeDriver();

			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

			break;

		case "ie":

			System.setProperty("webdriver.ie.driver", "drivers\\InternetExplorerDriver.exe");

			driver = new InternetExplorerDriver();

			break;

		default:

			System.out.println("Not supported browser");

		}
		
		
		driver.get(pr1.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterTest
	public void endTest()
	{
		extent.flush();
	}
	
	
	
	
	
	
	
	

}
