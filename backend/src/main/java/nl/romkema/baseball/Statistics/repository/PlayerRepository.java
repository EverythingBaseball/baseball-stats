package nl.romkema.baseball.Statistics.repository;

import nl.romkema.baseball.Statistics.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findByPlayerNumber(String playerNumber);
    Player findByFirstNameAndLastName(String firstName, String lastName);
}
