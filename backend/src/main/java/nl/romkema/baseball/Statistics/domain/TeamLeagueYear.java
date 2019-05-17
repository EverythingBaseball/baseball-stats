package nl.romkema.baseball.Statistics.domain;

import java.util.List;

public class TeamLeagueYear {
    private Team team;
    private List<Player> players;
    private String year;

    public TeamLeagueYear(Team team, List<Player> players, String year) {
        this.team = team;
        this.players = players;
        this.year = year;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
