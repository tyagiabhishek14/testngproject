package testngbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MangentoTestingBoard {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
	}
	
	@Test(priority=1,groups="login")
	public void getTitleTest() {
	String title =	driver.getTitle();
	Assert.assertEquals(title,"Google");	
	System.out.println("Page Title = "+title);
	}
	
	@Test(priority=2,groups="signup")
	public void signUpTest() {
	driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
	String titleNew = driver.getTitle();
	System.out.println("New Title is " +titleNew);
	Assert.assertEquals(titleNew, "Facebook");
	}
	
	@Test(priority=3,groups="signup")
	public void signUpFormFill() {
	driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Abhishek");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Tyagi");
	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("tyagiabhishek14@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abhishek@123");
	driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Abhishek@123");
	driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
