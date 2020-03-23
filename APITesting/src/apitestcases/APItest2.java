package apitestcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APItest2 {

	
	@Test
	public void postrequest() {
		
	RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/create";
	RequestSpecification request = RestAssured.given();
	//create a object of RestAssured.given.
		
	Object str="{\"name\":\"Shubhangi Gaikwad\",\"salary\":\"4000\",\"age\":\"39\"}";

	request.body(str);
	request.header("Content-Type","application/json");
		
	Response response =request.request(Method.POST);			
	int statuscode = response.getStatusCode();
	System.out.println("Post StatusCode is "+statuscode );
	System.out.println("Post Response Status Code is "+response.asString() );
	
	}
	
	
}
