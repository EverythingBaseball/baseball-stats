package nl.romkema.baseball.statistics.controller;

import nl.romkema.baseball.statistics.controller.domain.BaseballStatsResponse;
import nl.romkema.baseball.statistics.controller.domain.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseballStatsController {

    @GetMapping
    public Response baseballStats() {
        return new BaseballStatsResponse()
                .setFederationsUrl("")
                .setCurrentUserUrl("")
                .setUrl("/");
    }
}
