package selflearn;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayIsselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");
		
		driver.manage().window().maximize();
		boolean p1 = driver.findElementById("submitButton").isDisplayed();
		System.out.println(p1);
		
		boolean p2 =driver.findElementById("submitButton").isEnabled();
		System.out.println(p2);
		
		boolean p3 =driver.findElementByName("agreeTerms").isSelected();
		System.out.println(p3);
		driver.findElementByName("agreeTerms").click();
		boolean p4 =driver.findElementByName("agreeTerms").isSelected();
		System.out.println(p4);
		
		
	}

}
