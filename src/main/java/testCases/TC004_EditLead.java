package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC004_EditLead extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "EditLead";
		testCaseName = "editLead";
		testDescription = "Edit The Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void editLead(String fname, String cname) throws Exception {
		
		new MyHomePage()
		.clickLeads()
		.clickFindlead()
		.FirstName(fname)
		.FindLead()
		.sleep()
		.Firstlink()
		.Edit()
		.companyname(cname)
		.update()
		.verfiyEditLead(cname);
		
		
		
	}
	
		
		
}
