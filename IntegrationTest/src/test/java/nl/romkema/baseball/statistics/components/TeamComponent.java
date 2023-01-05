package nl.romkema.baseball.statistics.components;

import io.restassured.response.Response;
//import nl.romkema.baseball.Statistics.domain.Team;

import static io.restassured.RestAssured.given;

public class TeamComponent extends ComponentParent {

    private final static String teamUrl = host + "team/";

    private TeamComponent() {
        // private constructor to prevent instances to be created;
    }

    public static Response getTeamResponse(String teamName) {
        return getTeamByName(teamName);
    }

//    public static Team getTeam(String teamName) {
//        return getTeamByName(teamName).getBody().as(Team.class);
//    }

    public static Response createTeam(String teamName) {
        return createTeamWithName(teamName);
    }

    private static Response getTeamByName(String teamName) {
        return given()
                    .header("charset","utf-8")
                .when()
                    .get(teamUrl + teamName);
    }

    private static Response createTeamWithName(String teamName) {
        return given()
                    .header("charset","utf-8")
                .when()
                    .post(teamUrl + teamName);
    }
}
