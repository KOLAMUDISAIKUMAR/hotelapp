package adactinghotel_app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
		public static WebDriver driver=null;
		public void openBrowserlaunch(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}	
			return;
				}
		public void wait1(int waitTime) {
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		}
		public void TearDown() {
			driver.close();
		}
		public void Hotel_app_login() throws Exception {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saikumarkolamudi");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ksai9966@");
			driver.findElement(By.xpath("//input[@id='login']")).click();
		
		}
		
		
		public static void entertext(WebElement ele,String text) {
			ele.sendKeys(text);
		}
		public static void clickbutton(WebElement ele) {
			ele.click();
		}
}






