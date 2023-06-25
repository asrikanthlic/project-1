package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page_forlogin extends BasePage_1{

	public Home_page_forlogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;

	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnklgoin;
	
	public void ClickMyAccount()
	{
		myaccount.click();
	}
	
	
	public void Clicklogin()
	{
		lnklgoin.click();
	}
	
	
	
	
	
	
	
}
