package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001 {		//	TC0001 is a TestNG Class because it contains @Test Annotated Method/Methods
							//	All TestNG Classes have inbuilt main methods

	@Test(description="Test Case to Test Login with Valid Login Credentials")
	public void testValidLogin() {
		Reporter.log("Running testValidLogin Method", true);		/*		if true is written it prints the Reporter Message in the console
																			otherwise it only prints it in the Report
																	*/
	}
	
}
