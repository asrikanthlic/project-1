package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_WEBPAGE_execute_first_Before_class 
{
	public WebDriver driver;
	public ResourceBundle rb;
	@BeforeClass
	public void setup()
	{
		
		rb=ResourceBundle.getBundle("config");
		
		logger=LogManager.getLogger(this.getClass()); 
		
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String xyz="https://demo.opencart.com/index.php?route=common/home&language=en-gb";
		
	driver.get(xyz);
	driver.manage().window().maximize();
	
	}
	
@AfterClass
public void tearDown()
{
	driver.quit();
}

public Logger logger;//for logging

//---------------------------

public String randomString()
{

String generatedString = RandomStringUtils.randomAlphabetic(5);
return (generatedString);

}

public String randomNumber()
{
	String generatedString2= RandomStringUtils.randomNumeric(10);
	return (generatedString2);
}


public String randomAplphaNumeric()
{
	
String st=RandomStringUtils.randomAlphabetic(4);
String num=RandomStringUtils.randomNumeric(3);
return (st+"@"+num);


}


}
