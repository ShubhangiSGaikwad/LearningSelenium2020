package org.com.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.com.restClient.RestClient;
import org.com.restapi.base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testRestApi extends TestBase {

	TestBase testobject;
	String mainurl;
	String submainurl;
	String url;
	RestClient restclient;

	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {

		testobject = new TestBase();
		System.out.println("**********");

		String mainurl = prop.getProperty("URL");
		System.out.println(testobject.prop.getProperty("URL"));

		submainurl = prop.getProperty("serviceURL");
		url = mainurl + submainurl;

	}

	@Test
	public void getTest() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		restclient.get(url);
	}

}

//System.out.println(mainurl);
// String mainurl = prop.getProperty("URL");
// System.out.println(mainurl);''