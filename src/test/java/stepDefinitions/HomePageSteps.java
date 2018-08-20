package stepDefinitions;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

public class HomePageSteps {
	
	
	TestContext testcontext;
	HomePage hp;
	
	public HomePageSteps(TestContext context)
	{
		testcontext= context;
		hp= testcontext.getPageObjectManager().getHomePage();
		
	}
	
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		hp.navigateToHomePage();
		Reporter.addStepLog("Home page is displayed");
	}
	@When("^he searches for \"([^\"]*)\"$")
	public void he_searches_for(String arg1) throws Throwable {
		hp.perform_Search(arg1);
		Reporter.addStepLog("Item searched ");
	}

	
}
