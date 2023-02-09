package selflearn;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://demoqa.com/select-menu");
		System.out.println("Page completed");
		
		WebElement element = driver.findElementById("oldSelectMenu");
		
		Select sc =  new Select(element);
		List<WebElement> we= sc.getOptions();
		System.out.println(we.size());
	
		String d[] = new String[we.size()];
		
		
		for (int i=0; i<we.size();i++)
		{
			
			
			//sc.selectByIndex(i);
			 d[i] = we.get(i).getText();
			Thread.sleep(3000);			
			//System.out.println(s.length);								
		}
		
			for (int i=1;i<we.size();i++)
			{
				driver.navigate().to("https://demoqa.com/select-menu");
				WebElement element1 = driver.findElementById("oldSelectMenu");
				
				Select sc1 =  new Select(element1);
			sc1.selectByVisibleText(d[i]);
					
			}
		
		/*for(WebElement op : we)
		{
			
			String s[]= { op.getText()};
			
			
		}*/
		
		
		/*driver.get("https://www.spicejet.com/");
		WebElement element = driver.findElementById("highlight-addons");
		
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(element).click().build().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='MyFlexiPlan']").click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%';");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='100%';");*/
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		

		
		
		
	}

}
