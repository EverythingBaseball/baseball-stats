package nl.romkema.baseball.Statistics.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import nl.romkema.baseball.Statistics.CucumberTest;

import static io.restassured.RestAssured.given;

public class TeamStepDefs extends CucumberTest {

    private Object response;

    private final static String host = "http://localhost:8080/";
    private final static String teamUrl = host + "team/";

    @Given("^no team with (.*) is available$")
    public void noTeamWithIsAvailable(String name) {
        Response response =
                given()
                    .header("charset", "utf-8")
                .when()
                    .get(teamUrl + name, 5);

        if(204 != response.getStatusCode()) {
            throw new RuntimeException("Team IS found");
        }
    }

    @Given("^a team with (.*) is available$")
    public void aTeamWithIsAvailable(String name) {
        throw new PendingException("implement this method");
    }

    @When("a new request with (.*) is made to create a team")
    public void aNewRequestWithIsMadeToCreateATeam(String name) {
        response = new String(""); // TODO
        throw new PendingException("implement this method");
    }

    @When("a new requests is made to find team with (.*)")
    public void aNewRequestsIsMadeToFindTeamWith(String name) {
        response = new String(""); // TODO
        throw new PendingException("implement this method");
    }

    @When("^a new request to update found team with new name \"(.*)\" is made$")
    public void aNewRequestToUpdateFoundTeamWithNewNameIsMade(String name) {

    }

    @Then("^the team-request should return with a valid response$")
    public void theRequestShouldReturnWithAValidResponse() {
        if (response != null) {
            //
        } else {
            // throw error
        }
        throw new PendingException("implement this method");
    }

    @Then("^the team-request should return with an invalid response$")
    public void theRequestShouldReturnWithAnInvalidResponse() {
        if (response != null) {
            //
        } else {
            // throw error
        }
        throw new PendingException("implement this method");
    }

    @Then("^(.*) should match with response data$")
    public void ShouldMatchWithResponseData(String name) {
        throw new PendingException("implement this methXod");
    }
}
