package nl.romkema.baseball.Statistics.stepDefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.romkema.baseball.Statistics.CucumberTest;

import java.util.List;
import java.util.Map;

public class PlayerStepDefs extends CucumberTest {

    private boolean responseValid = false;

    @Given("^no player with (.*) is available$")
    public void noPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            columns.get("playerNumber");
        }
        throw new PendingException("implement this methXod");
    }

    @Given("^a player with (.*) is available$")
    public void aPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            columns.get("playerNumber");
        }
        throw new PendingException("implement this methXod");
    }

    @Given("^all following players are added$")
    public void addPlayers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            columns.get("playerNumber");
        }
    }

    @When("^a new request to create a player with (.*) is made$")
    public void createPlayer(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            columns.get("playerNumber");
        }
    }

    @Then("^the player-request should return with a valid response$")
    public void validResponse() {
        if (!responseValid) {
            throw new RuntimeException("");
        }
    }

    @Then("^the player-request should return with an invalid response$")
    public void invalidResponse() {
        if (responseValid) {
            throw new RuntimeException("");
        }
    }

}
