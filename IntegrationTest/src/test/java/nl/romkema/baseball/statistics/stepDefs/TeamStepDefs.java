package nl.romkema.baseball.statistics.stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import nl.romkema.baseball.statistics.CucumberTest;
import nl.romkema.baseball.statistics.components.TeamComponent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TeamStepDefs extends CucumberTest {

    private Response response;


    @Given("no team with (.*) is available")
    public void noTeamWithNameIsAvailable(String name) {
        response = TeamComponent.getTeamResponse(name);

        assertEquals(204, response.getStatusCode());
    }

    @Given("^a team with (.*) is available$")
    public void aTeamWithNameIsAvailable(String name) {
        response = TeamComponent.getTeamResponse(name);
        if (200 != response.getStatusCode()) {
            TeamComponent.createTeam(name);
        }
        response = TeamComponent.getTeamResponse(name);
        if (200 != response.getStatusCode()) {
            throw new RuntimeException("Could not create team");
        }
    }

    @When("a new request with (.*) is made to create a team")
    public void aNewRequestWithNameIsMadeToCreateATeam(String name) {
        response = TeamComponent.createTeam(name);
    }

    @When("a new requests is made to find team with (.*)")
    public void aNewRequestsIsMadeToFindTeamWithName(String name) {
        response = TeamComponent.getTeamResponse(name);
    }

    @When("^a new request to update found team with new name \"(.*)\" is made$")
    public void aNewRequestToUpdateFoundTeamWithNewNameIsMade(String name) {

    }

    @Then("^the team is created properly$")
    public void teamIsCreated() {
        assertEquals(200, response.getStatusCode());
    }

    @Then("^the team-request should return with a valid response$")
    public void theRequestShouldReturnWithAValidResponse() {
        assertEquals(200, response.getStatusCode());
    }

    @Then("^the team-request should return with an invalid response$")
    public void theRequestShouldReturnWithAnInvalidResponse() {
        assertNotEquals(200, response.getStatusCode());
    }

    @Then("^(.*) should match with response data$")
    public void ShouldMatchWithResponseData(String name) {
        throw new PendingException("implement this methXod");
    }

    @Then("^the team-request should fail with team already exists error$")
    public void theTeamRequestShouldFailWithTeamAlreadyExistsError() {
        assertEquals(500, response.getStatusCode());
    }
}
