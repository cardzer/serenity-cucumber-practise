package dvsa.dan.clients;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import static net.serenitybdd.rest.RestRequests.with;

public class ApiClient {

    public ApiClient() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.requestSpecification = new RequestSpecBuilder().
                addHeader("x-api-key", "0b9cdada-cd50-40c3-8c27-e6da7357bf1e")
                .build();
    }

    /**
     * Call to version endpoint
     *
     * @param endpoint String representing the endpoint to call
     * @return RestAssured Response object
     */
    public Response callGetBekery(String endpoint) {
        return with()
                .basePath(endpoint)
                .get();
    }
}
