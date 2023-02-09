package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC002_CreateLeadNeg extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "CreateLeadNeg";
		testCaseName = "createLeadNeg";
		testDescription = "Create Lead Neagtive Scenario";
		category = "Sanity";
		author = "Rohith";
		moduleName = "Leads";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String cname, String Fname, String Lname, String PNo, String ErrorMsg) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.companyname(cname)
		.firstName(Fname)
		.lastName(Lname)
		.pNo(PNo)
		.createSubmitNeg()
		.errorMsg(ErrorMsg);
		/*.createSubmit()
		.verfiyCreateLead(Fname);*/
	}

}
