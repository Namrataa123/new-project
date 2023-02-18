package SeleniumWebDriverConcept;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BaseUtil bu = new BaseUtil();
CommonUtils cu = new CommonUtils();

driver=bu.launchapplication("chrome");
  driver.manage().window().maximize();
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("namrata.skang@gmail.com");
		Actions ac= new Actions(driver);
		
		ac.click(driver.findElement(By.linkText("Sign Up"))).build().perform();
		

    String text= driver.findElement(By.xpath("(//div[contains(text(),'Create a new account')])")).getText();
System.out.println(text);

if(text.equalsIgnoreCase("Create a new account"))
{
	System.out.println("text is displayed");
}else
{
System.out.println("text is not displayed");
}


ac.click(driver.findElement(By.linkText("Cookies Policy"))).build().perform();

  String MainWindow= driver.getWindowHandle();

  
  Set<String> ids=driver.getWindowHandles();
  Iterator<String>   itr= ids.iterator();
  
 String FirstWindow = itr.next();
 String Secondwindow= itr.next();
 
 System.out.println(FirstWindow);
 System.out.println(Secondwindow);
 driver.switchTo().window(Secondwindow);
 
 
 ac.click(driver.findElement(By.xpath("//a[contains(.,'Data Policy')]"))).build().perform();
 // driver.switchTo().window(MainWindow);
 
 driver.get("https://www.w3schools.com/html/html_tables.asp");
 List<WebElement> list=driver.findElements(By.xpath("(//tbody/tr/td)"));
String tabletext=  driver.findElement(By.xpath("(//tbody/tr/td)[17]")).getText();
System.out.println( ""  +tabletext);
 
/* for(int i=0;i<list.size();i++)
 {
	 
	 System.out.println(list.get(i).getText());
 }*/
 

 
	

	}
	
	
	
}
