package nl.romkema.baseball.statistics.controller;

import nl.romkema.baseball.statistics.controller.domain.AllPlayersResponse;
import nl.romkema.baseball.statistics.repository.domain.Player;
import nl.romkema.baseball.statistics.exception.PlayerNotFoundException;
import nl.romkema.baseball.statistics.service.PlayerService;
import nl.romkema.baseball.statistics.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private final TeamService teamService;
    private final PlayerService playerService;

    @Autowired
    public PlayerController(TeamService teamService, PlayerService playerService) {
        this.teamService = teamService;
        this.playerService = playerService;
    }

//    @RequestMapping(path = "/player", method = RequestMethod.POST)
//    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
//        if (StringUtils.isEmpty(player.getFirstName()) || StringUtils.isEmpty(player.getLastName()) || StringUtils.isEmpty(player.getBirthDate()) || StringUtils.isEmpty(player.getPlayerNumber())) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//        Player createdPlayer = playerService.createNewPlayer(player);

//        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(createdPlayer);
//    }

//    @RequestMapping(path = "player", method = RequestMethod.GET)
//    public ResponseEntity<Player> findPlayer(@RequestBody Player player) {
//        Player foundPlayer = playerService.findByAny(player);
//        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(foundPlayer);
//    }

//    @RequestMapping(path = "player/{playerNumber:.+}", method = RequestMethod.GET)
//    public ResponseEntity<Player> findPlayer(@PathVariable String playerNumber) {
//        try {
//            Player foundPlayer = playerService.find(playerNumber);
//            return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(foundPlayer);
//        } catch (PlayerNotFoundException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }

    @RequestMapping(path = "players", method = RequestMethod.GET)
    public ResponseEntity<AllPlayersResponse> getAllPlayers() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

//    @RequestMapping(path = "/player", method = RequestMethod.PUT)
//    public ResponseEntity<Player> updatePlayer(@RequestBody PlayerUpdate playerUpdate) {
//        Player player = playerService.updatePlayer(playerUpdate);
//        return ResponseEntity.status(HttpStatus.OK).header("charset", "utf-8").body(player);
//    }
}
