package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers{
	
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Find Leads | opentaps CRM"))
			reportStep("This is not Find Leads Page", "FAIL");
	}

	public FindLeadsPage enterFirstName(String fname)
	{
		enterByXpath("(//input[@name='firstName'])[3]", fname);
		return this;
	}
	public FindLeadsPage clickFindLeadsButton()
	{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public ViewLeadPage clickFirstResult()
	{
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return new ViewLeadPage(driver, test);
	}
}
