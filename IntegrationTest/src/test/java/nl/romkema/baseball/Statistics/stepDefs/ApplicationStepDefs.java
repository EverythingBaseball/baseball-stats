package nl.romkema.baseball.Statistics.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import nl.romkema.baseball.Statistics.CucumberTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//        loader = SpringBootContextLoader.class,
//        classes = StatisticsApplication.class
//)
public class ApplicationStepDefs extends CucumberTest {

    @Given("^the application is up and running$")
    public void theApplicationIsUpAndRunning() {
        throw new PendingException("implement this methXod");
    }
}
