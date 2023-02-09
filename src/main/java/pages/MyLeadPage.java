package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadPage extends Annotations {
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Create Lead")
	WebElement  eleCreartLead;
	
	@FindBy(linkText = "Merge Leads")
	WebElement  eleMergeLead;
	
	@FindBy(linkText = "Find Leads")
	WebElement  eleFindLead;

	public MyCreateLead clickCreateLead() {
		click(eleCreartLead);
		return new MyCreateLead();
	}
	
	public MyMergeSearch clickMergelead() {
		click(eleMergeLead);
		return new MyMergeSearch();
	}
	
	public MyFindLeadSearch clickFindlead() {
		click(eleFindLead);
		return new MyFindLeadSearch();
	}
	
	
}
