package ru.netology.service;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void TestsPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Tests")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("Tests"));

    }
}
