package query;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AcceptJson {

@Test

    public void test4contetnt(){
    given().
            accept(ContentType.JSON).
            pathParam("endpoint","beers").
            param("per_page",80).
            param("page",4).
            log().headers().
            when().
            get("https://api.punkapi.com/v2/{endpoint}").

            then().
            //log().body().
            statusCode(200);

}
}
