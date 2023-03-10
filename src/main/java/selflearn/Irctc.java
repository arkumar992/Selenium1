package selflearn;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		
		// Chrome.setHeadless(true); Headless browser comments
		Chrome.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println("Page completed");
		Thread.sleep(9000);		
		
		/*Alert myAlert = driver.switchTo().notify();
		String alertText = myAlert.getText();
		System.out.println(alertText);
		myAlert.dismiss();*/
		
		//input[@formcontrolname='userid']
	
		driver.findElementByXPath("//div[@class='text-center h_main_div']//div/a[1]").click();
		
		//driver.findElementById("loginText").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@formcontrolname='userid']").sendKeys("srandal");
		//old driver.findElementById("userId").sendKeys("srarun92");
		driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys("Tamil@2020");		
		Scanner cp = new Scanner(System.in);
		System.out.println("Enter the captcha");
		String s = cp.nextLine();
		try
		{
			driver.findElementById("captcha").sendKeys(s);
		
		}
		catch(Exception e)
		{
			driver.findElementById("nlpAnswer").sendKeys(s);
		}
		
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text() = 'SIGN IN']").click();
		Thread.sleep(2000);
		System.out.println("Sign in done");
		Thread.sleep(6000);
		//driver.findElementByXPath("//input[@placeholder='From*']").sendKeys("TBM");
		//driver.findElementByXPath("//label[text()='From']//preceding-sibling::p-autocomplete").sendKeys("TBM");
		
		Actions ac = new Actions(driver);
		
		WebElement from = driver.findElementByXPath("//label[text()='From']");
		ac.moveToElement(from).click().build().perform();
		//driver.findElementByXPath("from").sendKeys("TBM");
		//ac.sendKeys(from, "TeM");
		
		driver.findElementByXPath("//label[text()='From']//preceding-sibling::p-autocomplete/span/input").sendKeys("TBM");
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text() ='TAMBARAM - TBM']").click();
		
		//driver.findElementByXPath("//input[@placeholder='To*']").sendKeys("TEN");	
		driver.findElementByXPath("//p-autocomplete//following::input[@role='searchbox']").sendKeys("TEN");	
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text() ='TIRUNELVELI - TEN']").click();
		Thread.sleep(3000);
		////span[contains(@class,'calendar')]
		ac.moveToElement(driver.findElementByXPath("//p-calendar[@id='jDate']")).click().build().perform();
		//driver.findElementByXPath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']").clear();
		
		
		
		 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 ac.sendKeys(Keys.BACK_SPACE).build().perform();
		//ac.click(driver.findElementByXPath("//p-calendar[@id='jDate']")).sendKeys(Keys.CONTROL + "a").build().perform();
		Thread.sleep(6000);
		//ac.click(driver.findElementByXPath("//p-calendar[@id='jDate']")).sendKeys(Keys.BACK_SPACE).build().perform();
		ac.click(driver.findElementByXPath("//p-calendar[@id='jDate']")).sendKeys("14/04/2023").build().perform();
		driver.findElementByXPath("//button[text()='Search']").click();
		//driver.findElementByXPath("//span[contains(@class,'calendar')]/input)").sendKeys("13/04/2023",Keys.ENTER);

		//driver.findElementByXPath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']").sendKeys("11-11-2019",Keys.ENTER);
		Thread.sleep(3000);
		String Train_name = driver.findElementByXPath("//strong[contains(text(),'12631')]").getText();
		System.out.println("Train name: " +Train_name);
		
		
		
		//driver.findElementByXPath("//*[@id='T_12631']//following::div[11]").click();
		//driver.findElementByXPath("//*[@id='T_12631']//following::div[12]//button").click();
		//driver.findElementByXPath("//*[@id='T_12631']//parent::div//parent::div//parent::div//parent::div//button").click();
	
		
		WebElement element = driver.findElementByXPath("//strong[contains(text(),'12631')]/parent::div/parent::div/following-sibling::div[4]//table//td[1]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		//js.executeScript("arguments[0].click();", element);
		
		Thread.sleep(7000);
		element.click();
		String s1 = driver.findElementByXPath("//strong[contains(text(),'12631')]/parent::div/parent::div/following-sibling::div[6]//table//td[2]/div/div[2]").getText();
		System.out.println("Text: " +s1);
		//  //button[contains(text(), 'Book')]
		if (s1.contains("AVAILABLE"))
		{
			driver.findElementByXPath("//button[text()= ' Book Now']").click();  /// Need to update x path
		}
		else
		{
			System.out.println("Seats not avilable");
		}
		
		WebElement Element =	driver.findElementByXPath("//a[contains(text(),'My Saved Passenger')]");
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElementByXPath("//a[contains(text(),'My Saved Passenger')]").click();
		driver.findElementByXPath("//label[contains(text(),'arun')]").click();
		driver.findElementByXPath("//span[contains(text(),' Select Passengers')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'terms ')]//parent::label").click();
		
		System.out.println("Enter The Captcha : ");
		
		WebElement element1 = driver.findElementByXPath("//div[@id='nlpImgContainer']");
		js.executeScript("arguments[0].scrollIntoView();", element1);
		String s2 = cp.nextLine();
		driver.findElementByXPath("//input[@id='mobileNumber']//following::div[@id='nlpInput'][1]").click();
		//driver.findElementByXPath("//input[@id='mobileNumber']//following::div[@id='nlpInput'][1]").sendKeys(s2);
		Thread.sleep(3000);
       //js.executeScript("document.getElementById('nlpInput').value ="+s2+"");
		//js.executeScript("arguments[0].click();", element);
//js.executeScript("arguments[1].value = "+s2+";",element1);
		driver.findElementById("nlpAnswer").sendKeys(s2);
		driver.findElementByXPath("//button[contains(text(),'Continue Booking ')]").click();
		Thread.sleep(3000);
		WebElement cnt =	driver.findElementByXPath("//span[contains(text(), 'AVAILABLE')]//following::div[24]//button[2]");
		js.executeScript("arguments[0].scrollIntoView();", cnt);
		cnt.click();
		//driver.findElementByXPath("//button[contains(text(),'Continue Booking')]").click();
		Thread.sleep(2000);
		
		WebElement net =	driver.findElementByXPath("//input[@aria-label='HDFC Bank']");
		js.executeScript("arguments[0].scrollIntoView();", net);		
		net.click();
		
		driver.findElementByXPath("//input[@aria-label='HDFC Bank']//following::button").click();
		
		
		
		
		
	}

}
