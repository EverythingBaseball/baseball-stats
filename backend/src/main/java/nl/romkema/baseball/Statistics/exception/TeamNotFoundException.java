package nl.romkema.baseball.Statistics.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TeamNotFoundException extends RuntimeException {

    private String message;
}
