package com.targettrust.page;

import static com.targettrust.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CountryPage {
	
	public String getTitleH1() {
		
		WebElement h1Title = getDriver().findElement(By.id("firstHeading"));
		return h1Title.getText();
	}

}
