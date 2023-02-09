package Annotation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLeadAnnot extends Annotations {
	
	//@Test(dependsOnMethods={"wdMethods.LoginAnnot.login"})
	//@Test(timeOut=5000)
	//@Test(enabled=false)
	
	@Test()
	public void createLead() {
		
		
		WebElement leadLinkClick = locateElement("xpath","//a[text()='Leads']");
		click(leadLinkClick);
		
		WebElement findLeadClick = locateElement("xpath","//a[text()='Find Leads']");
		click(findLeadClick);
		
		WebElement firstNameType = locateElement("xpath","//input[@name='firstName']");
		type(firstNameType,"Sheeba M");
		
		
		/*WebElement findLeadButtonClick = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButtonClick);
		
		WebElement firstResultingLeadClick = locateElement("xpath","//a[text()='10212']");
		click(firstResultingLeadClick);
		
		verifyTitle("View Lead | opentaps CRM");
		
		WebElement editClick= locateElement("xpath","//a[text()='Edit']");
		click(editClick);
		
		WebElement companyNameChange=locateElement("xpath","//input[@id='updateLeadForm_companyName']");
		companyNameChange.clear();
		type(companyNameChange,"TCS");
		
		
		WebElement updateClick  = locateElement("xpath","//input[@value='Update']");
		click(updateClick);
		
		WebElement confirmChangedCompName  = locateElement("xpath","//span[text()='IBN (10212)']");
		getText(confirmChangedCompName);
		
		verifyExactText(confirmChangedCompName,"IBN (10212)");*/
		closeAllBrowsers();
		
		
		
		
	}

}
