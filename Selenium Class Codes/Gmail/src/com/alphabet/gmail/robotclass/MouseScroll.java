package com.alphabet.gmail.robotclass;

import java.awt.AWTException;
import java.awt.Robot;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class MouseScroll extends BasicSettings 
{
	public static void main(String[] args) throws AWTException 
	{
		mySleepInSeconds(5);
		Robot robot = new Robot();
		robot.mouseWheel(100);
		mySleepInSeconds(2);
		robot.mouseWheel(-100);
	}
}









































//Hello :-)