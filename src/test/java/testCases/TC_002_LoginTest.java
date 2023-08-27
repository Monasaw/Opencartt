package testCases;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

//login test
//new
public class TC_002_LoginTest extends BaseClass {
	@Test
	public void test_Login_Page() {
		try {
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickSubmit();
			
			MyAccountPage mp=new MyAccountPage(driver);
			boolean targetpg=mp.isMyAccountPageExist();
			Assert.assertEquals(targetpg,true);
			
			
			}
	catch(Exception e) {
		Assert.fail();
	}
		
		
	}

	
	

}
