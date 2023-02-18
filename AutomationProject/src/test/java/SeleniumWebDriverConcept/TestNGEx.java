package SeleniumWebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx {
	
	WebDriver driver=null;
	@BeforeSuite
	
	public void test1()
	{
		 driver=new ChromeDriver();
		
	}
	
	@AfterSuite
	public void test2()
	{
		
		System.out.println("It will execute @ end of all cases");
	}
	
	
	
	@BeforeTest
	public void test3()
	{
		
		System.out.println("Before Test started");
		
	}
	
	@AfterTest
	public void test4()
	{
		
		System.out.println("After Test started");
		
		
	}
	
	@BeforeMethod
	public void test5()
	{
		
		System.out.println("Before Method started");
		
	}
	
	@AfterMethod
	
	public void test6()
	{
		
		System.out.println("After Method started");
		
	}
	
	@BeforeClass
	public void test7()
	{
		
		System.out.println("Before class started");
	}
	
	@AfterClass
	public void test8()
	{
		
		System.out.println("After class started!");
	}
	
	
	@Test(priority = 1)
	public void case1()
	{
		
		
		driver.manage().window().maximize();		
		driver.get("https://www.google.com");
		
		
	}
	
	
	
	
	
	@Test(priority = 2)
	public void case2()
	{
	
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
	}
	
	

}
