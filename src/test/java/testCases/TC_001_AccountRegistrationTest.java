package testCases;

import static org.testng.Assert.assertEquals;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test
	public void test_account_Registration() {
		
		logger.info("************* starting TC_001_AccountRegistrationTest***************");
		logger.debug("Debug started....");
		
		try {
		
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on My Account link ");
		
		hp.clickRegister();
		
		AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		ar.setFirstname(randomString().toUpperCase());
		ar.setLastname(randomString().toUpperCase());
		ar.setEmail(randomString()+"@gmail.com");
		ar.setTelephone(randomNumber());
		
		String pwd=randomAlphaNumric();
		ar.setPassword(pwd);
		
		ar.setConpassword(pwd);
		//ar.clicklnk();
		
		ar.clickprivacypolicy();
		ar.clicksubmit();
		
		String confmsg=ar.getconfirmmsg();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
		
	}

}
