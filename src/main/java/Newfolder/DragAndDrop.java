package Newfolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByLinkText("http://jqueryui.com/draggable/").click();
		driver.findElementByXPath("//a[text()='Draggable']").click();
		System.out.println(driver.findElementByXPath("//p[text()='Allow elements to be moved using the mouse.']").getText());
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementByXPath("//p[text()='Drag me around']").getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElementByClassName("entry-title").getText());
		driver.findElementByXPath("//a[text()='Droppable']").click();
		driver.close();

	}

}
