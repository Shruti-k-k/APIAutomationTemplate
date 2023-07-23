package org.apiautomation.tests.fullcrud;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apiautomation.endpoints.APIConstants;
import org.testng.annotations.Test;

public class GETRequest {

    @Test
    public  void get_test() {

        RequestSpecification r = RestAssured.given(); // Pre script
        r.baseUri(APIConstants.BASE_URL);
        r.basePath(APIConstants.BASE_AUTH_URL);
        r.when().get();
        r.then().statusCode(200);
    }
}
