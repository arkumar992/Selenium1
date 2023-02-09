package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyVerifyLead extends Annotations {
	
	public MyVerifyLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "viewLead_firstName_sp")
	WebElement  firstName;
	@FindBy(id = "viewLead_companyName_sp")
	WebElement  companyname;
	
	
	public MyVerifyLead verfiyCreateLead(String expect) {
		
		verifyExactText(firstName, expect);
		
		return this;
	}
	
	
	public MyVerifyLead verfiyEditLead(String expect) {
		
		verifyExactText(companyname, expect);
		
		return this;
	}
	
	
public MyVerifyLead verfiyDuplicateLead(String expect) {
		
		verifyExactText(companyname, expect);
		
		return this;
	}
}
