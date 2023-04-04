package nl.romkema.baseball.statistics.controller.domain;

import lombok.Getter;

@Getter
public abstract class Response {
    private int id;
    private String url;

    public Response setId(int id) {
        this.id = id;
        return this;
    }

    public Response setUrl(String url) {
        this.url = url;
        return this;
    }
}
