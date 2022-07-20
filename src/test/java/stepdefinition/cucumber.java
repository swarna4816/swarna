package stepdefinition;



import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber
{
	@Given("open the browser.")
	public void open_the_browser() {
		try {
				Browser.OpenBrowser();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	  
	}

	@When("enter the URL {string} .")
	public void enter_the(String string) {
		try {
			Browser.OpenURL(string);
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
	   
	}

	@Then("page is displayed.")
	public void page_is_displayed() {
		try {
		String actualTitle =Browser.GetTitle();
	    Assert.assertEquals("unacademy",actualTitle);
		}
		catch(AssertionError e) {
			e.printStackTrace();
		}
		Browser.BrowserClose();
	    	}
}
