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
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Target target;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Equipment equipment;

    @Column(nullable = false)
    private Boolean useWeight;

    @Column(nullable = false)
    private Boolean useDuration;

    @Column(nullable = false)
    private Boolean useReps;
}
