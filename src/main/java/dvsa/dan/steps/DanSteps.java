package dvsa.dan.steps;

import dvsa.dan.clients.ApiClient;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import java.util.Map;

import static org.hamcrest.Matchers.*;

public class DanSteps {
    ApiClient danApiClient = new ApiClient();

    Response response;
    @Step
    public void callGetBakery(String endpoint) {
        response = danApiClient.callGetBekery(endpoint);
        response.then().body("TYPE",hasItem("MUFFINS"));
    }

    @Step
    public void statusCodeShouldBe(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Step
    public void validateBakeryData(Map<String, String> dataToCheck) {
      response.then().body(".[0].type", hasToString(dataToCheck.get("type")));
    }

    @Step
    public void validateErrorMessage(String errorMessage) {
        response.then().body("errorMessage", contains(errorMessage));
    }
}
