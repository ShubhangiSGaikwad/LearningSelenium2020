package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	// Scenario1
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println("*HomePage");
	}

	@When("^user search bmw in search field$")
	public void user_search_bmw_in_search_field() {
		System.out.println("*Enter BMW keyword");
	}

	@Then("^new window should open with search results\\.$")
	public void new_window_should_open_with_search_results() {
		System.out.println("*BMW search results");
	}

	
	// Scenario2
	@Given("^Search results are available$")
	public void search_results_are_available()  {
	   System.out.println("**Search results are available on a separate window is available.");
	}

	@When("^user click on first search result$")
	public void user_click_on_first_search_result() throws Throwable {
		System.out.println("**user click on first search result is successful");
	}

	@Then("^details should display$")
	public void details_should_display(){
		System.out.println("**details should display is success");
	}
		
	
	
}
