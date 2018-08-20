package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testDataTypes.Customer;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#billing_first_name")
	private WebElement txtbx_Firstname;

	@FindBy(how = How.CSS, using = "#billing_last_name")
	private WebElement txtbx_LastName;

	@FindBy(how = How.CSS, using = "#billing_email")
	private WebElement txtbx_Email;

	@FindBy(how = How.CSS, using = "#billing_phone")
	private WebElement txtbx_Phone;

	@FindBy(how = How.CSS, using = "#billing_state_field .select2-arrow")
	private WebElement drpdwn_Country_DropDownArrow;

	@FindBy(how = How.CSS, using = "#billing_state_field .select2-arrow")
	private WebElement drpdwn_State_DropDownArrow;

	@FindAll(@FindBy(how = How.CSS, using = "#select2-drop ul li"))
	private List<WebElement> state_List;

	@FindAll(@FindBy(how = How.CSS, using = "#select2-drop ul li"))
	private List<WebElement> country_List;

	@FindBy(how = How.CSS, using = "#billing_city")
	private WebElement txtbx_City;

	@FindBy(how = How.CSS, using = "#billing_address_1")
	private WebElement txtbx_Address;

	@FindBy(how = How.ID, using = "billing_postcode")
	private WebElement txtbx_PostCode;

	@FindBy(how = How.ID, using = "ship-to-different-address-checkbox")
	private WebElement chkbx_ShipToDifferetAddress;

	@FindAll(@FindBy(xpath = "//input[@name='payment_method']"))
	private List<WebElement> paymentMethod_List;

	@FindBy(xpath = "//input[@id='terms']")
	private WebElement chkbx_AcceptTermsAndCondition;

	@FindBy(how = How.ID, using = "place_order")
	private WebElement btn_PlaceOrder;

	public void enterName(String firstname) {

		txtbx_Firstname.sendKeys(firstname);
	}

	public void enterLastname(String lastname)

	{
		txtbx_LastName.sendKeys(lastname);

	}

	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}

	public void enter_Phone(String phone) {
		txtbx_Phone.sendKeys(phone);
	}

	public void enter_City(String city) {
		txtbx_City.sendKeys(city);
	}

	public void enter_Address(String address) {
		txtbx_Address.sendKeys(address);
	}

	public void enter_PostCode(String postCode) {
		txtbx_PostCode.sendKeys(postCode);
	}

	public void checkShipToDifferentAddress(boolean value) {

		if (!value)
			chkbx_ShipToDifferetAddress.click();
		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void selectCountry(String countryName) {

		drpdwn_Country_DropDownArrow.click();

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

		for (WebElement country : country_List) {
			if (country.getText().equals(countryName))
				country.click();

		}

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void select_city(String cityname) {

		txtbx_City.sendKeys(cityname);
	}

	public void selectState(String stateName) {

		drpdwn_State_DropDownArrow.click();

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

		for (WebElement state : state_List) {
			if (state.getText().equals(stateName))
				state.click();

		}

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void select_PaymentMethod(String paymentMethod) {
		if (paymentMethod.equals("CheckPayment")) {
			if (paymentMethod_List.get(0).isSelected()) {

			} else {
				paymentMethod_List.get(0).click();

			}

		} else if (paymentMethod.equals("Cash")) {
			paymentMethod_List.get(1).click();

		}

		else {

			throw new RuntimeException("payment method not recognized:  " + paymentMethod);
		}

		try {

			Thread.sleep(1000);
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void termsAndConditons(boolean value) {

		if (value)
			chkbx_AcceptTermsAndCondition.click();
	}

	public void clickOn_PlaceOrder() {

		btn_PlaceOrder.submit();

	}

	/*public void fillPersonalDeails() throws InterruptedException {

		enterName("Aotomation");
		Thread.sleep(5000);
		enterLastname("Test");
		enter_Phone("0000000000");
		Thread.sleep(5000);
		enter_Email("Automation@gmail.com");
		Thread.sleep(5000);
		//selectCountry("India");
		Thread.sleep(5000);
		enter_City("Delhi");
		Thread.sleep(5000);
		enter_Address("Shalimar Bagh");
		enter_City("Delhi");
		selectState("Delhi");
		Thread.sleep(5000);
		enter_PostCode("110088");
		Thread.sleep(5000);
	}
	*/
	


public void fill_PersonalDetails(Customer customer) {
	enterName(customer.firstName);
	enterLastname(customer.lastName);
	enter_Phone(customer.phoneNumber.mob);
	enter_Email(customer.emailAddress);
	enter_City(customer.address.city);
	enter_Address(customer.address.streetAddress);
	enter_PostCode(customer.address.postCode);
	selectState(customer.address.country);
	
}

}
