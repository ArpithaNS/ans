package com.alphabet.gmail.testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC006 {		//		Alphabetical execution using TestNG

	@Test
	public void def() {
		Reporter.log("Running def Method", true);
	}
	
	@Test
	public void abc() {
		Reporter.log("Running abc Method", true);
	}
	
	@Test
	public void ghi() {
		Reporter.log("Running ghi Method", true);
	}
	
	//	If multiple test cases are written in a single class then all will executed in the alphabetical order
}