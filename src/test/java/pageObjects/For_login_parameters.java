package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class For_login_parameters extends BasePage_1 {

	public For_login_parameters(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Elements
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	@FindBy(xpath="//title[normalize-space()='My Account']")
	WebElement title;
	
	
	
	
	//actions
	public void Username()
	
	{
		String username="xyz123456789@gmail.com";
		txtemail.sendKeys(username);
		
	}
	
	
	public void Password()
	
	{
		txtpassword.sendKeys("123456789");
	}
	
	
	
	public void ClickLogin() throws InterruptedException
	{
		Thread.sleep(30000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btn);
		
	}
	
	
	public void getCOnfirmationMsg1()
	{
		try
		
		{
		Assert.assertEquals("My Account", title.getText());
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
	}
	
	
	
}
