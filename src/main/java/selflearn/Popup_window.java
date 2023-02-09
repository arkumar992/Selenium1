package selflearn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Multi-PopUp Test']").click();
		 Set<String> ls = driver.getWindowHandles();
		 Iterator<String> it = ls.iterator();
		 String parent =it.next();
		 driver.switchTo().window(parent);
		 String ti1 =driver.getCurrentUrl();
		 System.out.println("Parent title : "+ti1);
		 String child1 =it.next();
		 driver.switchTo().window(child1);
		 String ch1 =driver.getCurrentUrl();
		 System.out.println("ch1 title : "+ch1);
		 
		 String child2 =it.next();
		 String child3 =it.next();
		 driver.switchTo().window(child2);
		 String ch2 =driver.getCurrentUrl();
		 System.out.println("ch3 title : "+ch2);
		 driver.close();
		 
		 driver.switchTo().window(child3);
		 String ch3 =driver.getCurrentUrl();
		 System.out.println("ch2 title : "+ch3);
		 
		 
		
	}

}
