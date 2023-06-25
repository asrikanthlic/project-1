package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page_2 extends BasePage_1
{

	public Home_page_2(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Elements
	
		@FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement lnkMyaccount;
		
		@FindBy(linkText ="Register")
		WebElement lnkRegister;
		
		public void clickMyAccount()
		{
			lnkMyaccount.click();
		}
		
		public void clickRegister()
		{
			lnkRegister.click();
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
}
