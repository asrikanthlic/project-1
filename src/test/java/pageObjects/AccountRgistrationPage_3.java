package pageObjects;

//import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRgistrationPage_3 extends BasePage_1


{
//constructor
	public AccountRgistrationPage_3(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//Elements
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(name="lastname")
	WebElement txtLastname;
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath = "//button[@type='submit']]")
	WebElement btnContinue;
	
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	@FindBy(xpath="//input[@id='input-newsletter-yes']")
	WebElement exp;
	
	//Actions
	public void setFirstName(String fname) 
	{
		txtFirstname.sendKeys(fname);

	}

	public void setLastName(String lname) 
	{
		txtLastname.sendKeys(lname);

	}

	public void setEmail(String email) 
	{
		txtEmail.sendKeys(email);

	}
	
	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);

	}

	public void setPrivacyPolicy()
	{
		//chkdPolicy.click();
		System.out.println(chkdPolicy.isDisplayed());
	}

	public void clickContinue()
	{
    btnContinue.click();
	}
	
	
	public void subscribe () throws InterruptedException
	{
		//Actions act=new Actions(driver);
		//act.moveToElement(exp).click().perform();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", exp);
		Thread.sleep(5000);
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		js.executeScript("arguments[0].click();", btnContinue);
	}
	
	
	public String getConfirmationMsg()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch (Exception e)
		{
			return (e.getMessage());
		}
	}
	
}
