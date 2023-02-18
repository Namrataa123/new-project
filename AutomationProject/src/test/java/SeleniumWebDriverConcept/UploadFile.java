package SeleniumWebDriverConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	
	 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		BaseUtil bu = new BaseUtil();
		CommonUtils cu = new CommonUtils();

		driver=bu.launchapplication("edge");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.get("https://demo.guru99.com/test/upload/");
Actions ac = new Actions(driver);
driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("C:\\Users\\namra\\OneDrive\\Documents\\jira.xlsx");

//ac.click(driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"))).build().perform();
// ac.sendKeys("test123");

//cu.clickelement("driver.findElement(By.className(\"a1 aaA aMZ\"))","upload button");

 //ac.click(driver.findElement(By.className("a1 aaA aMZ"))).build().perform();
		
	}
	
}
