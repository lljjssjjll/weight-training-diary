package com.lljjssjjll.wtd.entity;

import com.lljjssjjll.wtd.entity.enums.Equipment;
import com.lljjssjjll.wtd.entity.enums.Target;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Exercise {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Target target;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Equipment equipment;
}
