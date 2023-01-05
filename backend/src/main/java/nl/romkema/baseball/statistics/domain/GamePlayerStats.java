package nl.romkema.baseball.statistics.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
//@Entity
//@Table(name = "")
public class GamePlayerStats {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private Long id;

    private Game game;
    private Player player;
    private Statistics statistics;
}
