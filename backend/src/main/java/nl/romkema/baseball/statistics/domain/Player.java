package nl.romkema.baseball.statistics.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String birthDate; // format yyyy-mm-dd
    private String firstName;
    private String lastName;
    private String playerNumber;

}
