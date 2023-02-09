package day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("123");
		driver.findElementById("userRegistrationForm:password").sendKeys("Password");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Password");
		WebElement wob= driver.findElementById("userRegistrationForm:securityQ");
		Select s= new Select(wob);
		List<WebElement> options = s.getOptions();
	
		System.out.println(options.size());
		
		for(WebElement print:options)
		{
			System.out.println(print.getText());
		}
		WebElement lan= driver.findElementById("userRegistrationForm:prelan");
		Select slan = new Select(lan);
		List<WebElement> store = slan.getOptions();
		System.out.println(store.size());
				
		for(WebElement res: store)
		{
		System.out.println(res.getText()); 	
		}
		
		WebElement dobj= driver.findElementById("userRegistrationForm:dobDay");
		Select sdobj = new Select(dobj);

		List<WebElement> ch=sdobj.getOptions();
		for(WebElement va:ch) {
			System.out.println(va.getText());
		}

		WebElement mon=driver.findElementById("userRegistrationForm:dobMonth");
		Select smon = new Select(mon);
		smon.selectByVisibleText("DEC");
		WebElement yr = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yrob= new Select(yr);
		yrob.selectByIndex(9);
	}

}
