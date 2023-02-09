package selflearn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naviga_screenshot_explicitwait {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/Gmail/");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//div[text()='See more of Gmail on Facebook']/following::div/div/a")));
		//driver.findElementByXPath("//div[text()='See more of Gmail on Facebook']/following::div/div/a").click();
		
		
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(Src,new File("D:\\Sel\\Selenium1\\src\\main\\java\\selflearn\\img1.jpg"));*/
		
		
	}

}
