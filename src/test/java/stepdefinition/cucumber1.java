package stepdefinition;

import org.testng.Assert;

import Browser.Browser;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class cucumber1 {
	@Given("User on the webpage {string}")
	public void user_on_the_webpage(String string) {
		try {
			Browser.OpenBrowser();
		    Browser.OpenURL(string);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	   	}

	@And("User is able to click on loginButton")
	public void user_is_able_to_click_on_login_button() {
		try {
			Login.login1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	   	}

	@And("user enter the {string}")
	public void user_enter_the(String string) {
		try {
			Login.mobilenumber(string);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	}

	@When("click on LoginButton")
	public void click_on_login_button() {
		try {
			Login.login2();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	}

	@Then("user will get the otp")
	public void user_will_get_the_otp() {
		try {
			Login.verifyOTP();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	}

	@And("user can see aboutus link")
	public void user_can_see_aboutus_link() {
		try {
			Login.aboutusPage();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		//Browser.BrowserClose();
	   
	}

}	


