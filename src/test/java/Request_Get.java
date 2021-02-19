import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

public class Request_Get {
    @Test
    void getUser_List() {

        given().
                get("https://reqres.in/api/users?page=2/").
                then().
                statusCode(200).body("data.id[1]",equalTo(8)).body("data.first_name", hasItem("Lindsay")).
                log().all();

    }
}
