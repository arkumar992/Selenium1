package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyDuplicateLead extends Annotations {
	
	public MyDuplicateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "updateLeadForm_companyName")
	WebElement  Companyname;
	
	@FindBy(xpath = "(//input[@name='submitButton'])[1]")
	WebElement  update;
	
	public MyDuplicateLead companyname(String Cname) {
		
		type(Companyname,Cname);
		return this;
	}
	
public MyVerifyLead update() {
		
	click(update);
		return new MyVerifyLead();
	}
}
