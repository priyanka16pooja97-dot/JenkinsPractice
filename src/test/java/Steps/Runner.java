package Steps;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

	features = "src/test/java/Feature/Login.Feature",
	dryRun = true,
	glue={"Steps"},
	snippets = CucumberOptions.SnippetType.CAMELCASE,
	monochrome = true
	)

public class Runner extends AbstractTestNGCucumberTests{
	@Given
	("user should navigate to the application")
	public void usershouldnavigatetotheapplication() {
		System.out.println("User Navigated");
	}
	
	@Given
	("user click the login click")
	public void userentertheusernameasani() {
		System.out.println("username");
		
	}
	@Given
	("user enter the password as pass@{int}")
	public void userenterthepasswordaspass(Integer int1) {
		System.out.println("Pooja@16");
		
	}
	@When
	("user click the Login Button")
	public void userclicktheLoginButton() {
	}
	@Then
	("login should Success")
	public void loginshouldbeSuccess() {
		
	}
	   
	}
	
	


	
	
	
	


