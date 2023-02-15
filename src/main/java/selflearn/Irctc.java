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
		
		driver.findElementByXPath("//div[@class='text-center h_main_div']//div/a[1]").click();
		
		//driver.findElementById("loginText").click();
		Thread.sleep(2000);
		driver.findElementById("userId").sendKeys("srarun92");
		driver.findElementById("pwd").sendKeys("sep468");		
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
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@placeholder='From*']").sendKeys("TBM");
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text() ='TAMBARAM - TBM']").click();
		
		driver.findElementByXPath("//input[@placeholder='To*']").sendKeys("TEN");	
		
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text() ='TIRUNELVELI - TEN']").click();
		driver.findElementByXPath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']").clear();
		driver.findElementByXPath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']").sendKeys("11-11-2019",Keys.ENTER);
		Thread.sleep(3000);
		String Train_name = driver.findElementById("T_12631").getText();
		System.out.println("Train name: " +Train_name);
		
		
		
		//driver.findElementByXPath("//*[@id='T_12631']//following::div[11]").click();
		//driver.findElementByXPath("//*[@id='T_12631']//following::div[12]//button").click();
		//driver.findElementByXPath("//*[@id='T_12631']//parent::div//parent::div//parent::div//parent::div//button").click();
	
		
		WebElement element = driver.findElementByXPath("//button[contains(@aria-label,'12631')]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(7000);
		String s1 = driver.findElementByXPath("//span[@class='waitingstatus']").getText();
		System.out.println("Text: " +s1);
		
		if (s1.contains("AVAILABLE"))
		{
			driver.findElementByXPath("//button[text()= ' Book Now']").click();
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
