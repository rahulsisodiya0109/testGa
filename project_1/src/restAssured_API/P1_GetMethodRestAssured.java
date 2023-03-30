package restAssured_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class P1_GetMethodRestAssured {

	@Test
	public void getDetails() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.request(Method.GET, "");
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.prettyPrint());
		
		//validate the response header
		Headers allHeaders = resp.headers();
		for(Header header : allHeaders) {
			System.out.println(header.getName() + " : " + header.getValue());
		}
	}
}
