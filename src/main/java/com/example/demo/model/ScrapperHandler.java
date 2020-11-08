package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScrapperHandler {

    private String name;
    private StatusEnum status;
    private String lastRun;
    private String restartHandler;

    public ScrapperHandler(String name, StatusEnum status, String lastRun, String restartHandler) {
        this.name = name;
        this.status = status;
        this.lastRun = lastRun;
        this.restartHandler = restartHandler;
    }

    public ScrapperHandler() {
    }
}


