package selflearn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFindelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List <WebElement> li =  driver.findElementsByTagName("a");
		int n = li.size();
		String s;
		for(int i=0;i<n;i++)
		{
		s = li.get(i).getText();
		System.out.println(s);
		
		}

	}

}
