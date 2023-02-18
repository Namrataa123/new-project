package SeleniumWebDriverConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc004_windowhandle {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BaseUtil bu = new BaseUtil();
 CommonUtils cu = new CommonUtils();
 
 driver=bu.launchapplication("chrome");
  driver.get("http://demo.guru99.com/popup.php");			
 driver.manage().window().maximize();	
 
 
 
 driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
 
  
 String MainWindow=driver.getWindowHandle();
 
 Set<String> s1=driver.getWindowHandles();		
 Iterator<String> i1=s1.iterator();		
 		
 while(i1.hasNext())			
 {		
     String ChildWindow=i1.next();		
     		
     if(!MainWindow.equalsIgnoreCase(ChildWindow))			
     {    		
          
             // Switching to Child window
             driver.switchTo().window(ChildWindow);	                                                                                                           
             driver.findElement(By.name("emailid"))
             .sendKeys("gaurav.3n@gmail.com");                			
             
             driver.findElement(By.name("btnLogin")).click();			
                          
		// Closing the Child Window.
                 driver.close();
                 
                 driver.switchTo().window(MainWindow);
 
     }
 
 
 
 }
 
	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 

	
	


