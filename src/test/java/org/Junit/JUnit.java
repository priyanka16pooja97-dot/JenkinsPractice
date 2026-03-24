package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeGroups;

public class JUnit {
	@Before 
	public void searchbar() {
		System.out.println("Search Bar");
	}
	
	@BeforeGroups
    public static void launchbrowser() {
		System.out.println("Launch Browser");
	}
	
	@org.testng.annotations.Test
	public void Apple() {
//		Assert.assertEquals("Apple", "Apple");
		System.out.println("Apple");
	}
	
	@org.testng.annotations.Test
	public void samsung() {
//		Assert.assertTrue(false);
		System.out.println("samsung");
		
	}
	
	@org.testng.annotations.Test
	public void poco() {
//		Assert.assertTrue(true);
		System.out.println("poco");
	}
		
	@org.testng.annotations.AfterClass
	public  void addTocart() {
		System.out.println("addTocart");
	}
	
	@org.testng.annotations.AfterClass
	public  static void closeBrowser() {
		System.out.println("closeBrowser");
	}		
}



