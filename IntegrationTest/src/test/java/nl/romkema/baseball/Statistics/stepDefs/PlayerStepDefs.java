package nl.romkema.baseball.Statistics.stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import nl.romkema.baseball.Statistics.CucumberTest;

import java.util.List;
import java.util.Map;

public class PlayerStepDefs extends CucumberTest {

    @Given("no player with data is available")
    public void noPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        data.get(0).get("birthDate");
    }

    @Given("a player with data is available")
    public void aPlayerWithDataIsAvailable(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        data.get(0).get("birthDate");
    }
}
