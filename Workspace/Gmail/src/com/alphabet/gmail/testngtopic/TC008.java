package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC008 {		//		Testing Parallel Execution of TC008 and TC009 classes
	
	@Test(description="Testing parallel execution of test cases ----> This is from class TC008")
	public void test1() {
		Reporter.log("Running test1 Method from TC008 class", true);
	}

}
