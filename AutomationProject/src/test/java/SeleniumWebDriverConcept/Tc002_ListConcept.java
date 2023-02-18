package SeleniumWebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc002_ListConcept {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		BaseUtil bu = new BaseUtil();
		CommonUtils cu = new CommonUtils();
	driver=	bu.launchapplication("chrome");
		
		 driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		 Actions ac= new Actions(driver);
//cu.clickelement(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]")),"Click on progress bar button");	 
		 
		ac.click(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"))).build().perform();
		ac.click(driver.findElement(By.linkText("Drag & Drop Sliders"))).build().perform();//clicking on the link
		
		

		 	/*List<WebElement> ProgressBarlist = driver.findElements(By.xpath("(//a[contains(.,'Progress Bars')])[1]"));
		 	for(int i=0;i<ProgressBarlist.size();i++)
		 	{
		 		System.out.println(ProgressBarlist.get(i).getText());
		 		
		 				 	}*/
		// Thread.sleep(5000);
		// cu.clickelement(driver.findElement(By.linkText("Progress Bar")),"click on Progress Bar ");
		 //Actions ac = new Actions(driver);
		// ac.click(driver.findElement(By.linkText("Progress Bar"))).build().perform();
		 
		 	//Select s = new Select(driver.findElement(By.linkText("Progress Bar")));
		 	//s.selectByVisibleText("JQuery Download Progress bars");
		 	//s.selectByIndex(0);

	}

}
