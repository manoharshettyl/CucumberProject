package stepDefinitions;

import java.io.FileNotFoundException;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.WebDriverManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {
	
	
	TestContext testcontext;
	CheckoutPage checkoutpage;
	WebDriverManager webdrivermanager;
	public CheckoutPageSteps(TestContext context) {
		
		testcontext= context;
		checkoutpage=testcontext.getPageObjectManager().getcheckoutpage();
		
	}
	


	@When("^enter \"([^\"]*)\" Personal details on checkoutpage$")
	public void enter_Personal_details_on_checkoutpage(String customerName) throws FileNotFoundException{
	Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
	checkoutpage.fill_PersonalDetails(customer);	
}
	
	
	
	/*@When("^enter Personal details on checkoutpage$")
	public void enter_Personal_details_on_checkoutpage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		checkoutpage.fillPersonalDeails();
		Thread.sleep(5000);
		
		
		
	}
	*/
	
	@When("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
		Thread.sleep(5000);
		checkoutpage.checkShipToDifferentAddress(false);
	}
	
	@When("^select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1) throws Throwable {
		Thread.sleep(5000);
		checkoutpage.select_PaymentMethod(arg1);
		
		
	}
	
	@When("^place the order$")
	public void place_the_order() throws Throwable {
		Thread.sleep(5000);
		checkoutpage.termsAndConditons(true);
		checkoutpage.clickOn_PlaceOrder();
		Thread.sleep(5000);
		webdrivermanager.closeDriver();
	
	}
	
	
}




