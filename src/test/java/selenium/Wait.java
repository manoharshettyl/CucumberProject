package selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Wait {

	public static void untilJqueryIsDone(WebDriver driver) {
		untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());

	}

	public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds) {

		until(driver, (d) -> {

			Boolean isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
			if (!isJqueryCallDone)
				System.out.println("Jquery call is in progress");
			return isJqueryCallDone;
		}, timeoutInSeconds);

	}

	public static void untilPageLoadComplete(WebDriver driver) {

		untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());

	}

	public static void untilPageLoadComplete(WebDriver driver, Long timeOutSeconds) {

		until(driver, (d) -> {
			Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			if (!isPageLoaded)
				System.out.println("Document is loading");
			return isPageLoaded;

		}, timeOutSeconds);

	}
	
	
	public static void until(WebDriver driver, Function<WebDriver,Boolean> waitCondition)
	{
		
		until(driver,waitCondition, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
		
	}
	
	private static void until(WebDriver driver, Function<WebDriver,Boolean> waitCondition,Long timeoutInSeconds)
	{
		
		WebDriverWait webdriverwait= new WebDriverWait(driver,timeoutInSeconds);
		webdriverwait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try
		{
			webdriverwait.until(waitCondition);
			
			
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
