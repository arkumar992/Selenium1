package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyFindLeadSearch extends Annotations {
	
	public MyFindLeadSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name = 'firstName'])[3]")
	WebElement FirstName;
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement FindLead;
	
	@FindBy(xpath = "(//a[@class='linktext'])[4]")
	WebElement Firstlink;
	
	public MyFindLeadSearch FirstName(String fName) {
		clear(FirstName);
		type(FirstName, fName);
		return this;
	}
	public MyFindLeadSearch FindLead() {
		click(FindLead);
		return this;
	}
	public MyFindLeadSearch sleep() throws Exception {
		java.lang.Thread.sleep(3000);
		return this;
	}
	
		public MyViewLead Firstlink() {
		click(Firstlink);
		return new MyViewLead();
	}

	
}
