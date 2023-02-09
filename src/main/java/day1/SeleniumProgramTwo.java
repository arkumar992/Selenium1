package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);

		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().window().getSize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("useUU7rname").sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement s = driver.findElementById("createLeadForm_industryEnumId");
		Select sobj = new Select(s);
		sobj.selectByIndex(8);
		// to get list of options from select dropdown
		List<WebElement> allOptions = sobj.getOptions();
		int size = allOptions.size();
		sobj.selectByIndex(size-1);		
		
		for (WebElement disp : allOptions)

		{
			System.out.println(disp.getText());
	
		}	

	}

}
