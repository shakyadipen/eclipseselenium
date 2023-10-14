package Testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotation {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("Running Testng Suite");
	}
	@AfterSuite
	public void aftersuit() {
		System.out.println("Stopping Testng Suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Running Test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("Stopping Test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.print("Initialize selenium");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Openeing browser");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Closing Browser browser");
	}
	@Test
	public void firstest() {
		System.out.println("This if first test");
	}
	@Test
	public void secondtest() {
		System.out.println("This if second test");
		}
	@AfterClass
	public void afterclass() {
		System.out.print("Initialize selenium");
	}
	}

