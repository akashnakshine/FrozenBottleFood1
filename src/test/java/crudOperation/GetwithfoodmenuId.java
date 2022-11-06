package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetwithfoodmenuId {
    @Test
	public void  Get2withTdd() {
baseURI = "http://localhost:8080";
		
		when()
		.get("foodMenus/7")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
    }

}
