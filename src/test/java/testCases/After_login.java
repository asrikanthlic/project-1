package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.For_login_parameters;
import pageObjects.Home_page_forlogin;
import testBase.BaseClass_WEBPAGE_execute_first_Before_class;

public class After_login extends BaseClass_WEBPAGE_execute_first_Before_class {
	@Test
	public void afterlogin()
	{
		logger.info("**** stating   After_login  ******  ");
		try
		{
			
			Home_page_forlogin hp2=new Home_page_forlogin(driver);
					hp2.ClickMyAccount();
					hp2.Clicklogin();
					
					
					For_login_parameters repage2= new For_login_parameters(driver);
					repage2.Username();
					repage2.Password();
					logger.info("clicking on logging");
					repage2.ClickLogin();
					logger.info("clicking on logging");
					repage2.getCOnfirmationMsg1();
					
					
					
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	}

}
