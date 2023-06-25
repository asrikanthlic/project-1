package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginparameters_hrm extends Basepage_hrm
{
	public Loginparameters_hrm(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void uname(String un)
	{
		username.sendKeys(un);
	}
	
	
	public void pword(String pw)
	{
		
		password.sendKeys(pw);
	}
	public void lin()
	{
		login.click();
	}
	
}
