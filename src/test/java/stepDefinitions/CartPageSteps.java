package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageSteps {

	TestContext testcontext;
	CartPage cartpage;

	public CartPageSteps(TestContext context) {

		testcontext = context;

		cartpage = testcontext.getPageObjectManager().getcartpage();
	}
	
	@When("^moves to checkout from minicart$")
	public void moves_to_checkout_from_minicart() throws Throwable {
		
		cartpage.addToCart();
		cartpage.continueToCheckout();
		
		
	}
	}


