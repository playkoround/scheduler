package com.sparta.scheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Scheduler {
    private int id;
    private String title;
    private String detail;
    private int deadLine;
    private int dateCreated;
    private int dateModified;
    private boolean isPublic;
    private String humanName;
    private String pw;

public Scheduler(String humanName, String pw, String title, String detail, int deadLine, boolean isPublic) {
    this.title = title;
    this.detail = detail;
    this.humanName = humanName;
    this.pw = pw;
    this.deadLine = deadLine;
    this.isPublic = isPublic;

}
}
