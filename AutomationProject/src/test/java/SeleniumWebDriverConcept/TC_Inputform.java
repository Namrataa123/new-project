package SeleniumWebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_Inputform {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BaseUtil bu = new BaseUtil();
CommonUtils cu = new CommonUtils();
driver=bu.launchapplication("chrome");
 driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
 
  cu.clickelement(driver.findElement(By.className("logo")),"click on logo button");
  String title =driver.getTitle();
  if(title.equalsIgnoreCase("Input form with validations"))
  {
	  System.out.println("it is the main page");
	  
  }else {
	  System.out.println("it is not main page");
  }
	  
	}

}
