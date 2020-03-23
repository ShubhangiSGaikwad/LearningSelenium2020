package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps2 {
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.out.println("Feature2:User Login");
	}

	@When("^User Enters (.*?) and (.*?) on login page$")
	public void user_Enters_username_and_password_on_login_page(String username, String password) {
		System.out.println("Feature2:User adds the username :"+username);
		System.out.println("Feature2:User adds the password:" +password);
	}

	@Then("^Homepage should be displayed\\.$")
	public void homepage_should_be_displayed() {
		System.out.println("Feature2:Homepage is displayed");
	}

}
