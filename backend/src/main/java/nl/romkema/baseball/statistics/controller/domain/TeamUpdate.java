package nl.romkema.baseball.statistics.controller.domain;

import lombok.Data;

@Data
public class TeamUpdate {
    private Long id;
    private String oldTeamName;
    private String newTeamName;
}
