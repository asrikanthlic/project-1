package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRgistrationPage_3;
import pageObjects.Home_page_2;
import testBase.BaseClass_WEBPAGE_execute_first_Before_class;

public class TC_001_AccountRegistrationTest extends BaseClass_WEBPAGE_execute_first_Before_class {
	@Test
	public void test_account_registration()
	{
		logger.info("**** stating   TC_001_AccountRegistrationTest ******  ");
		try
		{
			Home_page_2 hp= new Home_page_2(driver);
			hp.clickMyAccount();  
			hp.clickRegister();
			
			AccountRgistrationPage_3 repage=new AccountRgistrationPage_3(driver);
			repage.setFirstName(randomString().toUpperCase());
			
			repage.setLastName(randomString().toLowerCase());
			
			repage.setEmail(randomString()+"@gmail.com");
			
			String password=randomAplphaNumeric();
			
			repage.setPassword(password);
			repage.subscribe();
			//repage.setPrivacyPolicy();
			
			repage.clickContinue();  
			logger.info(" clicking on continue");
			repage.getConfirmationMsg();
							
		}
		
	
		catch(Exception e)
		{
			Assert.fail();
		}
			
		
	}

	
		
}
