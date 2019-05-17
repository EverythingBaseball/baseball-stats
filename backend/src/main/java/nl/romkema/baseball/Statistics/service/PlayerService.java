package nl.romkema.baseball.Statistics.service;

import lombok.extern.slf4j.Slf4j;
import nl.romkema.baseball.Statistics.controller.domain.PlayerUpdate;
import nl.romkema.baseball.Statistics.domain.Player;
import nl.romkema.baseball.Statistics.exception.PlayerNotFoundException;
import nl.romkema.baseball.Statistics.repository.PlayerRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createNewPlayer(Player player) {
        playerRepository.save(player);
        return playerRepository.findByPlayerNumber(player.getPlayerNumber());
    }

    public Player updatePlayer(PlayerUpdate playerUpdate) {
        Player foundPlayer = playerRepository.findByPlayerNumber(playerUpdate.getPlayerNumber());
        if (foundPlayer != null ) {
            if(foundPlayer.getFirstName().equalsIgnoreCase(playerUpdate.getFirstName())
                    && foundPlayer.getLastName().equalsIgnoreCase(playerUpdate.getLastName())
                    && foundPlayer.getBirthDate().equalsIgnoreCase(playerUpdate.getAge())
                    && foundPlayer.getPlayerNumber().equalsIgnoreCase(playerUpdate.getPlayerNumber())) {
                foundPlayer.setFirstName(playerUpdate.getNewFirstName());
                foundPlayer.setLastName(playerUpdate.getNewLastName());
                foundPlayer.setBirthDate(playerUpdate.getNewAge());
                foundPlayer.setPlayerNumber(playerUpdate.getNewPlayerNumber());
                playerRepository.save(foundPlayer);
                return foundPlayer;
            } else {
                PlayerNotFoundException playerNotFoundException = new PlayerNotFoundException("Found player has different information than supplied");
                log.error(playerNotFoundException.getMessage());
                throw playerNotFoundException;
            }
        } else {
            log.warn("Player not found. Creating new player");
            Player player = new Player();
            player.setFirstName(playerUpdate.getNewFirstName());
            player.setLastName(playerUpdate.getLastName());
            player.setBirthDate(playerUpdate.getAge());
            player.setPlayerNumber(playerUpdate.getNewPlayerNumber());
            playerRepository.save(player);
            return player;
        }
    }

    public Player find(String playerNumber) {
        Player foundPlayer = playerRepository.findByPlayerNumber(playerNumber);
        if(foundPlayer != null) {
            return foundPlayer;
        } else {
            throw new PlayerNotFoundException("No player found with Player-Number");
        }
    }

    public Player findByAny(Player player) {
        if(StringUtils.isNotEmpty(player.getPlayerNumber())) {
            Player byPlayerNumber = playerRepository.findByPlayerNumber(player.getPlayerNumber());
            if(byPlayerNumber != null) {
                return byPlayerNumber;
            }
        }
        if(StringUtils.isNotEmpty(player.getFirstName()) && StringUtils.isNotEmpty(player.getLastName())) {
            Player byFirstNameAndLastName = playerRepository.findByFirstNameAndLastName(player.getFirstName(), player.getLastName());
            if(byFirstNameAndLastName != null) {
                return byFirstNameAndLastName;
            }
        }
        return null;
    }
}
