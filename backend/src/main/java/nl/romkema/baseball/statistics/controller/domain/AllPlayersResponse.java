package nl.romkema.baseball.statistics.controller.domain;

import lombok.Data;
import nl.romkema.baseball.statistics.repository.domain.Player;

import java.util.List;

@Data
public class AllPlayersResponse {

    private List<Player> players;
}
