package nl.romkema.baseball.statistics.repository.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
//@Entity
//@Table(name = "Lineup")
public class Lineup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Game game;
    private Team homeTeam;
    private Team awayTeam;

    private List<Player> homeTeamPlayers;
    private List<Player> awayTeamPlayers;

}
