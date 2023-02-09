package week4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		WebElement selectObj = driver.findElementByXPath("//a[text()='Sortable']");
		selectObj.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement frameObj = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameObj);
		WebElement itemOneObj = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement itemFiveObj = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		int y = itemFiveObj.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(itemOneObj, 0, y).perform();

	}

}
