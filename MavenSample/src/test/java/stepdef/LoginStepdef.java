package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerclass.ObjectRepo;

public class LoginStepdef extends ObjectRepo {
	@Then("^I shall be navigated to Login page$")
	public void i_shall_be_navigated_to_Login_page() throws Throwable {
		loginpage.loginpageAssertion();
	}

	@When("^I enter registered email address$")
	public void i_enter_registered_email_address() throws Throwable {
		loginpage.username();
	}

	@When("^I eneter valid password$")
	public void i_eneter_valid_password() throws Throwable {
		loginpage.password();
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		loginpage.loginbutton();
	}

	@When("^I enter registered email address as \"([^\"]*)\"$")
	public void i_enter_registered_email_address_as(String usr) throws Throwable {
		loginpage.username(usr);
	}

	@When("^I eneter valid password as \"([^\"]*)\"$")
	public void i_eneter_valid_password_as(String pwd) throws Throwable {
		loginpage.password(pwd);
	}

}
