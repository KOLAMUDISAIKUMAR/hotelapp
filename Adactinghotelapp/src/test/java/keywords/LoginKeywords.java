package keywords;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords {
	WebDriver driver;
	FileInputStream fis1;
	Properties pr1;
	public void startBrowser() throws IOException
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
		
		
		
		
	}
	
	
	
	public void launchApp()
	{
		
		driver.get(pr1.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	
	public void enterText(String xpath,String text)
	{
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	
	public void clickButton(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	public void enterUserName(String xpath,String text)
	{
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void enterPassword(String xpath,String text)
	{
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

}
