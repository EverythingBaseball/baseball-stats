package nl.romkema.baseball.statistics.controller;

import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.statistics.repository.domain.Statistics;
import nl.romkema.baseball.statistics.service.StatisticsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StatisticsController {

    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @PostMapping("/statistics")
    public void saveStatistics(@RequestBody Statistics statistics) {
        statisticsService.saveStatistics(null, null, statistics);
    }

    @GetMapping("/statistics")
    public ResponseEntity<Statistics> getStatistics() {
        return ResponseEntity.status(HttpStatus.OK).body(null);
//                .body(statisticsService.findStatistics("playerId", "gameId"));
    }
}
