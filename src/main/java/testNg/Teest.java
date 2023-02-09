package testNg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Teest {
	
	ChromeDriver driver;
	WebDriverWait wait ;
	
	@BeforeMethod()
	
	public void beforeMethod()
	{
		driver = new ChromeDriver();
		wait  = new WebDriverWait(driver,10);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
	}
	
	@Test(priority=1)
	public void thirdTest()
	{
		
		driver.findElementByClassName("decorativeSubmit").click();
		
File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrfile, new File("D:\\Sel\\Selenium1\\snaps\\imgarun.jpg"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		
	
	}
	
	@AfterMethod()
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.quit();
		
	}
	

}
	
