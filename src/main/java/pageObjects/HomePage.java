package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage
{
	
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void navigateToHomePage()
	{
		
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
		
	}

	public void perform_Search(String search) {
		driver.navigate().to("http://shop.demoqa.com/?s=" + search + "&post_type=product");
	}
}
