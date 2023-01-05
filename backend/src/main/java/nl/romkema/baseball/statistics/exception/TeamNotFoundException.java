package nl.romkema.baseball.statistics.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TeamNotFoundException extends Exception {

    private String message;
}
