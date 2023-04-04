package nl.romkema.baseball.statistics.repository;

import nl.romkema.baseball.statistics.repository.domain.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
