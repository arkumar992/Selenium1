package hwday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomWorkOneWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set <String>  allwindow=driver.getWindowHandles();
		List<String> listObj= new ArrayList<String>();
		listObj.addAll(allwindow);
		driver.switchTo().window(listObj.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		Set<String> compWindow =driver.getWindowHandles();
		List<String> listOb= new ArrayList<String>();
		listOb.addAll(compWindow);
		driver.switchTo().window(listOb.get(0));
		//driver.findElementByLinkText("http://contents.irctc.co.in/en/CompatibleBrowser.html").click(); 
		driver.findElementByXPath("//a[text()='Compatible Browser']").click();
		//driver.findElementByTagName("a").click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		Set<String> compWindow1 =driver.getWindowHandles();
		List<String> listOb3= new ArrayList<String>();
		listOb3.addAll(compWindow1);
		driver.switchTo().window(listOb3.get(2));
		Thread.sleep(2000);
		
		
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listOb3.get(2));
		
		System.out.println(driver.findElementByXPath("//li[text()='Internet Explorer v9 .0 and above']").getText());
		
		System.out.println(driver.findElementByXPath("//li[text()='Mozilla Firefox v3.5 and above']").getText());
		
		
		System.out.println(driver.findElementByXPath("//li[text()='Google Chrome v3.0 and above']").getText());
		
		System.out.println(driver.findElementByXPath("//li[text()='Opera 22.0 and above']").getText());
		
		

		System.out.println(driver.findElementByXPath("//li[text()='Safari 5.1.2 and above']").getText());
		//driver.quit();
		
	
		
		
		
		
		
		
	}

}
