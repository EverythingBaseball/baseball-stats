package nl.romkema.baseball.statistics.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TeamAlreadyExistsException extends Exception {

    private String message;
}
