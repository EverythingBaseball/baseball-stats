package nl.romkema.baseball.statistics.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import nl.romkema.baseball.statistics.CucumberTest;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GameStepDefs extends CucumberTest {

    private Response response;

    @When("^a request to register a game is made$")
    public void registerGame(DataTable dataTable) throws IOException {
        List<String> games = retrieveGame(dataTable);

//        response = given()
//                    .header("charset", "utf-8")
//                .when()
//                    .body(getGameFile(games.get(0)))
//                    .post(gameUrl);

//        assertEquals(200, response.getStatusCode());
    }

    @Then("^the game is successfully stored$")
    public void gameSuccessfullyRegistered(DataTable dataTable) {
//        Response response =
//                given()
//                    .header("charset", "utf-8")
//                .when()
//                    .get(gameUrl);

//        assertEquals(200, response.getStatusCode());
    }

    private List<String> retrieveGame(DataTable dataTable) {
        List<String> games = new ArrayList<>(1);
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            games.add(columns.get("game"));
        }
        return games;
    }

    private String getGameFile(String gameFileName) throws IOException {
        ClassPathResource resourceFile = new ClassPathResource("testFiles/" + gameFileName + ".json");
        File gameFile = resourceFile.getFile();
        List<String> lines = Files.readAllLines(gameFile.toPath());
        return Arrays.toString(lines.toArray());
    }
}
