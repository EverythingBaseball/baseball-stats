package nl.romkema.baseball.Statistics.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerNotFoundException extends RuntimeException {

    private String message;
}
