package nl.romkema.baseball.statistics.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.statistics.CucumberTest;
import nl.romkema.baseball.statistics.components.PlayerComponent;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

@Slf4j
public class PlayerStepDefs extends CucumberTest {

    private boolean responseValid = false;

    @Given("^no player with data is available$")
    public void noPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        String playerNumber = null;
        for (Map<String, String> columns : rows) {
//            System.out.println("Birthdate: " + columns.get("birthDate"));
//            System.out.println("firstName: " + columns.get("firstName"));
//            System.out.println("lastName: " + columns.get("lastName"));
//            System.out.println("playerNumber: " + columns.get("playerNumber"));
            playerNumber = columns.get("playerNumber");
        }
        assertNotNull(playerNumber);

        Response getPlayerResponse = PlayerComponent.getAllPlayers();

        assertNotNull(getPlayerResponse);
//        AllPlayersResponse players = getPlayerResponse.getBody().as(AllPlayersResponse.class);
//        String finalPlayerNumber = playerNumber;
//        players.getPlayers().forEach(player -> {
//                if (player.getPlayerNumber().equalsIgnoreCase(finalPlayerNumber)) {
//                    log.info("Player found!");
//                    fail();
//                }
//            }
//        );
    }

    @Given("^a player with data is available$")
    public void aPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        String playerNumber = null;
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            playerNumber = columns.get("playerNumber");
        }
        assertNotNull(playerNumber);

        Response getPlayerResponse = PlayerComponent.getAllPlayers();

        assertNotNull(getPlayerResponse);
//        AllPlayersResponse players = getPlayerResponse.getBody().as(AllPlayersResponse.class);
//        String finalPlayerNumber = playerNumber;
//        AtomicBoolean found = new AtomicBoolean(false);
//        players.getPlayers().forEach(player -> {
//                    if (player.getPlayerNumber().equalsIgnoreCase(finalPlayerNumber)) {
//                        log.info("Player found!");
//                        found.set(true);
//                    }
//                }
//        );
//        assertTrue(found.get());
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
        throw new PendingException("implement this method");
    }

    @When("^a new request to create a player with data is made$")
    public void createPlayer(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            columns.get("birthDate");
            columns.get("firstName");
            columns.get("lastName");
            columns.get("playerNumber");
        }
        throw new PendingException("implement this method");
    }

    @When("^a request is made to retrieve all players$")
    public void getAllPlayers() {
        throw new PendingException("implement");
    }

    @Then("^the player-request should return with a valid response$")
    public void validResponse() {
        if (!responseValid) {
            throw new PendingException("implement");
        }
    }

    @Then("^the player-request should return with an invalid response$")
    public void invalidResponse() {
        if (responseValid) {
            throw new PendingException("implement");
        }
    }

    @Then("^the player-list-request should return with a full list$")
    public void playerListReturned(DataTable dataTable) {
        throw new PendingException("implement this method");
    }
}
