package nl.romkema.baseball.statistics.service;

import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.statistics.repository.StatisticsRepository;
import nl.romkema.baseball.statistics.repository.domain.Game;
import nl.romkema.baseball.statistics.repository.domain.Player;
import nl.romkema.baseball.statistics.repository.domain.Statistics;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StatisticsService {

    private final StatisticsRepository statisticsRepository;

    public StatisticsService(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    public void saveStatistics(Player player, Game game, Statistics statistics) {
        statisticsRepository.save(statistics);
    }
}
