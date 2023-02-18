package SeleniumWebDriverConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc005_windowhandlepractice {
   public static WebDriver driver;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseUtil bu= new BaseUtil();
		CommonUtils cu= new CommonUtils();
		
	driver=	bu.launchapplication("chrome");
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	  
	 driver.findElement(By.name("email")).sendKeys("namrata@gmail.com");
	   
	 cu.clickelement(driver.findElement(By.linkText("Sign Up")),"signupbutton");
	 Set<String> ids= driver.getWindowHandles();
	 Iterator<String> itr = ids.iterator();
	  
	  
	  String FirstWindow =itr.next();
	  String SecondWindow = itr.next();
	  
	  System.out.println(""+FirstWindow);
	  System.out.println(""+SecondWindow);
	  
	  String cookiespolicytitle =driver.getTitle();
	  System.out.println(""   +cookiespolicytitle);
		
	  
	  driver.quit();
	}

}
