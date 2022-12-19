package com.targettrust.core;

import static com.targettrust.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public abstract class BaseTest {
	
	@AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {
		File scrShot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrShot,	new File("target"+ File.separator + testResult.getName()+"_"+ new Date() + ".jpg"));		
	}
	
	@AfterTest
	public void afterTest() throws Exception {		
		DriverFactory.quitDriver();
	}
}
