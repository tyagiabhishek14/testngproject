package testngbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngClass {
	
	@BeforeSuite
	public void beforeSuitemethod() {
		System.out.println("Before Suit");
	}

	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodMethod() {
		System.out.println("Before method");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before test");
	}
	
	@Test
	public void testMethod() {
		System.out.println("Test method");
	}
	
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("After Class");
	}
	
	
	

}
