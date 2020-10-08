package testngtopic;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TC014
{
	@Test
	public void login()
	{
		Reporter.log("Login to App",true);
		throw new IllegalAccessError();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void createCustomer()
	{
		Reporter.log("Create a Customer",true);
	}
	
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("Delete a customer",true);
	}
}