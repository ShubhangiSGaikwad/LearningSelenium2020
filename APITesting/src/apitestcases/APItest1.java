package apitestcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APItest1 {

	
	@Test
	public void getrequest() {
		
	RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/employees";
	
	RequestSpecification request = RestAssured.given();
	//create a object of RestAssured.given.
	
	Response response =request.request(Method.GET);
	int statuscode = response.getStatusCode();
	System.out.println("StatusCode is "+statuscode );
	System.out.println("Response Status Code is "+response.asString() );
			
	
	}
	
	
}
