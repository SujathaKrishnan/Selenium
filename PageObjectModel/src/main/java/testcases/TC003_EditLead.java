package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_EditLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue()
	{
		testCaseName = "TC003_CreateLead";
		testDescription = "Edit an existing Lead";
		category ="smoke";
		authors ="Sujatha";
		browserName = "chrome";
		dataSheetName = "TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String uName, String pwd, String fname, String cname)
	{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMLink()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fname)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickEditButton()
		.updateCompanyName(cname)
		.clickUpdateButton()
		.companyNameVer(cname);
		
	}

}
