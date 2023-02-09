package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC003_MergeLead extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "MergeLead";
		testCaseName = "mergelead";
		testDescription = "Merge To Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void mergelead(String name1, String name2) throws Exception {
		
		new MyHomePage()
		.clickLeads()
		.clickMergelead()
		.ClickFrom()
		.windowone()
		.firstname1(name1)
		.findButton()
		.sleep()
		.FirstElement()
		.windowzero()
		.ClickTo()
		.windowtwo()
		.FirstName2(name2)
		.FindButton()
		
		.FirstElement()
		.ClickMerge()
		.Alert();
		
		
		
		
		
		
	}
	
		
		
}
