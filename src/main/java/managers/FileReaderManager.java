package managers;

import java.io.FileNotFoundException;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader cfr;
	private static JsonDataReader jsonDataReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {

		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigFileReader()
	{
		
		return(cfr==null)? cfr= new ConfigFileReader(): cfr;	
	}
	
	
	public JsonDataReader getJsonReader() throws FileNotFoundException
	{
		return(jsonDataReader==null)? jsonDataReader= new JsonDataReader(): jsonDataReader;
		
		
	}
	
	
	

}
