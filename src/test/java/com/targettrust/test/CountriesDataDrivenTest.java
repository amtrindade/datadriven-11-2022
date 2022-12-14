package com.targettrust.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.targettrust.core.BaseTest;
import com.targettrust.page.CountryPage;
import com.targettrust.page.IndexPage;

public class CountriesDataDrivenTest extends BaseTest{

	IndexPage indexPage;
	CountryPage countryPage;
	
	@Test(dataProvider = "countriesList")
	public void testSearchCountry(String searchCountry, String expectedCountry) {		
		indexPage = new IndexPage();
		indexPage.openURL();
		countryPage = indexPage.searchCountry(searchCountry);
		
		assertEquals(countryPage.getTitleH1(), expectedCountry);
	}
	
	@DataProvider(name = "countriesList")
	public Object[][] dataProviderCountries() {
		return new Object[][] {
			{"India", "India" },
			{"Brazil", "Brazil" },
			{"Argentina", "Argentina"},
			{"Italy", "Italy"},
			{"Venezuela", "Venezuela"},
			{"United States", "United States"}
		};
	}
}
