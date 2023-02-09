package hwday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HWThreeCloseFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Close Me']").click();
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("//button[text()='Close Me']").click();
		//driver.switchTo().frame("childIframe");
		//driver.findElementByXPath("//button[text()='Close Me']").click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']//p//button").click();	
		driver.switchTo().frame("childIframe");
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']//p//button").click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("childIframe");
		//driver.findElementByXPath("//button[text()='parent.topLayout.toggle('west')']").click();
		


	}

}
