package com.cogemnto.pages.documents;

import org.openqa.selenium.WebDriver;

public class Documents {

	public Documents_NewFolder documentnewfolder;
	public Documents_New documentnew;

	public Documents(WebDriver dr) {
		documentnewfolder = new Documents_NewFolder(dr);
		documentnew = new Documents_New(dr);

	}

}