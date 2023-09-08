package testRunnermultipleDropdown;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilitymultipleDropdown.BaseClassmultipleDropdown;

@CucumberOptions(features = {"src/test/resources/FeaturefoldermultipleDropdown"},
plugin = {"json:target/cucumber.json"},
glue ="stepDefinationMulipleDropdown", tags= {"@MultiDropdown"}
)

public class TestRunnermultipleDropdown extends AbstractTestNGCucumberTests{
	
@BeforeTest
	
	public void multidropsetup()throws Exception {
		
	BaseClassmultipleDropdown test = new BaseClassmultipleDropdown();
		
		test.multipleDropdownbrowserinit();
	}
	
	@AfterTest
	
	public void multidropClosureURL() throws Exception {
		
		BaseClassmultipleDropdown test = new BaseClassmultipleDropdown();
		
		//test.driver.quit();
		
	}
	
}


	





