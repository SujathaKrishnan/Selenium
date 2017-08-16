package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers{

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}

	}

	public EditLeadPage updateCompanyName(String cname)
	{
		enterById("updateLeadForm_companyName", cname);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton()
	{
		clickByXpath("//input[@class='smallSubmit' and @value='Update']");
		return new ViewLeadPage(driver, test);
	}
	
	

}
