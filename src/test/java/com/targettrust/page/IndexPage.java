package com.targettrust.page;

import static com.targettrust.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndexPage {
	
	public IndexPage openURL() {
		getDriver().get("https://en.wikipedia.org/wiki/Main_Page");		
		return this;
	}
	
	public CountryPage searchCountry(String descriptionCountry) {
		
		WebElement tfSearch = getDriver().findElement(By.id("searchInput"));
		tfSearch.clear();
		tfSearch.sendKeys(descriptionCountry);
		
		WebElement btnSearch = getDriver().findElement(By.id("searchButton"));
		btnSearch.click();
		
		return new CountryPage();
	}

}
