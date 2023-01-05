package nl.romkema.baseball.statistics.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerNotFoundException extends RuntimeException {

    private String message;
}
