package hwday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWrkFiveWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Multi-PopUp Test #2']").click();
		
		
		Set <String>  allwindow=driver.getWindowHandles();
		List<String> listObj= new ArrayList<String>();
		listObj.addAll(allwindow);
		driver.switchTo().window(listObj.get(1));
		driver.close();
		Thread.sleep(5000);
		
		
		Set <String>  allwindow1=driver.getWindowHandles();
		List<String> listObj1= new ArrayList<String>();
		listObj1.addAll(allwindow1);
		driver.switchTo().window(listObj1.get(1));
		driver.close();
		
		Thread.sleep(3000);

		Set <String>  allwindow2=driver.getWindowHandles();
		List<String> listObj2= new ArrayList<String>();
		listObj2.addAll(allwindow2);
		driver.switchTo().window(listObj2.get(1));
		driver.close();
		
		Thread.sleep(5000);
		
/*
		Set <String>  allwindow5=driver.getWindowHandles();
		List<String> listObj5= new ArrayList<String>();
		listObj5.addAll(allwindow5);
		driver.switchTo().window(listObj5.get(1));
		driver.close();
		*/
		Thread.sleep(5000);
		Set <String>  allwindow3=driver.getWindowHandles();
		List<String> listObj3= new ArrayList<String>();
		listObj3.addAll(allwindow3);
		driver.switchTo().window(listObj3.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
	//	Thread.sleep(3000);
/*	
		Set <String>  allwindow3=driver.getWindowHandles();
		List<String> listObj3= new ArrayList<String>();
		listObj3.addAll(allwindow3);
		driver.switchTo().window(listObj3.get(4));
		driver.close();*/
		
		
		
		//String s =driver.switchTo().window(driver.findElementByTagName("button"));
	
		/*Set <String>  allwindow=driver.getWindowHandles();
		List<String> listObj= new ArrayList<String>();
		listObj.addAll(allwindow);
		
		Set <String>  allwindow=driver.getWindowHandles();
		List<String> listObj= new ArrayList<String>();
		listObj.addAll(allwindow);
		driver.switchTo().window(listObj.get(1));
		
		
		
		*/
		
	}

}
