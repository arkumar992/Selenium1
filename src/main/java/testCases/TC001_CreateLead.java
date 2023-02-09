package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "CreateLead";
		testCaseName = "createLead";
		testDescription = "Create a new lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String cname, String Fname, String Lname, String PNo,String Value1) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.companyname(cname)
		.firstName(Fname)
		.lastName(Lname)
		.SourceDD(Value1)
		.pNo(PNo)
		.createSubmit()
		.verfiyCreateLead(Fname);
	}

}
