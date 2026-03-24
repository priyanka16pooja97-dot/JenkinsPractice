package org.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {
	
	@Before
	public void browserlaunch() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public static void searchbar() {
		System.out.println("searchbar");
	}
	
	@Test
	public void samsung() {
		System.out.println("samsung");
	}
	@Test
	public void oppo() {
		Assert.assertEquals("Oppo", "Oppo");
		System.out.println("Oppo");
	}
	@Test
	public void Apple() {
		Assert.assertEquals("Apple", "Apple");
		System.out.println("Apple");
	}
	@After
	public void AddToCart() {
		System.out.println("AddToCart");
	}
	@AfterClass
	public static void closebrowser() {
		System.out.println("closebrowser");
	}

}
