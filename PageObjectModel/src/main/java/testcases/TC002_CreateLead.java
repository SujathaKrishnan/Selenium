package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_CreateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue()
	{
		testCaseName = "TC002_CreateLead";
		testDescription = "Create a New Lead";
		category ="smoke";
		authors ="Sujatha";
		browserName = "chrome";
		dataSheetName = "TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, /*String uNameVerify,*/ String cname, String fname, String lname)
	{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		/*.verifyUserName(uNameVerify)*/
		.clickCRMLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateButton()
		.firstNameVer(fname);
	} 

}
