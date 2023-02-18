package SeleniumWebDriverConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC003_Tables {
public static WebDriver driver;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseUtil bu = new BaseUtil();
		CommonUtils cu = new CommonUtils();
	driver=	bu.launchapplication("chrome");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		
	String secondcolval=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
	System.out.println(secondcolval);
	
	 //count number of rows
	
	List<WebElement> rows =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	 System.out.println(rows.size());
	
	
	}

}
