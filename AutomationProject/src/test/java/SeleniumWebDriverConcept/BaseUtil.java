package SeleniumWebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseUtil {

	public static WebDriver driver;
	
	@BeforeSuite
	public WebDriver launchapplication(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			//System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("chrome driver is installed");
			
		}else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
			System.out.println("Firefox driver is installed");
		}else if(browsername.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			System.out.println("edgedriver is installed");
		}else
		{
			System.out.println("please pass the browsername as chrome,firefox,edge ");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterSuite
	public void closeapplication()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void navigateurl(String url)
	{
		
		
		driver.get("https://www.fb.com");
	}
	
	
}
