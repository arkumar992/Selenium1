package selflearn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		Thread.sleep(3000);
		WebElement FrameEle = driver.findElementByXPath("//iframe[@class='demo-frame']");		
		driver.switchTo().frame(FrameEle);
		driver.findElementByXPath("//li[text()='Item 3']").click();
		driver.switchTo().defaultContent();
		//driver.findElementByXPath("//a[text()='Download']").click();
		driver.findElementByXPath("//a[text()[contains(.,'wnloa')]]").click();
		
		//driver.quit();
//		driver.close();
		
		
		
		
		
		
		
		

	}

}
