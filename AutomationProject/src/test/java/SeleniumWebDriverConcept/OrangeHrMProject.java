package SeleniumWebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrMProject {

	public static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BaseUtil bu = new BaseUtil();
		CommonUtils cu = new CommonUtils();
		
		driver=	bu.launchapplication("chrome");
			driver.get("https://www.orangehrm.com/");
			
			driver.manage().window().maximize();
			
		String actTitle =driver.getTitle();
		System.out.println("The title  is " +actTitle);
		
		//to check if the Title is displayed
		if (actTitle.equalsIgnoreCase("orangehrm"))
				{
			System.out.println("application is opened");
				}else
				{
					System.out.println("application is not opened");
				}
	
		//to check if the logo is Isdisplayed
        cu.checkelement(driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[1]")),"OrangeHRM Logo");		
         
       Thread.sleep(30000);
			//click on the Book a free demo button
        cu.clickelement(driver.findElement(By.xpath("(//button[contains(.,'Book a Free Demo')])[2]")),"Book a Free Demo");
		
				
				driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Mannat");
				driver.findElement(By.xpath("//input[@id='Form_getForm_Email']")).sendKeys("m@gmail.com");
				Select s= new Select(driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")));
				s.selectByVisibleText("Antigua and Barbuda");
				driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']")).sendKeys("123456789");
				
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")));
			   driver.switchTo().defaultContent();
			   js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='action_submitForm']")));
			   
			   //click on the why organge hrm
			   
			   cu.clickelement(driver.findElement(By.xpath("(//a[contains(.,'Why OrangeHRM')])[1]")),"why Orangehrm");
			   
			  cu.clickelement(driver.findElement(By.xpath("//li[contains(text(),'Partners')]")),"Partners");
			  
			  cu.checkelement(driver.findElement(By.xpath("//h1[contains(text(),'Manage Your People and Operations in One Place')]")),"manage your people and operations in one place");
			   
				//size of element
			int size=  driver.findElements(By.xpath("//h1[contains(text(),'Manage Your People and Operations in One Place')]")).size();
			
			if(size>0) {
				System.out.println("element present");
				
			}else {
				System.out.println("element not present");
			}
			
	}

}
