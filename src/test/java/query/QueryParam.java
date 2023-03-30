package query;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class QueryParam {

    private static int PER_PAGE=80;


    //https://api.punkapi.com/v2/beers?page=2&per_page=80
    @Test
    public void test2(){

        RestAssured.useRelaxedHTTPSValidation(); //żeby wyłączyć sprawdzanie certyfikatów
        given().param("per_page", PER_PAGE).
                param("page", 2).
                when().
                get("https://api.punkapi.com/v2/beers").
                then().
                log().
                body().
                statusCode(200);

    }
}
