package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass_hrm 
{
public static WebDriver driver;
	
	//public Logger logger; // for logging
	
	public ResourceBundle rb;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		rb=ResourceBundle.getBundle("config"); // Load config.properties file
		
		//logger=LogManager.getLogger(this.getClass());  //logging
				
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(rb.getString("url"));
		
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	*/

}
