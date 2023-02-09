package day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
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
	s.selectByIndex(3);
	driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Rajni");
	WebElement lobj= driver.findElementById("userRegistrationForm:prelan");
	Select ls= new Select(lobj);
	ls.selectByIndex(1);
	driver.findElementById("userRegistrationForm:firstName").sendKeys("Ragavi");
	driver.findElementById("userRegistrationForm:middleName").sendKeys("C");
	driver.findElementById("userRegistrationForm:lastName").sendKeys("Chandrasekaran");
	driver.findElementById("userRegistrationForm:gender:1").click();
	driver.findElementById("userRegistrationForm:maritalStatus:1").click();
	WebElement dobj= driver.findElementById("userRegistrationForm:dobDay");
	Select sdobj = new Select(dobj);
	sdobj.selectByIndex(7);
	WebElement mon=driver.findElementById("userRegistrationForm:dobMonth");
	Select smon = new Select(mon);
	smon.selectByVisibleText("DEC");
	WebElement yr = driver.findElementById("userRegistrationForm:dateOfBirth");
	Select yrob= new Select(yr);
	yrob.selectByIndex(9);
	WebElement occ= driver.findElementById("userRegistrationForm:occupation");
	Select socc= new Select(occ);
	socc.selectByIndex(7);
	driver.findElementById("userRegistrationForm:uidno").sendKeys("23232");
	driver.findElementById("userRegistrationForm:idno").sendKeys("p2434");
	WebElement country= driver.findElementById("userRegistrationForm:countries");
	Select scountry = new Select(country);
	scountry.selectByIndex(1);
	driver.findElementById("userRegistrationForm:email").sendKeys("ragavic08@gmail.com");
	//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
	driver.findElementById("userRegistrationForm:mobile").sendKeys("9566120433");
	WebElement nation= driver.findElementById("userRegistrationForm:nationalityId");
	Select snation = new  Select(nation);
	snation.selectByIndex(1);
	driver.findElementById("userRegistrationForm:address").sendKeys("No:34");
	driver.findElementById("userRegistrationForm:street").sendKeys("Vallalar Nagar");
	driver.findElementById("userRegistrationForm:area").sendKeys("Avadi");
	driver.findElementById("userRegistrationForm:pincode").sendKeys("600072");
	Thread.sleep(8000);
	driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
	
	//driver.findElementById("userRegistrationForm:statesName").sendKeys(Keys.TAB);
	
	Thread.sleep(3000);
	WebElement city = driver.findElementById("userRegistrationForm:cityName");
	Select  scity=new Select(city);
	scity.selectByIndex(1);
	Thread.sleep(2000);
	WebElement post=driver.findElementById("userRegistrationForm:postofficeName");
	Select spost = new Select(post);
	spost.selectByIndex(3);
	driver.findElementById("userRegistrationForm:landline").sendKeys("044766644");
	driver.findElementById("userRegistrationForm:resAndOff:0").click();

	}

}
