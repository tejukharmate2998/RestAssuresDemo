import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests_Put {
    @Test
    public void Test03_Put() {

        JSONObject request = new JSONObject();
        request.put("name", "Teju");
        request.put("job", "QA Engineer");
        System.out.println(request);
        System.out.println(request.toJSONString());
        given().
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();



    }
}
