package nl.romkema.baseball.statistics.repository.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "STATISTICS")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
    private Long id;

//    @OneToOne(mappedBy = "related_player", fetch = FetchType.EAGER)
//    private Player player;
//    @OneToOne(mappedBy = "related_game", fetch = FetchType.EAGER)
//    private Game game;

    private String player;
    private String game;
    // batting stats
    private int atBats;
    private int singles;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int reachedOnErrors;
    private int reachedOnFieldersChoice;
    private int hitByPitches;
    private int sacrificeFly;
    private int sacrificeBunt;
    private int intentionalBaseOnBalls;
    private int baseOnBalls;
    private int flyOuts;
    private int groundOuts;
    private int strikeOuts;

    // on base stats
    private int runs;
    private int runnersBattedIn;
    private int stolenBases;
    private int stolenBaseAttempts;
    private int doublePlays;
    private int leftOnBases;
}
