package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.DriverType;
import enums.EnvirnomentType;

public class WebDriverManager {

	private WebDriver driver;
	private static DriverType driverType;
	private static EnvirnomentType envirnomentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	private static final String IEXPLORER_DRIVER_PROPERTY = "webdriver.iexplorer.driver";

	public WebDriverManager() {

		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		envirnomentType = FileReaderManager.getInstance().getConfigFileReader().getEnvirnoment();
	}

	public WebDriver getDriver() {

		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {

		switch (envirnomentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;

		case REMOTE:
			driver = createRemoteDriver();
			break;

		}
		return driver;
	}

	private WebDriver createRemoteDriver() {

		throw new RuntimeException(" remote webdriver not yet implemented");
	}

	private WebDriver createLocalDriver()

	{
		switch (driverType) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver",
					FileReaderManager.getInstance().getConfigFileReader().getFirefoxDriverPath());
			driver = new FirefoxDriver();
			break;

		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigFileReader().getChromeDriverPath());
			driver = new ChromeDriver();
			break;

		}
		if (FileReaderManager.getInstance().getConfigFileReader().getWindowSize())
		{
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(
				FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
		}
		return driver;

	}

	public void closeDriver() {

		driver.close();
		driver.quit();
	}

}
