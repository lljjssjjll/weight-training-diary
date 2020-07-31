package com.lljjssjjll.wd.entity.enums;

public enum Equipment {
    BARBELL("바벨"),
    DUMBBELL("덤벨"),
    KETTLEBELL("케틀벨"),
    CABLE("케이블"),
    MACHINE("머신"),
    BOSU_BALL("보수볼"),
    GYM_BALL("짐볼"),
    BAND("밴드"),
    NONE("맨몸");

    private final String comment;

    Equipment(String comment) {
        this.comment = comment;
    }
}
