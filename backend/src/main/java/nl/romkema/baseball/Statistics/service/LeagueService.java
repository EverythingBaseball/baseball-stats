package nl.romkema.baseball.Statistics.service;

import nl.romkema.baseball.Statistics.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

//    @Autowired
    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public void createNewLeague() {}

    public void updateLeague(String leagueId) {}
}
