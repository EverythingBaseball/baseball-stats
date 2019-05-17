package nl.romkema.baseball.Statistics.service;

import nl.romkema.baseball.Statistics.domain.Team;
import nl.romkema.baseball.Statistics.exception.TeamNotFoundException;
import nl.romkema.baseball.Statistics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void createNewTeam(String teamName) {
        Team team = new Team();
        team.setTeamName(teamName);

        teamRepository.save(team);
    }

    public Team findTeam(String teamName) {
        return teamRepository.findByTeamName(teamName);
    }

    public void updateTeam(Long teamId, String newTeamName) {
        Optional<Team> optionalTeam = teamRepository.findById(teamId);

        if (optionalTeam.isPresent()) {
            Team team = optionalTeam.get();
            team.setTeamName(newTeamName);
            teamRepository.save(team);
        } else {
            throw new TeamNotFoundException(String.format("Team with id%s not found", teamId));
        }
    }
}
