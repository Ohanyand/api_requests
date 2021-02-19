import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Request_Delete {
    @Test
    void delete(){

    given().
    delete("https://reqres.in/api/users/2").
    then().
    statusCode(204).body(is("")).
    log().all();
}
}
