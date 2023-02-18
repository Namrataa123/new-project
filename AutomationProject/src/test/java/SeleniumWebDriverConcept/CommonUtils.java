package SeleniumWebDriverConcept;

import org.openqa.selenium.WebElement;

public class CommonUtils {

	public void checkelement(WebElement ele,String elename)
	{
		boolean status= ele.isDisplayed();
		if(status==true)
		{
			System.out.println(elename +  "is dispalyed");
		}else
		{
			System.out.println(elename + " is missing" );
		}
		
	}
	
	public void clickelement(WebElement ele,String elename)
	{
		ele.click();
	}
	
	
	

	
	
	
	
}


