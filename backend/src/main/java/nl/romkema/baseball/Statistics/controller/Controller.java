package nl.romkema.baseball.Statistics.controller;

import nl.romkema.baseball.Statistics.controller.domain.PlayerUpdate;
import nl.romkema.baseball.Statistics.domain.Player;
import nl.romkema.baseball.Statistics.domain.Team;
import nl.romkema.baseball.Statistics.exception.PlayerNotFoundException;
import nl.romkema.baseball.Statistics.service.PlayerService;
import nl.romkema.baseball.Statistics.service.TeamService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final TeamService teamService;
    private final PlayerService playerService;

    @Autowired
    public Controller(TeamService teamService, PlayerService playerService) {
        this.teamService = teamService;
        this.playerService = playerService;
    }

    @RequestMapping(path = "/team/{teamName:.+}", method = RequestMethod.POST)
    public ResponseEntity<Team> createTeam(@PathVariable String teamName) {
        teamService.createNewTeam(teamName);
        Team team = teamService.findTeam(teamName);
        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(team);
    }

    @RequestMapping(path = "team/{teamName:.+}", method = RequestMethod.GET)
    public ResponseEntity<Team> findTeam(@PathVariable String teamName) {
        Team team = teamService.findTeam(teamName);

        if (team != null) {
            return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(team);
        } else {
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

    @RequestMapping(path = "/player", method = RequestMethod.POST)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        if (StringUtils.isEmpty(player.getFirstName()) || StringUtils.isEmpty(player.getLastName()) || StringUtils.isEmpty(player.getBirthDate()) || StringUtils.isEmpty(player.getPlayerNumber())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Player createdPlayer = playerService.createNewPlayer(player);

        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(createdPlayer);
    }

    @RequestMapping(path = "player", method = RequestMethod.GET)
    public ResponseEntity<Player> findPlayer(@RequestBody Player player) {
        Player foundPlayer = playerService.findByAny(player);
        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(foundPlayer);
    }

    @RequestMapping(path = "player/{playerNumber:.+}", method = RequestMethod.GET)
    public ResponseEntity<Player> findPlayer(@PathVariable String playerNumber) {
        try {
            Player foundPlayer = playerService.find(playerNumber);
            return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(foundPlayer);
        } catch (PlayerNotFoundException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @RequestMapping(path = "/player", method = RequestMethod.PUT)
    public ResponseEntity<Player> updatePlayer(@RequestBody PlayerUpdate playerUpdate) {
        Player player = playerService.updatePlayer(playerUpdate);
        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(player);
    }

}
