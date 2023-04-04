package nl.romkema.baseball.statistics.service;

import nl.romkema.baseball.statistics.repository.domain.Team;
import nl.romkema.baseball.statistics.exception.TeamAlreadyExistsException;
import nl.romkema.baseball.statistics.exception.TeamNotFoundException;
import nl.romkema.baseball.statistics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

//    private final TeamRepository teamRepository;
    private final static String teamNotFound = "Team [%s] not found";

//    @Autowired
//    public TeamService(TeamRepository teamRepository) {
//        this.teamRepository = teamRepository;
//    }

//    public void createNewTeam(String teamName) throws TeamAlreadyExistsException {
//        Team team = Team.builder()
//                .teamName(teamName)
//                .build();
//
//        if (teamRepository.findByTeamName(teamName).isPresent()) {
//            throw new TeamAlreadyExistsException("");
//        } else {
//            teamRepository.save(team);
//        }
//    }

//    public Team findTeam(String teamName) throws TeamNotFoundException {
//        Optional<List<Team>> team = teamRepository.findByTeamName(teamName);
//
//        if (team.isPresent()) {
//            return team.get().get(0);
//        } else {
//            throw new TeamNotFoundException(String.format(TeamService.teamNotFound, teamName));
//        }
//    }

//    public void updateTeam(Long teamId, String newTeamName) {
//        Optional<Team> optionalTeam = teamRepository.findById(teamId);
//
//        if (optionalTeam.isPresent()) {
//            Team team = optionalTeam.get();
//            team.setTeamName(newTeamName);
//            teamRepository.save(team);
//        } else {
//            throw new TeamNotFoundException(String.format("Team with id%s not found", teamId));
//        }
//    }
}
