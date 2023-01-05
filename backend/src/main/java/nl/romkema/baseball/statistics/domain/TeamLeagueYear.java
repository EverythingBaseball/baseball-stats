package nl.romkema.baseball.statistics.domain;

import lombok.Data;

import java.util.List;

@Data
public class TeamLeagueYear {
    private Team team;
    private List<Player> players;
    private LeagueYear year;

    public TeamLeagueYear(Team team, List<Player> players, LeagueYear year) {
        this.team = team;
        this.players = players;
        this.year = year;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
