package com.targettrust.core;

import org.testng.annotations.AfterTest;

public abstract class BaseTest {
	
	@AfterTest
	public void tearDown() throws Exception {
//		File scrShot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrShot,	new File("target"+ File.separator + testName.getMethodName()+ ".jpg"));
		
		DriverFactory.quitDriver();
	}
}
