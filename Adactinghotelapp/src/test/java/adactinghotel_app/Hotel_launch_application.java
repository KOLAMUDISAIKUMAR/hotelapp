package adactinghotel_app;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hotel_launch_application extends Baseclass {
	SoftAssert asserts=new SoftAssert();

	@BeforeMethod
	public void launch_browser() {
		openBrowserlaunch("chrome");
		wait1(10);
	}
/*
	@Test(priority = 0)
	public void launch_application() throws Exception {
		Hotel_app_login();
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (actualURL.contains("https://adactinhotelapp.com/")) {
			System.out.println("URL contains adactinghotel");
		} else {
			System.out.println("URL doesn't contains adactinghotelapp");
		}
	}  */
	
	/*
	 * public void title() { String expectedtitle ="adactinhotelapp"; String
	 * actualltitle = driver.getTitle(); System.out.println(actualltitle); if
	 * (expectedtitle.equals(actualltitle)) { System.out.println("title is match");
	 * } }
	 * 
	 */
/*
	@Test(priority = 1)
	public void Tc_2() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");
		Thread.sleep(50000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("14/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("12/02/2020");
		driver.findElement(By.id("datepick_out")).click();

	}
*//*
	@Test(priority = 2)
	public void Tc_3() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");
		Thread.sleep(50000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("03/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("05/02/2020");
		driver.findElement(By.id("datepick_out")).click();
	}
*//*
	@Test(priority = 3)
	public void Tc_4() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");
		Thread.sleep(10000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("adult_room")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("child_room")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(9000);
		// driver.findElement(By.id("child_room")).click();
		// new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("1 -
		// One");

	}
*/ /*
@Test(priority = 4)
public void Tc_5() throws Exception {
	Hotel_app_login();
	driver.findElement(By.id("location")).click();
	new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
	Thread.sleep(10000);
	driver.findElement(By.id("hotels")).click();
	new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
	Thread.sleep(10000);
	driver.findElement(By.id("room_type")).click();
	new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
	Thread.sleep(10000);
	driver.findElement(By.id("room_nos")).click();
	new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");
	Thread.sleep(10000);
	driver.findElement(By.id("datepick_in")).click();
	driver.findElement(By.id("datepick_in")).clear();
	driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
	String expDate = "07/02/2020";
//	System.out.println(driver.findElement(By.id("datepick_in")).getAttribute("value"));
	driver.findElement(By.id("datepick_out")).click();
	driver.findElement(By.id("datepick_out")).click();
	driver.findElement(By.id("datepick_out")).clear();
	driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
	String expdate2 = "08/02/2020";
	driver.findElement(By.id("datepick_out")).click();
	System.out.println(driver.findElement(By.id("datepick_out")).getAttribute("value"));
	Thread.sleep(10000);
	driver.findElement(By.id("adult_room")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("child_room")).click();
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
	Thread.sleep(20000);
	driver.switchTo().activeElement();
	// verify the checkin date and check out date is selected or not
	
	// System.out.println(driver.findElement(By.xpath("//input[@id='dep_date_0']")).getAttribute("value"));
    //System.out.println(driver.findElement(By.xpath("//input[@id='arr_date_0']")).getAttribute("value"));
	String actDate = driver.findElement(By.xpath("//input[@id='arr_date_0']")).getAttribute("value");
	Assert.assertEquals(actDate, expDate);
	String actualdate1 = driver.findElement(By.xpath("//input[@id='dep_date_0']")).getAttribute("value");
	Assert.assertEquals(actualdate1, expdate2);

} */

/*
 * boolean checkindate =
 * driver.findElement(By.xpath("//input[@id='arr_date_0']")).isDisplayed();
 * boolean
 * checkoutdate=driver.findElement(By.xpath("//input[@id='dep_date_0']")).
 * isDisplayed();
 * 
 * if(checkindate) { System.out.println("if  date is dipalyed"); }else {
 * System.out.println("if  date is not displayed");
 * 
 * }if(checkoutdate) { System.out.println("if  date is dipalyed"); }else {
 * System.out.println("if  date is not displayed"); }}
 */
/*
 * try{driver.findElement(By.xpath("//input[@id='arr_date_0']")).getText();
 * driver.findElement(By.xpath("//input[@id='dep_date_0']")).getText();
 * 
 * System.out.println("element exist");}catch( NoSuchElementException e) {
 * System.out.println("element not eiest"); } }
 * 
 */
/*
 * @Test(priority = 5) public void Tc_6() throws Exception { Hotel_app_login();
 * driver.findElement(By.id("location")).click(); new
 * Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
 * Thread.sleep(10000); driver.findElement(By.id("hotels")).click(); new
 * Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek"
 * ); Thread.sleep(10000); driver.findElement(By.id("room_type")).click(); new
 * Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard"
 * ); Thread.sleep(10000); driver.findElement(By.id("room_nos")).click(); new
 * Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("3 - Three"
 * ); Thread.sleep(50000); driver.findElement(By.id("datepick_in")).click();
 * driver.findElement(By.id("datepick_in")).clear();
 * driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
 * System.out.println(driver.findElement(By.id("datepick_in")).getAttribute(
 * "value")); driver.findElement(By.id("datepick_out")).click();
 * driver.findElement(By.id("datepick_out")).click();
 * driver.findElement(By.id("datepick_out")).clear();
 * driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
 * driver.findElement(By.id("datepick_out")).click();
 * System.out.println(driver.findElement(By.id("datepick_out")).getAttribute(
 * "value")); Thread.sleep(10000);
 * driver.findElement(By.id("adult_room")).click(); Thread.sleep(10000);
 * driver.findElement(By.id("child_room")).click();
 * driver.findElement(By.xpath("//input[@id='Submit']")).click();
 * Thread.sleep(20000); driver.switchTo().activeElement();
 * System.out.println(driver.findElement(By.xpath("//input[@id='rooms_0']")).
 * getAttribute("value"));
 * 
 * }
 *//*
	@Test(priority = 6)
	public void Tc_7() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Deluxe");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("1 - One");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("room_nos")).getAttribute("value"));
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
		System.out.println(driver.findElement(By.id("datepick_in")).getAttribute("value"));
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		System.out.println(driver.findElement(By.id("datepick_out")).getAttribute("value"));
		Thread.sleep(10000);
		driver.findElement(By.id("adult_room")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("child_room")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(4000);
		driver.switchTo().activeElement();
		System.out.println(driver.findElement(By.xpath("//input[@id='rooms_0']")).getAttribute("value"));

	}
*//*
	@Test(priority = 7)
	public void Tc_8() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("- Select Room Type -");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("room_type")).getAttribute("value"));
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("- Select Number of Rooms -");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("room_nos")).getAttribute("value"));
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("\r\n" + "(dd/mm/yyyy) ");
		System.out.println(driver.findElement(By.id("datepick_in")).getAttribute("value"));
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("\r\n" + "(dd/mm/yyyy) ");
		driver.findElement(By.id("datepick_out")).click();
		System.out.println(driver.findElement(By.id("datepick_out")).getAttribute("value"));
		Thread.sleep(10000);
		driver.findElement(By.id("adult_room")).click();
		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("- Select Adults per Room -");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("adult_room")).getAttribute("value"));
		driver.findElement(By.id("child_room")).click();
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("0 - None");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("child_room")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(20000);

	}
*//*
	@Test(priority = 8)
	public void Tc_9() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
		Thread.sleep(5000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("adult_room")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("child_room")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		Thread.sleep(5000);
		Actions moveslider = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//*[@xmlns='http://www.w3.org/1999/xhtml']"));
		moveslider.moveToElement(slider).dragAndDropBy(slider, 700, 700);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("saikumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("kolamudi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("5-4-147/1,kukatpally,hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("5260990104873829");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='cc_type']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='cc_type']"))).selectByVisibleText("Other");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='cc_exp_month']"))).selectByVisibleText("January");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']"))).selectByVisibleText("2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("358");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(10000);
		driver.switchTo().activeElement();
		Actions moveslider1 = new Actions(driver);
		WebElement slider1 = driver.findElement(By.xpath("//html[@xmlns='http://www.w3.org/1999/xhtml']"));
		moveslider1.moveToElement(slider1).dragAndDropBy(slider1, 700, 700);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		Thread.sleep(9000);
	}
*/
	/*
	 * driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	 */

	/*
	@Test(priority = 9)
	public void Tc_10() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Melbourne");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
		Thread.sleep(10000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("adult_room")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("child_room")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(10000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@id='price_night_0']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_price_0']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		System.out.println(driver.findElement(By.xpath("//input[@id='room_num_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_days_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='price_night_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_price_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='gst_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='final_price_dis']")).getAttribute("value"));
	}
*//*
	@Test(priority = 10)
	public void Tc_11() throws Exception {
		Hotel_app_login();
		driver.findElement(By.id("location")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		Thread.sleep(10000);
		driver.findElement(By.id("hotels")).click();
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		Thread.sleep(10000);
		driver.findElement(By.id("room_type")).click();
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		Thread.sleep(10000);
		driver.findElement(By.id("room_nos")).click();
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
		Thread.sleep(10000);
		driver.findElement(By.id("datepick_in")).click();
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).click();
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("08/02/2020");
		driver.findElement(By.id("datepick_out")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("adult_room")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("child_room")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(10000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@id='price_night_0']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_price_0']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(10000);
		driver.switchTo().activeElement();
		System.out.println(driver.findElement(By.xpath("//input[@id='room_num_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_days_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='price_night_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='total_price_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='gst_dis']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='final_price_dis']")).getAttribute("value"));

	}
*/
@Test(priority = 11)
public void Tc_12() throws Exception{
	Hotel_app_login();
	
	
	
	
	}
	@AfterMethod
	public void Close_browser() {
		TearDown();
		driver.quit();

	}
}
