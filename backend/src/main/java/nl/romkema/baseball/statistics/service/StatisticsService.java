package nl.romkema.baseball.statistics.service;

import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.statistics.domain.Game;
import nl.romkema.baseball.statistics.domain.Player;
import nl.romkema.baseball.statistics.domain.Statistics;
import nl.romkema.baseball.statistics.repository.StatisticsRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StatisticsService {

    private StatisticsRepository statisticsRepository;

    public void saveStatistics(Player player, Game game, Statistics statistics) {
        statisticsRepository.save(statistics);
    }
}
