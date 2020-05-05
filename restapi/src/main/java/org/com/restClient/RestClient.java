package org.com.restClient;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	// GET Method : Hit the url and get the response

	public void get(String url) throws ClientProtocolException, IOException {

		CloseableHttpClient httpClientReference = HttpClients.createDefault();

		// HttpClients class consist of createDefault method for client connection
		// and it returns CloseableHttpClient class object.

		HttpGet httpget = new HttpGet(url); // http get request
		// httpClientReference.execute(httpget); // hit the get url

		CloseableHttpResponse response = httpClientReference.execute(httpget);// hit the get url

		// a.Status
		int status = response.getStatusLine().getStatusCode();
		System.out.println(response);

		// b.Json String
		// Getting the entire response to String
		String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");

		// responseString

		JSONObject convert2json = new JSONObject(responseString);
		System.out.println("Entire Response " + convert2json);

		// c.headers
		Header[] headerarray = response.getAllHeaders();

		HashMap<String, String> allHeaders = new HashMap<String, String>();

		for (Header header : headerarray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Header Output " + allHeaders);

	}
}

//https://reqres.in/api/users?page=2