package pages;

import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeads extends Annotations {
	
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}

		
}
