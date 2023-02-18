package SeleniumWebDriverConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC006_windowhandle1 {
public static WebDriver driver;

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseUtil bu = new BaseUtil();
		CommonUtils cu = new CommonUtils();
		
	driver=	bu.launchapplication("chrome");
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		// capture the text
	String text= driver.findElement(By.linkText("Already have an account?")).getText();
	System.out.println(text);
	
	//click on the link 
	//cu.clickelement(driver.findElement(By.linkText("Already have an account?")),"already have an account link");
	
//get the text from Link
	
	if(text.equalsIgnoreCase("Already have an account?"))
	{
		System.out.println("correct message is displayed");
	}else
		System.out.println("correct message is not displayed");
	}
	
	
	
	
	
	}


