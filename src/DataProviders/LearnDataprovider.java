package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataprovider {
	@Test(dataProviderClass=DataFile.class,dataProvider="data")
	
	public void registeruser(String firstname,String lastname,String mobile,String email) {
		//Inorder to register we need multiple data like firstname,lastname,email id ,mobile number
		System.out.println("inside register");
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(mobile);
		System.out.println(email);
		
	}
	@Test(dataProviderClass=DataFile.class,dataProvider="data")
	public void loginuser(String firstname,String lastname) {
		System.out.println("Inside login");
		System.out.println(firstname);
		System.out.println(lastname);
		
		
	}
	

}
