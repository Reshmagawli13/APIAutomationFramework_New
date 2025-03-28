package com.testingfile.misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class TestFile {

    @Test
    public void postrequest(){
        String Payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .when().body(Payload).post()
                .then().log().all().statusCode(200);
    }
}
