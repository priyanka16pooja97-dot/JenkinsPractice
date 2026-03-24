package org.TestNg;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;



public class LoginPage {
	
	@Test(retryAnalyzer = ReTryClass.class)
	    public void logindata() {
	       Assert.assertEquals(true, false);
	    }

	    @Test
	    public void quit() {
	        Assert.assertEquals(true, true);
	    }
	}
