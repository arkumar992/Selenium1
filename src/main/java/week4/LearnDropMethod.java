package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement dropObj = driver.findElementByXPath("//a[text()='Droppable']");
		dropObj.click();
		WebElement frameObj=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameObj);
		WebElement dragAndDropObj= driver.findElementByXPath("//p[text()='Drag me to my target']");
		
		WebElement dropbableObj = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragAndDropObj, dropbableObj).perform();
		
		
	}
	

}
