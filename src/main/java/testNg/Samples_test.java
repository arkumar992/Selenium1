package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Samples_test {
	
	
//ChromeDriver driver = new ChromeDriver();
	
	
	@BeforeMethod()
	
	public void beforeMethod()
	{
		
		
		System.out.println("BeforeMethod");
	
		

	}

	
	@Test(priority =3,groups ="Format",expectedExceptions = ArithmeticException.class)
	
	public void casE()
	{
		System.out.println("outputcase1");
		int a =3/0;
		System.out.println("Output "+a);
	}

	@Test(priority =1,invocationCount =2,groups ="case")
	
	public void casE2()
	{
		System.out.println("outputcase2");
	}
	
@Test(priority =2,groups ="case",dependsOnMethods="casE")
	
	public void casE3()
	{
		System.out.println("outputcase3");
		
	}
	
	@AfterMethod()
	
	public void exit()
	
	{
		System.out.println("Exitdone");
	}
	
}
