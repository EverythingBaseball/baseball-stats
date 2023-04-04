package nl.romkema.baseball.statistics.repository.domain;

import lombok.Data;

@Data
public class LeagueYear {
    private League league;
    private String year;
}
