package stepdefinition;

import Browser.Browser;
import Pages.AboutUs;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class cucumber2 {
	@Given("User  open the url {string}")
	public void user_open_the_url(String string) {
		try {
			AboutUs.OpenURL(string);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	   
	}

	@And("User is able to click on LoginButton")
	public void user_is_able_to_click_on_login_button() {
		try {
			AboutUs.loginOne();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	    
	}

	@And("user enter {string}")
	public void user_enter(String string) {
		try {
			AboutUs.mobile(string);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	  
	}
	@When("click on Login")
	public void click_on_login() {
		try {
			AboutUs.loginTwo();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	    	}
	

	@And("user get otp")
	public void user_get_otp() {
		try {
			AboutUs.OTP();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	   
	}

	@When("User can click  on AboutUs")
	public void user_can_click_on_about_us() {
		try {
			AboutUs.aboutus();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    	}


}
