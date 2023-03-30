package query;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.codehaus.groovy.ast.tools.GeneralUtils.param;


public class PathParam {

//https://api.punkapi.com/v2/beers
@Test
    public void testparam(){

    given().
        pathParam("endpoint","beers").
        param("per_page",76).
            param("page",2).log().uri().

            when().
                    get("https://api.punkapi.com/v2/{endpoint}").

                    then().
                    log().body().statusCode(200);


}


}
