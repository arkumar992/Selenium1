package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyViewLead extends Annotations {
	
	public MyViewLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit']")
	WebElement  Edit;
	
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement  Delete;
	
	@FindBy(xpath = "//a[text()='Duplicate Lead']")
	WebElement  Duplicate;
	
		
	
	public MyEditLead Edit() {
		
		click(Edit);
		
		return new MyEditLead();
	}
	
public MyLeads Delete() {
		
		click(Delete);
		
		return new MyLeads();
	}

public MyDuplicateLead Duplicate() {
	click(Duplicate);
	return new MyDuplicateLead();
}
	
}
