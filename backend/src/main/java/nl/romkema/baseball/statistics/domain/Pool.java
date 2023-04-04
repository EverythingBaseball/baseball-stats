package nl.romkema.baseball.statistics.domain;

import lombok.Data;

import java.util.List;

@Data
public class Pool {

    private List<Team> teams;
    private Season season;
}
