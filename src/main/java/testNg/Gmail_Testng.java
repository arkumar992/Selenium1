package testNg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmail_Testng {


	ChromeDriver driver;
	
	
	@BeforeMethod()
	
	public void beforeMethod()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");

	}
	
	
	@DataProvider()
	public Iterator<Object[]> getTestda()
	{
		ArrayList<Object[]> td =Testdatacall.getTestdata();
		return td.iterator();
	}
	
	
	
	@Test(dataProvider="getTestda")
	public void casE(String fname, String lname, String uname)
	{
		
		
		System.out.println("test");
		
		driver.findElementById("firstName").sendKeys(fname);
		driver.findElementById("lastName").sendKeys(lname);
		driver.findElementById("username").sendKeys(uname);
	}
	
	
	@AfterMethod()
	public void Close()
	{
		
		
	System.out.println("Sucess");
	}
	
	
}
