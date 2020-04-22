package com.cogemnto.pages.campaigns;

import org.openqa.selenium.WebDriver;

public class Campaigns {

	public Campaigns_New campaigns_new;

	public Campaigns(WebDriver dr) {

		campaigns_new = new Campaigns_New(dr);

	}
}
