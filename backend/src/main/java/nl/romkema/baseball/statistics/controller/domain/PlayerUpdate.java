package nl.romkema.baseball.statistics.controller.domain;

import lombok.Data;

@Data
public class PlayerUpdate {

    private Long id;
    private String age; // format yyyy-mm-dd
    private String newAge;
    private String firstName;
    private String newFirstName;
    private String lastName;
    private String newLastName;
    private String playerNumber;
    private String newPlayerNumber;
}
