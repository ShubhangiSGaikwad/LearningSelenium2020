package com.cogemnto.pages.cases;

import org.openqa.selenium.WebDriver;

public class Cases {

	public Cases_ShowFilters casesshowfilters;
	public Cases_Export casesexport;
	public Cases_New casesnew;

	public Cases(WebDriver dr) {
		casesshowfilters = new Cases_ShowFilters(dr);
		casesexport = new Cases_Export(dr);
		casesnew = new Cases_New(dr);

	}

}
