package nl.romkema.baseball.statistics.controller;

import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.statistics.domain.Team;
import nl.romkema.baseball.statistics.exception.TeamAlreadyExistsException;
import nl.romkema.baseball.statistics.exception.TeamNotFoundException;
import nl.romkema.baseball.statistics.service.PlayerService;
import nl.romkema.baseball.statistics.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TeamController {

    private final TeamService teamService;
    private final PlayerService playerService;

    @Autowired
    public TeamController(TeamService teamService, PlayerService playerService) {
        this.teamService = teamService;
        this.playerService = playerService;
    }

    @PostMapping(path = "/team/{teamName:.+}")
    public ResponseEntity<Team> createTeam(@PathVariable String teamName) {
        try {
            teamService.createNewTeam(teamName);
            Team team = teamService.findTeam(teamName);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .header("charset", "utf-8")
                    .body(team);
        } catch (TeamNotFoundException e) {
            log.info(String.format("Team not found [%s]", teamName));
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .header("charset", "utf-8")
                    .build();
        } catch (TeamAlreadyExistsException e) {
            log.info(String.format("Team [%s] already exists", teamName));
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .header("charset", "utf-8")
                    .build();
        }
    }

    @GetMapping(path = "/team/{teamName:.+}")
    public ResponseEntity<Team> findTeam(@PathVariable String teamName) {
        Team team = null;
        try {
            team = teamService.findTeam(teamName);
            return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(team);
        } catch (TeamNotFoundException e) {
            log.info(String.format("Team not found [%s]", teamName));
            return ResponseEntity.status(HttpStatus.NO_CONTENT).header("charset", "utf-8").build();
        }
    }

//    @RequestMapping(path = "/team", method = RequestMethod.PUT)
//    public ResponseEntity<Team> updateTeam(@RequestBody TeamUpdate teamUpdate) {
//        Team team = teamService.findTeam(teamUpdate.getOldTeamName());
//        if (!teamUpdate.getId().equals(team.getId())) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//        teamService.updateTeam(team.getId(), teamUpdate.getNewTeamName());
//        Team newTeam = teamService.findTeam(teamUpdate.getNewTeamName());
//        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(newTeam);
//    }
}
