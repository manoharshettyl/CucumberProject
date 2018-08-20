package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductListingPage;

public class ProductListingPageSteps {
	
	TestContext testcontext;
	ProductListingPage prodlistpage;
	
	public ProductListingPageSteps(TestContext context)
	{
		testcontext= context;
		prodlistpage=testcontext.getPageObjectManager().getProductListingPage();
		
	}
	
	@When("^choose to buy first item$")
	public void choose_to_buy_first_item() throws Throwable {
	
		prodlistpage.selectProduct();
		prodlistpage.addToCart();
		
		
	}
	
	
	
	
	
	
	}
	
	


