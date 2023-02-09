package selflearn;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Propert {
	public static void main(String[] args) throws IOException
	{
		 
		Properties pr =  new Properties();
		FileInputStream it = new FileInputStream("D:\\Sel\\Selenium1\\src\\main\\java\\selflearn\\Repository.properties");
		pr.load(it);
		String nm = pr.getProperty("Name");
		System.out.println("My name is "+nm);
		
		String cm = pr.getProperty("Company");
		System.out.println("My Company name is "+cm);
		
		String lp = pr.getProperty("Laptop");
		System.out.println("My Laptop name is "+lp);
		
		
		
		String Browser = pr.getProperty("browser");
		if (Browser.equals("chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.popuptest.com/");
			
		}
		 else if (Browser.equals("ie"))
		{
			 
			 System.setProperty("webdriver.internetexplore.driver","\\downloads");
			 InternetExplorerDriver driver = new InternetExplorerDriver();
				driver.get("http://google.com/");
		}
		
		
		
	}

}
