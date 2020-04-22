package com.cogemnto.pages.forms;

import org.openqa.selenium.WebDriver;

public class Forms {

	public Forms_New forms_new;

	public Forms(WebDriver dr) {

		forms_new = new Forms_New(dr);

	}
}
