package com.cogemnto.pageshost;

import org.openqa.selenium.WebDriver;

import com.cogemnto.pages.calls.Calls;
import com.cogemnto.pages.campaigns.Campaigns;
import com.cogemnto.pages.cases.Cases;
import com.cogemnto.pages.documents.Documents;
import com.cogemnto.pages.forms.Forms;
import com.cogemnto.pages.home.Homes;

public class PageHost {

	
	public Homes homes;
	public Cases cases;
	public Calls calls;
	public Documents documents;
	public Campaigns campaigns;
	public Forms forms;
	

	// add object for truck,motorcycle and camper

	public PageHost(WebDriver dr)
	{
		homes = new Homes(dr);
		cases = new Cases(dr);
//		//calls=  new Calls(dr);
		documents= new Documents(dr);
		campaigns = new Campaigns(dr);
		forms =new Forms(dr);
		
		//initialize the reference
	
	}

}