import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Request_Post {
    @Test
    void Post(){
        JSONObject req = new JSONObject();
        req.put("Name","Gevorg");
        req.put("Job","PM");

        given().
        header("Content-type","application/json").
                body(req.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201).
        log().all();
    }


}
