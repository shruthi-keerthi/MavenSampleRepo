package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerclass.ObjectRepo;

public class HomeStepdef extends ObjectRepo {
	@Given("^when I am in TU homepage$")
	public void when_I_am_in_TU_homepage() throws Throwable {
		homepage.home();
	}

	@When("^I click on Register button$")
	public void i_click_on_Register_button() throws Throwable {
		homepage.loginlink();
	}

	@Then("^I shall be navigated to homepage$")
	public void i_shall_be_navigated_to_homepage() throws Throwable {
		homepage.homepageAssertion();
	}

}
