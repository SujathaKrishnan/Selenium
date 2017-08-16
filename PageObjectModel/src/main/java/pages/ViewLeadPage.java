package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("View Lead | opentaps CRM"))
			reportStep("This is not View Lead Page", "FAIL");	
		
	}
	
	public ViewLeadPage firstNameVer(String fname)
	{
		verifyTextById("viewLead_firstName_sp", fname);
		return this;
	}
	
	public EditLeadPage clickEditButton()
	{
		clickByLink("Edit");
		return new EditLeadPage(driver, test);
	}
	
	public ViewLeadPage companyNameVer(String cname)
	{
		verifyTextContainsById("viewLead_companyName_sp", cname);
		return this;
	}

}
