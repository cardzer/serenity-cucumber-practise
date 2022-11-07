package dvsa.dan.glue;

import dvsa.dan.steps.DanSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestApiDefinition {
    private String endpoint;
    private String type;
    @Steps
    DanSteps danSteps;

    @Given("i want to check status of the API")
    public void getBakeryBaseUrl() {
        this.endpoint = "bakery";
    }

    @When("i hit the bakery endpoint")
    public void callBakeryEndpoint() {
        danSteps.callGetBakery(this.endpoint);
    }

    @Then("the status code returned should be {int}")
    public void theStatusCodeReturnedShouldBe(int statusCode) {
        danSteps.statusCodeShouldBe(statusCode);
    }

//    @Then("^the first type should be (.*)")
//    public void validateBakeryData(Map<String, String> returnedData) {
//        Map<String, String> extracted = returnedData.stream()
//                .filter(map -> Objects.equals(map.get("TYPE"), "MUFFINS"))
//                .findFirst().orElse(null);
//
//        danSteps.validateBakeryData(extracted);
//    }
}
