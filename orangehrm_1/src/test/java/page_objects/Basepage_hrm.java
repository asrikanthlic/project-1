package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage_hrm 
{
	
	WebDriver driver;
	
	public Basepage_hrm (WebDriver driver) 
	{
		this.driver=driver;
	     PageFactory.initElements(driver,this);
	}
	

}
