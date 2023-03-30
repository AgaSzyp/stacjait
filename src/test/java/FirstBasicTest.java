import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class FirstBasicTest {

        @Test
        public void test1() {
            given().
                    log().all().

            when().
                    get("https://google.pl").
                    then().
                            log().all().
                    statusCode(200);
        }


    }
