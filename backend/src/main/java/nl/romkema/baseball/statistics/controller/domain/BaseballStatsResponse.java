package nl.romkema.baseball.statistics.controller.domain;

import lombok.Getter;

@Getter
public class BaseballStatsResponse extends Response {
    private String current_user_url;
    private String federations_url;

    public BaseballStatsResponse setCurrentUserUrl(String current_user_url) {
        this.current_user_url = current_user_url;
        return this;
    }

    public BaseballStatsResponse setFederationsUrl(String federations_url) {
        this.federations_url = federations_url;
        return this;
    }
}
