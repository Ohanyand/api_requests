import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Request_Put {
    @Test
    void put(){
        JSONObject req = new JSONObject();
        req.put("Name","Gevorg");
        req.put("Job","PM");

        given().
                header("Content-type","application/json").
                body(req.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();
    }
}
