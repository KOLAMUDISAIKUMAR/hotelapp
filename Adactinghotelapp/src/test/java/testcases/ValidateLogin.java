package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateLogin {
	
	WebDriver driver;
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(dataProvider="getData")
	public void validateLoginTest(String u,String p,String expTitle)
	{
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(u);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(p);
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Assert.assertEquals(driver.getTitle(),expTitle);
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		
		
		Object[][] obj=new Object[4][3];
		
		
		//set1
		
		obj[0][0]="reyaz0203";
		obj[0][1]="reyaz123";
		obj[0][2]="Adactin.com - Search Hotel";
		

		//set2
		
		obj[1][0]="reyaz0203";
		obj[1][1]="reyaz456";
		obj[1][2]="Adactin.com - Hotel Reservation System";
		

		//set3
		
		obj[2][0]="reyaz456";
		obj[2][1]="reyaz123";
		obj[2][2]="Adactin.com - Hotel Reservation System";
		

		//set4
		
		obj[3][0]="reyaz0299";
		obj[3][1]="reyaz999";
		obj[3][2]="Adactin.com - Hotel Reservation System";
		
		
				
		
		return obj;
		
		
	}
	

}
