package org.TestNg;

import org.testng.annotations.Test;
import org.testng.internal.annotations.AnnotationHelper;
import org.testng.Assert;

public class Login {

    @Test
    public void testlogin() {
        String expected = "Welcome user!";
        String actual = login("username", "password");

        Assert.assertEquals(actual, expected, "Login failed");
    }

  public String login(String username, String password) {

     if ("username".equals(username) && "password".equals(password)) {
           return "Welcome user!";
       }

      return "Invalid credentials";
    
        
    }
}



