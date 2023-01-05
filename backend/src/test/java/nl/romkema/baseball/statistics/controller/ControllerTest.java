package nl.romkema.baseball.statistics.controller;

import nl.romkema.baseball.statistics.service.PlayerService;
import nl.romkema.baseball.statistics.service.TeamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

    @Mock
    TeamService teamService;

    @Mock
    PlayerService playerService;

    @Test
    public void testCreateTeam() {
//        Team expectedTeam = new Team();
//        expectedTeam.setTeamName("TeamX");
//
//        doNothing().when(teamService).createNewTeam(any(String.class));
//        when(teamService.findTeam(any(String.class))).thenReturn(expectedTeam);
//
//        Controller controller = new Controller(teamService, playerService);
//
//        ResponseEntity<Team> team = controller.createTeam(expectedTeam.getTeamName());
//
//        assertNotNull(team);
//        Assert.assertEquals(expectedTeam.getTeamName(), team.getBody().getTeamName());
    }

    @Test
    public void testFindTeam() {
//        Team expectedTeam = new Team();
//        expectedTeam.setTeamName("TeamX");
//
//        when(teamService.findTeam(any(String.class))).thenReturn(expectedTeam);
//
//        Controller controller = new Controller(teamService, playerService);
//        ResponseEntity<Team> team = controller.findTeam(expectedTeam.getTeamName());
//
//        assertNotNull(team);
//        Assert.assertEquals(expectedTeam.getTeamName(), team.getBody().getTeamName());
    }

    @Test
    public void testUpdateTeam() {
//        TeamUpdate requestTeam = new TeamUpdate();
//        requestTeam.setId(23L);
//        requestTeam.setOldTeamName("TeamX");
//        requestTeam.setNewTeamName("TeamY");
//
//        Team expectedTeam = new Team();
//        expectedTeam.setId(requestTeam.getId());
//        expectedTeam.setTeamName(requestTeam.getOldTeamName());
//
//        when(teamService.findTeam(any(String.class))).thenReturn(expectedTeam);
//
//        expectedTeam.setTeamName(requestTeam.getNewTeamName());
//
//        Controller controller = new Controller(teamService, playerService);

//        ResponseEntity<Team> team = controller.updateTeam(requestTeam);

//        assertNotNull(team);
//        Assert.assertEquals(requestTeam.getNewTeamName(), team.getBody().getTeamName());
    }

    @Test
    public void testCreatePlayer() {
//        Player expectedPlayer = new Player();
//        expectedPlayer.setFirstName("Chris");
//        expectedPlayer.setLastName("Romkema");
//        expectedPlayer.setBirthDate("1984-05-28");
//        expectedPlayer.setPlayerNumber("555");
//
//        when(playerService.createNewPlayer(any(Player.class))).thenReturn(expectedPlayer);
//
//        Controller controller = new Controller(teamService, playerService);
//
//        ResponseEntity<Player> player = controller.createPlayer(expectedPlayer);
//
//        assertNotNull(player);
//        assertNotNull(player.getBody());
//        Assert.assertEquals(expectedPlayer.getFirstName(), player.getBody().getFirstName());
//        Assert.assertEquals(expectedPlayer.getLastName(), player.getBody().getLastName());
//        Assert.assertEquals(expectedPlayer.getBirthDate(), player.getBody().getBirthDate());
//        Assert.assertEquals(expectedPlayer.getPlayerNumber(), player.getBody().getPlayerNumber());
    }

//    @Test
//    public void testFindTeam() {
//        Team expectedTeam = new Team();
//        expectedTeam.setTeamName("TeamX");
//
//        when(teamService.findTeam(any(String.class))).thenReturn(expectedTeam);
//
//        Controller controller = new Controller(teamService, playerService);
//        ResponseEntity<Team> team = controller.findTeam(expectedTeam.getTeamName());
//
//        assertNotNull(team);
//        Assert.assertEquals(expectedTeam.getTeamName(), team.getBody().getTeamName());
//    }
//
//    @Test
//    public void testUpdateTeam() {
//        TeamUpdate requestTeam = new TeamUpdate();
//        requestTeam.setId(23L);
//        requestTeam.setOldTeamName("TeamX");
//        requestTeam.setNewTeamName("TeamY");
//
//        Team expectedTeam = new Team();
//        expectedTeam.setId(requestTeam.getId());
//        expectedTeam.setTeamName(requestTeam.getOldTeamName());
//
//        when(teamService.findTeam(any(String.class))).thenReturn(expectedTeam);
//
//        expectedTeam.setTeamName(requestTeam.getNewTeamName());
//
//        Controller controller = new Controller(teamService, playerService);
//
//        ResponseEntity<Team> team = controller.updateTeam(requestTeam);
//
//        assertNotNull(team);
//        Assert.assertEquals(requestTeam.getNewTeamName(), team.getBody().getTeamName());
//    }
}
