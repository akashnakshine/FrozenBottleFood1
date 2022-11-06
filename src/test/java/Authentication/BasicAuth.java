package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class BasicAuth {
    @Test
	public void bearerToken()
	{ 
		baseURI ="https://github.com/";
		
		given().auth().basic("akashnakshine","Akash@12345678910")
		.when().get("/login")
		.then().log().all();
		
	
		
		
		
		
		
		
		
		
	}

}
