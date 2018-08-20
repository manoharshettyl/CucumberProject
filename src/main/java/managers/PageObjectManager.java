package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {
	private WebDriver driver;
	private CheckoutPage checkoutpage;
	private HomePage hp;
	private CartPage cartpage;
	private ProductListingPage prodlistpage;
	
	public  PageObjectManager(WebDriver driver)
	{
	this.driver= driver;
	}
	
	public HomePage getHomePage()
	{
		return (hp==null)? hp= new HomePage(driver) :hp;
		
		
	}
	
	public CheckoutPage getcheckoutpage()
	{
	return (checkoutpage==null)? checkoutpage= new CheckoutPage(driver) :checkoutpage;
		
	}
	
	
	public CartPage getcartpage()
	{
		
		return (cartpage==null)? cartpage = new CartPage(driver): cartpage;
	}
	
	public ProductListingPage getProductListingPage() {
		
		return (prodlistpage==null)? prodlistpage= new ProductListingPage(driver): prodlistpage;
		
	}

}
