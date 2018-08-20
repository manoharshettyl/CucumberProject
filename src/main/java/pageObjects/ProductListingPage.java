package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {

	public ProductListingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(linkText="39MM MESH BRACELET WATCH")
	private WebElement firstitem;
	
	
	@FindBy(css="button.single_add_to_cart_button")
	private WebElement addtocart;
	
	public void selectProduct()
	{
		
		firstitem.click();
		
	}
	
	public void addToCart()
	{
		
		addtocart.click();
	}
	
	
	

}
