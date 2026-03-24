package org.TestNg;

import org.testng.annotations.Test;

public class Testinvocationtimeout {
	@Test (priority=-1, alwaysRun=true, dependsOnMethods = "tc1")
	
	public  void tc1() {
		System.out.println("tc1");
	}
	
	@Test  (priority=4, invocationCount=2, invocationTimeOut=10000)
	public void tc2() {
		System.out.println("tc2");
	}
	
	@Test (priority=5, invocationCount=5)
	public void tc3() {
		System.out.println("tc3");
		
	}
	
	@Test (priority=3)
	public void tc4() {
		System.out.println("tc4");
	}
	
	
	
	
	
	

}
