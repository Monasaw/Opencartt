package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass {
	@Test(dataProvider="LoginData" ,dataProviderClass=DataProviders.class)
	public void Test_loginDDT(String email,String pass,String exp) {
		
		logger.info(".........Statrting TC_003_LoginDataDrivenTest.......");
		try {
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pass);
		lp.clickSubmit();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpg=mp.isMyAccountPageExist();
		
		if(exp.equals("Valid")) {
			
			if(targetpg==true) {
				mp.Clicklogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equals("Invalid")) {
			
			if(targetpg==true) {
				mp.Clicklogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e){
			Assert.fail();
		}
		
		
		
		logger.info("....Finishing TC_003_LoginDataDrivenTest.....");
		
		
		
	}

}
