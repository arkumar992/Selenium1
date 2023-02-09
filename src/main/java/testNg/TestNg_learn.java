package testNg;

import java.util.Set;


import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNg_learn  {
	
	ChromeDriver driver = new ChromeDriver();
	
	
	@BeforeMethod()
	
	public void beforeMethod()
	{
		
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		

	}
	
	@Test(priority=2)
	public void firstTest() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByXPath("//a[text()='CRM/SFA']").click();
	
	}
	@Test(priority=1)
	public void secondTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElementByXPath("//a[contains(text(),'eCommerce')]").click();
		
		  
	
	}
	
	@AfterMethod()
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.navigate().back();
	//driver.findElementByXPath("//a[text()='Logout']").click();
	driver.findElementByClassName("decorativeSubmit").click();
	}
	@AfterTest()
	public void Close()
	{
		
		
		driver.quit();
	}
	
}
