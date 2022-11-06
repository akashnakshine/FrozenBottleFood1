package Authentication;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class BearerToken {

	
	
		@Test
		public void bearerToken() {
		
			baseURI = "https://api.github.com";
			
			JSONObject obj= new JSONObject();
			
			obj.put("name", "FrozenBottleFood");
			
			given().auth().oauth2("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")
			.body(obj).contentType(ContentType.JSON)
			.when().post("/users/repos")
			.then().log().all();
			
		
}
}