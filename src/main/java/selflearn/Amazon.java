package selflearn;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(9000);
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("bags ");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElementsByXPath("//div[@id='suggestions']//div[@class='s-suggestion']");
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("bags for kids"))
					{
				list.get(i).click();
				break;
					}
		}
		/*driver.findElementByXPath("//a[@id='nav-your-amazon']").click();
		driver.findElementById("ap_email").sendKeys("9789367057");
		driver.findElementById("continue").click();
		//.findElementByXPath(using)
		Thread.sleep(3000);
		String Value =driver.findElementByClassName("a-list-item").getText();
		Alert a =driver.switchTo().alert();
		String Value = a.getText();
		System.out.println(Value);*/

		
		
		
	}

}
