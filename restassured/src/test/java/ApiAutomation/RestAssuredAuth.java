//This class is the test case of api scenario which inherits functionalities of the base class

package ApiAutomation;

//import static io.restassured.RestAssured.get;

//import org.apache.http.auth.AUTH;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;

public class RestAssuredAuth extends RestAssuredBaseClass
{
	@Test(priority=1)
	public void authTestResponseCode() 
	{
		int code=RestAssured.given()
		.get()
		.getStatusCode();
		
		System.out.println("Response code from the server is "+code);
		
					
	}
	
	@Test(priority=2)
	public void authTestResponseBody()
	{
	String data=RestAssured.given()
			.get()
			.asString();
	
	System.out.println("Response Data from the server is "+data);
	
		
	}
	

	@Test(priority=3)
	public void authTestResponseTime()
	{
	long time=RestAssured.given()
			.get()
			.getTime();
	
	System.out.println("Response Time from the server is "+time);
	
		
	}

}
