package testCases;

import org.testng.annotations.Test;

//import page_objects.Basepage_hrm;
import page_objects.Loginparameters_hrm;
import testBase.BaseClass_hrm;

public class TestCase_1 extends BaseClass_hrm
{

	@Test
	public void login()
	{
		Loginparameters_hrm hp = new Loginparameters_hrm(driver);
		
hp.uname(rb.getString("username"));
hp.pword(rb.getString("password"));
		hp.lin();
	}
	
	
}
