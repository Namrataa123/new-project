package SeleniumWebDriverConcept;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc001_Alert {
	
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BaseUtil bu = new BaseUtil();
		CommonUtils cu =new CommonUtils();
	driver=	bu.launchapplication("chrome");
	
	driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	Thread.sleep(15000);
		cu.clickelement(driver.findElement(By.xpath("(//button[contains(.,'Click me!')])[1]")),"Click me button");
	Alert al = driver.switchTo().alert();
	//al.accept();
	al.dismiss();	
	cu.clickelement(driver.findElement(By.xpath("(//button[contains(.,'Click me!')])[1]")),"click me button");

	al.dismiss();
	
	
	
	cu.clickelement(driver.findElement(By.xpath("(//button[contains(.,'Click me!')])[2]")),"click button");
	al.accept();
	
	
	//list 
	
	driver.get("https://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html");
   List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='list-group'])[1]/li"));
   
   for(int i=0; i<list.size();i++)
   {
	  System.out.println(list.get(i).getText()); 
   }

List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='list-group'])[2]/li"));
   
   for(int i=0; i<list1.size();i++)
   {
	  System.out.println(list1.get(i).getText()); 
   }	
 //drag and drop option 
	
 	driver.get("https://jqueryui.com/droppable/");
 	 driver.switchTo().frame(0);
 	 Actions ac= new Actions(driver);
 	 ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
 	
//ac.click(driver.findElement(By.xpath("//a[contains(.,' view source')]"))).build().perform();
 	 ac.moveToElement(driver.findElement(By.xpath("//a[contains(.,' view source')]"))).click().build().perform();//(doubt)
 	 
 	 // to come out of the frame
 	 driver.switchTo().defaultContent();
 	 
 	 driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
 	List<WebElement> ProgressBarlist = driver.findElements(By.xpath("(//a[contains(.,'Progress Bars')])[1]"));
 	for(int i=0;i<ProgressBarlist.size();i++)
 	{
 		System.out.println(ProgressBarlist.get(i).getText());
 	}
 	
 	 
 	// cu.clickelement(driver.findElement(By.xpath("(//a[contains(.,'Progress Bars')])[1]")),"click on the progress bar link"); didnt work
 	// ac.click(driver.findElement(By.xpath("//a[contains(.,'Progress Bars')])[1]"))).build().perform(); didnt work
 	// cu.clickelement(driver.findElement(By.linkText("Progress Bars")),"click on progressbar");
 	 
	}

}
