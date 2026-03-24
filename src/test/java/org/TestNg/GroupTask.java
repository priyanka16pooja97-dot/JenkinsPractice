package org.TestNg;

import org.testng.annotations.Test;

public class GroupTask {
	
	@Test (groups = {"smoke", "reg"})
	
	private void BrowserLaunch() {
		System.out.println("BrowserLaunch");
	}
	
	@Test (groups = {"sanity"})
	private void getURL () {
		System.out.println("getURL");
	}
	
	@Test  (groups = {"reg}"})
	private void login() {
		System.out.println("login");
	}
	@Test (groups = {"smoke"})
	private void addtocart() {
		System.out.println("addtocart");
	}
	@Test (groups = {"reg"})
	private void logout() {
		System.out.println("logout");
	}
	}



