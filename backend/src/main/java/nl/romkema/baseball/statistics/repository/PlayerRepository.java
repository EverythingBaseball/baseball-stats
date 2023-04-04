package nl.romkema.baseball.statistics.repository;

import nl.romkema.baseball.statistics.repository.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PlayerRepository /*extends JpaRepository<Player, Long> */{

    Player findByPlayerNumber(String playerNumber);
    Player findByFirstNameAndLastName(String firstName, String lastName);
}
