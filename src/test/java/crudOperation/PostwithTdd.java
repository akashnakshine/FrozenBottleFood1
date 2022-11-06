package crudOperation;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PostwithTdd {
@Test
	public void PostwithTdd() {
	 baseURI = "http://localhost:8080";
	 
	 JSONObject object=new JSONObject();
	 object.put("email","akashnakshine27297@gmail.com");
	 object.put("name","akash@123");
	 object.put("password","medhansh567");
	 object.put("id",33);
	 
	 given()
	 .contentType(ContentType.JSON)
	 .body(object)
	 
	 .when()
	 .post("/admin")
	 
	 .then()
	 .assertThat().statusCode(201)
	 .log().all();
		 
}
}
