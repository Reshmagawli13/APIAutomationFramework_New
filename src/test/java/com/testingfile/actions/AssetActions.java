package com.testingfile.actions;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssetActions {

    public void verifystatuscode (Response response){
        assertEquals(String.valueOf(response.getStatusCode()).startsWith("20"),
                true,"value of status code is" +response.getStatusCode());
    }

    public void verifyresponsebody(String actual, String expected , String description){
        assertEquals(actual,expected,description);
    }

    public void verifyresoponsebody (float actual, float expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyresoponsebody (double actual, double expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyresoponsebody (boolean actual, boolean expected, String description) {
        assertEquals(actual, expected, description);
    }

}
