import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Tests_Delete {
    @Test
    public void Test04_Delete() {
        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();


    }
}
