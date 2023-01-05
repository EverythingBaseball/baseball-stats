package nl.romkema.baseball.statistics.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Statistics")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

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
