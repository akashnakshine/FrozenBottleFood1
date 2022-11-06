package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post2withTdd {
@Test
	public void Post2withTdd() { 
		
		 baseURI = "http://localhost:8080";
		 
//		 JSONObject object=new JSONObject();
//		 object.put("email","akashnakshine27@gmail.com");
//		 object.put("password","hrisha");
//		 
		 File object=new File("C:\\Users\\ms\\Desktop\\JSONDATA.json");
		 given()
		 .contentType(ContentType.JSON)
		 .body(object) 
		 
		 .when()
		 .post("/foodMenus")
		 
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
			 
	}

}
