package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage{

	public CartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cart-button")
	WebElement cart_btn;

	@FindBy(css = ".checkout-button.alt")
	WebElement continue_checkout;

	public void addToCart() {

		cart_btn.click();

	}

	public void continueToCheckout() {

		continue_checkout.click();

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

}
