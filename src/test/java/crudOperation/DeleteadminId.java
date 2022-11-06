package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteadminId {
    @Test
	public void DeletewithTdd() {
	
baseURI = "http://localhost:8080";
		
		when()
		.delete("/admins/62")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
	}

}
