package selflearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//test
		// Tab to next element in single command ******************
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElementById("email")).sendKeys("test").click(driver.findElementById("pass")).click().build().perform();
		//ac.moveToElement(driver.findElementById("highlight-addons")).perform();
		//driver.findElementByLinkText("SpiceMax").click();
		
		//.build()
		//WebElement ac1 = 
		
		
		
		
		
	}

}
