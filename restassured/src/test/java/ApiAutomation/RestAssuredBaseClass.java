//This class contains the url and authentication details of the api

package ApiAutomation;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class RestAssuredBaseClass {
	@BeforeClass
	public void setup()
	{
		RestAssured.authentication=RestAssured.preemptive().basic("mailto:wong.afiq.1234@gmail.com", "Thi$1sTest");
		RestAssured.baseURI="https://developer.todoist.com/rest/v1/";
		
	}

}
