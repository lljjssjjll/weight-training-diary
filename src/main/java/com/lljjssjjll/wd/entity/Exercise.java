package com.lljjssjjll.wd.entity;

import com.lljjssjjll.wd.entity.enums.Equipment;
import com.lljjssjjll.wd.entity.enums.Target;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Exercise extends BaseEntity {
    // 종목 아이디
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;

    // 이름
    @Column(nullable = false, length = 50)
    private String name;

    // 부위
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Target target;

    // 기구
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Equipment equipment;

    // 무게 사용 여부
    @Column(nullable = false)
    private Boolean useWeight;

    // 지속 시간 사용 여부
    @Column(nullable = false)
    private Boolean useDuration;

    // 단 사용 여부
    @Column(nullable = false)
    private Boolean useDan;

    // 횟수 사용 여부
    @Column(nullable = false)
    private Boolean useReps;
}
