package nl.romkema.baseball.statistics.stepDefs;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import nl.romkema.baseball.statistics.CucumberTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//        loader = SpringBootContextLoader.class,
//        classes = StatisticsApplication.class
//)
public class ApplicationStepDefs extends CucumberTest {

    @Given("^the application is up and running$")
    public void theApplicationIsUpAndRunning() {
        Response response =
                given()
                    .header("charset", "utf-8")
                .when()
                    .get("http://localhost:8322/actuator/health");

        assertEquals(200,response.getStatusCode());
        ActuatorHealth actuatorHealth = response.getBody().as(ActuatorHealth.class);
        assertEquals("UP", actuatorHealth.getStatus());
    }
}
