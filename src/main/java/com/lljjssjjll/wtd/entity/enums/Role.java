package com.lljjssjjll.wtd.entity.enums;

public enum Role {
    NORMAL("일반회원"),
    ADMIN("관리자");

    private final String comment;

    Role(String comment) {
        this.comment = comment;
    }
}
