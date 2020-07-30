package com.lljjssjjll.wtd.entity.enums;

public enum Target {
    TRAPEZIUS("승모근"),
    BACK("등"),
    WAIST("허리"),
    DELTOID("삼각근"),
    CHEST("가슴"),
    TRICEPS("삼두근"),
    BICEPS("이두근"),
    ABS("복부"),
    GLUTES("엉덩이"),
    LOWER_BODY("하체"),
    CALF("종아리"),
    ALL("전신"),
    STRETCHING("스트레칭");

    private final String comment;

    Target(String comment) {
        this.comment = comment;
    }
}
