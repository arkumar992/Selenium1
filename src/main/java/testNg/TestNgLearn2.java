package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Screencap.class)
public class TestNgLearn2 extends Screencap {
	
	
	WebDriverWait wait ;
	@BeforeMethod()
	public void beforeMethod()
	{
		driver = new ChromeDriver();
		wait  = new WebDriverWait(driver,10);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
	}
	
	@Test(priority=1)
	public void thirdTest()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		System.out.println("test data third test");
	
	}
	@Test(priority=2)
	public void fourthTest() throws InterruptedException
	{
		
		System.out.println("test data fourth test");
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(9000);
		driver.findElementByLinkText("eCommerce").click();
		
		driver.findElementByXPath("//a[@class='buttontext1']").click();
	
	}
	
	@AfterMethod()
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.quit();
	//driver.findElementByXPath("//a[text()='Logout']").click();
	//driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByLinkText("CRM/SFA").click();
	}
	
	

}
