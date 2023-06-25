package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
// constructor
public class BasePage_1 {
	WebDriver driver;
	
	public BasePage_1(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
