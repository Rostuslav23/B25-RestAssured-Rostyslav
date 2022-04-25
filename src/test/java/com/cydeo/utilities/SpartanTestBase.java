package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class SpartanTestBase {

    @BeforeAll
    public static void init(){
    RestAssured.baseURI = "http://54.210.224.83:8000";
        }

}