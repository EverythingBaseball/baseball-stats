package nl.romkema.baseball.statistics.repository.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
//@Entity
//@Table(name = "Game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "related_home_team", fetch = FetchType.LAZY)
    private Team homeTeam;
    @OneToOne(mappedBy = "related_away_team", fetch = FetchType.LAZY)
    private Team awayTeam;
    @OneToOne(mappedBy = "related_home_team_lineup", fetch = FetchType.LAZY)
    private Lineup homeTeamLineup;
    @OneToOne(mappedBy = "related_away_team_lineup", fetch = FetchType.LAZY)
    private Lineup awayTeamLineup;

    private LocalDateTime plannedGameStart;
}
