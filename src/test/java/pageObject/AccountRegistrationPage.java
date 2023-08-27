package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver){
		super(driver);
	}
		
		@FindBy(name="firstname")
		WebElement txtFirstname;
		
		@FindBy(name="lastname")
		WebElement txtLastname;
		
		@FindBy(name="email")
		WebElement txtEmail;
		
		@FindBy(name="telephone")
		WebElement txtTelephone;
		
		@FindBy(name="password")
		WebElement txtPassword;
		
		@FindBy(name="confirm")
		WebElement txtConpassword;
		
		@FindBy(xpath="//input[@id='input-newsletter-yes']")
		WebElement chksubscribe;
		
		@FindBy(xpath="//input[@name='agree']")
		WebElement chkprivacypolicy;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement btnsubmit;
		
		@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
		WebElement conmsg;
		
		public void setFirstname(String fname) {
			txtFirstname.sendKeys(fname);
	}
		public void setLastname(String lname) {
			txtLastname.sendKeys(lname);
		}
		public void setEmail(String email) {
			txtEmail.sendKeys(email);
		}
		public void setTelephone(String phone) {
			txtTelephone.sendKeys(phone);
		}
		public void setPassword(String pass) {
			txtPassword.sendKeys(pass);
		}
		public void setConpassword(String conpass) {
			txtConpassword.sendKeys(conpass);
		}
		public void clicklnk() {
			chksubscribe.click();
		}
		public void clickprivacypolicy() {
			chkprivacypolicy.click();
		}
		public void clicksubmit() {
			btnsubmit.click();
		}
		public String getconfirmmsg() {
			try {
			return(conmsg.getText());
			}catch(Exception e) {
				return(e.getMessage());
			}
			
		}
		

}
