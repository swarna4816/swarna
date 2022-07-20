package stepdefinition;

import Pages.AboutusNavigation;
import io.cucumber.java.en.*;


public class cucumber3 {
	@Given("User is able to open the url {string}")
	public void user_is_able_to_open_the_url(String string) {
		AboutusNavigation.openUrl(string);
	   	}

	@And("User click on loginButton")
	public void user_click_on_login_button() {
		AboutusNavigation.loginBttn();
	   
	}

	@And("user enters the {string}")
	public void user_enters_the(String string) {
		
		AboutusNavigation.mobileno(string);
	  	}

	@When("user is able to click on LoginButton")
	public void user_is_able_to_click_on_login_button() {
		AboutusNavigation.lButton();
	}

	@Then("user will able to get the otp")
	public void user_will_able_to_get_the_otp() {
		AboutusNavigation.getOtp();
	}

	@And("user naviagted to aboutuspage")
	public void user_naviagted_to_aboutuspage() {
		AboutusNavigation.aboutU();
	    	}

	@And("User is able to tap on LoginButton")
	public void user_is_able_to_tap_on_login_button() {
		AboutusNavigation.log1();
	}

	@And("user type the {string}")
	public void user_type_the(String string) {
		AboutusNavigation.mnumber(string);
	}

	@When("Tap on LoginButton")
	public void tap_on_login_button() {
		AboutusNavigation.log2();
	   
	}

	@Then("user can receive otp")
	public void user_can_receive_otp() {
		AboutusNavigation.otpVerify();
	   
	}

	@And("User navigated to next page where he able to see about unacdemy")
	public void user_navigated_to_next_page_where_he_able_to_see_about_unacdemy() {
		AboutusNavigation.navigateAbout();
	}


}
