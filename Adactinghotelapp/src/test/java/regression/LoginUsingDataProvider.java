package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProvider {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
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
	public Object[][] getData()
	{
		Object[][] obj=new String[4][3];
		
		obj[0][0]="reyaz0203";
		obj[0][1]="reyaz123";
		obj[0][2]="Adactin.com - Search Hotel";
		
		obj[1][0]="reyaz1210";
		obj[1][1]="reyaz456";
		obj[1][2]="Adactin.com - Hotel Reservation System";
		
		
		obj[2][0]="reyaz1212";
		obj[2][1]="reyaz123";
		obj[2][2]="Adactin.com - Hotel Reservation System";
		
		obj[3][0]="reyaz1212";
		obj[3][1]="reyaz456";
		obj[3][2]="Adactin.com - Hotel Reservation System";
		
		
		
		return obj;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
