package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		RemoteWebDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("TCSS");
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ragavi");
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("C");
	driver.findElementByClassName("smallSubmit").click();
	}

}
