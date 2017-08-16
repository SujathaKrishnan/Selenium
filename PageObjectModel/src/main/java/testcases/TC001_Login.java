package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Login extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValue(){
		testCaseName = "TC001_Login";
		testDescription = "Login and LogOut";
		category ="smoke";
		authors ="Sarath";
		browserName = "chrome";
		dataSheetName = "TC001";	
		
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd, String uNameVerify){
	
		new LoginPage(driver, test)
		.enterUserName(uName)	
		.enterPassword(pwd)
		.clickLogin()
		.verifyUserName(uNameVerify)
		.clickLogOut();
	}

}
