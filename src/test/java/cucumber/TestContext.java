package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webdrivermanager;
	private PageObjectManager pom;
	WebDriver driver;

	public TestContext() {

		webdrivermanager = new WebDriverManager();
		pom = new PageObjectManager(webdrivermanager.getDriver());

	}

	public WebDriverManager getWebDriverManager() {

		return webdrivermanager;

	}

	public PageObjectManager getPageObjectManager() {

		return pom;

	}
	
	
	
	
	
	
	

}
