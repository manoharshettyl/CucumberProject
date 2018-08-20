package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvirnomentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";

	public ConfigFileReader() {
		try {
			FileReader fr = new FileReader(propertyFilePath);
			BufferedReader br = new BufferedReader(fr);
			properties = new Properties();
			try {
				properties.load(br);
				br.close();
			}

			catch (IOException e) {

				e.printStackTrace();
			}
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

	public String getChromeDriverPath() {

		String driverpath = properties.getProperty("chromedriverPath");
		if (driverpath != null)
			return driverpath;
		else
			throw new RuntimeException("driver path not specifiec in cong propertity file");

	}

	public String getFirefoxDriverPath() {

		String driverpath = properties.getProperty("firefoxdriverPath");
		if (driverpath != null)
			return driverpath;
		else
			throw new RuntimeException("driver path not specifiec in cong propertity file");

	}

	public long getImplicitlyWait() {

		String implicitlywait = properties.getProperty("Implicitlywait");
		if (implicitlywait != null)
			return Long.parseLong(implicitlywait);
		else
			throw new RuntimeException("implicitly wait not specified in cong file");
	}

	public String getUrl() {

		String Url = properties.getProperty("URL");
		if (Url != null)
			return Url;

		else
			throw new RuntimeException("url not specified in cong file");

	}

	public DriverType getBrowser() {

		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;

		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equalsIgnoreCase("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException("browser not specified in cong file");
	}

	public EnvirnomentType getEnvirnoment() {
		String envirnomentName = properties.getProperty("envirnoment");

		if (envirnomentName == null || envirnomentName.equals("local"))
			return EnvirnomentType.LOCAL;

		else if (envirnomentName.equalsIgnoreCase("remote"))
			return EnvirnomentType.REMOTE;
		else
			throw new RuntimeException("envirnoment not specified in cong file");
	}

	public Boolean getWindowSize() {

		String windowSize = properties.getProperty("windowSizeMax");
		if (windowSize != null)
			return Boolean.valueOf("windowsize");
		return true;
	}

	public String getTestDataResourcePath()
	{
		
		String testDataResourcePath= properties.getProperty("testDataResourcePath");
		if(testDataResourcePath!=null) return testDataResourcePath;
		else throw new RuntimeException("Test Data Resouce path not specified in config file");
		
		
	}
	
	
	public String getReportConfigPath()
	{
		String reportConfigPath=properties.getProperty("reportConfigPath");
		if(reportConfigPath!=null) return reportConfigPath;
		else throw new RuntimeException("report config path not specfied in path ");
		
		
	}
	
	
	
}
