package nl.romkema.baseball.statistics.repository.domain;

import lombok.Data;

import jakarta.persistence.*;

@Data
//@Entity
//@Table(name = "Player")
public class Player extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String birthDate; // format yyyy-mm-dd
    private String firstName;
    private String lastName;
    private String sex;
    private String playerNumber;
    private String emailAddress;

}
