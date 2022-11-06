package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class GetWithadminId {
    @Test
	public void getwithTdd() {
		
        baseURI = "http://localhost:8080";
    	given()
    	.contentType(ContentType.JSON)
		
		.when()
		.get("/admin/40")
		
		.then()
		.assertThat().contentType("application/xml")
		.statusCode(200)
		.log().all();
		
	}

}
