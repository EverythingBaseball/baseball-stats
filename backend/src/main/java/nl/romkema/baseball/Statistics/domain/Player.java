package nl.romkema.baseball.Statistics.domain;

import lombok.Data;

@Data
public class Player {

    private Long id;
    private String birthDate; // format yyyy-mm-dd
    private String firstName;
    private String lastName;
    private String playerNumber;

}
