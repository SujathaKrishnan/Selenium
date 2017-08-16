package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}

	}

	public CreateLeadPage enterCompanyName(String cname)
	{
		enterById("createLeadForm_companyName", cname);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname)
	{
		enterById("createLeadForm_firstName", fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname)
	{
		enterById("createLeadForm_lastName", lname);
		return this;
	}

	public ViewLeadPage clickCreateButton()
	{
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
	}

}
