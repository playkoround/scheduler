package com.sparta.scheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
public class Scheduler {
    private int id;
    @Setter
    private String title;
    @Setter
    private String detail;
    @Setter
    private int deadLine;
    private LocalDateTime dateCreated;
    @Setter
    private LocalDateTime dateModified;
    private boolean isPublic;
    private String humanName;
    private String pw;

}
