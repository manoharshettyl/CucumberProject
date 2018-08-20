package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import managers.FileReaderManager;
import testDataTypes.Customer;

public class JsonDataReader {

	private final String customerpath = FileReaderManager.getInstance().getConfigFileReader().getTestDataResourcePath()
			+ "Customer.json";
	private List<Customer> customerList;

	public JsonDataReader() throws FileNotFoundException {

		customerList = getCustomerData();
	}

	private List<Customer> getCustomerData() {
		Gson gson = new Gson();
		FileReader fr;
		BufferedReader br=null;
		try {
			fr = new FileReader(customerpath);
			br = new BufferedReader(fr);
			Customer[] customers = gson.fromJson(br, Customer[].class);
			return Arrays.asList(customers);

		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerpath);
		}

		finally {

			try {

				if (br != null)
					br.close();
			}

			catch (IOException ignore) {

			}
		}
	}
	
	public final Customer getCustomerByName(String customerName)
	{
		
		
		return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
	}
	
	
	

}
