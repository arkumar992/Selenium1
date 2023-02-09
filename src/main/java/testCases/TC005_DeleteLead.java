package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC005_DeleteLead extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "DeleteLead";
		testCaseName = "deleteLead";
		testDescription = "Delete To Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void deleteLead(String fname) throws Exception {
		
		new MyHomePage()
		.clickLeads()
		.clickFindlead()
		.FirstName(fname)
		.FindLead()
		.sleep()
		.Firstlink()
		.Delete();
		
		
		
	}
	
		
		
}
