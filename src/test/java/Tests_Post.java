import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Tests_Post {
    @Test
    public void test_01_post(){
        JSONObject request = new JSONObject();
        request.put("name","Teju");
        request.put("job","QA");
        System.out.println(request);
        System.out.println(request.toJSONString());
        given().
                body(request.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                 statusCode(201);




    }
}
