package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteFoodmenuId {
    @Test
	public  void Delete2withTdd() {
		
baseURI = "http://localhost:8080";
		
		when()
		.delete("/foodMenus/62")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
	}

}
