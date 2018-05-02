package com.example.steps;

import com.example.pages.TestApplicationPage;
import com.example.steps.base.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;;

public class TestApplicationSteps extends BaseSteps {

	@Steps
    private TestApplicationPage testApplicationPage;

    @Given("^I have logged in to the Application as user \"([^\"]*)\" with password \"([^\"]*)\"$")
	public void log_in_to_the_Portal_with_credentials(String username, String password) throws Throwable {
		entersUserCredentials(username, password);
	}

    @When("^The user has been authorised$")
    public void log_in_to_the_Portal_as_user() throws Throwable {

	}

    @Then("^the default \"([^\"]*)\" page (?:is|should be) displayed$")
	public void check_correct_page_is_displayed(String system) throws Throwable {

	}
}