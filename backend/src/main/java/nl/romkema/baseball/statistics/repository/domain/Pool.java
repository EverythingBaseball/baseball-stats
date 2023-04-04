package nl.romkema.baseball.statistics.repository.domain;

import lombok.Data;

import java.util.List;

@Data
public class Pool {

    private List<Team> teams;
    private Season season;
}
