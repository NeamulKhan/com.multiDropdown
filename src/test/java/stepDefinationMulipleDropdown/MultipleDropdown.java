package stepDefinationMulipleDropdown;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilitymultipleDropdown.BaseClassmultipleDropdown;

public class MultipleDropdown extends BaseClassmultipleDropdown {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		multipleDropdownLaunchURL(URL);
	}

	@When("^I select option from skills, country and date of birth$")
	public void i_select_option_from_skills_country_and_date_of_birth() throws Throwable {
	    
	}

	@Then("^verify multiple dropdown successfully worked$")
	public void verify_multiple_dropdown_successfully_worked() throws Throwable {
	   
		
	}


	

}
