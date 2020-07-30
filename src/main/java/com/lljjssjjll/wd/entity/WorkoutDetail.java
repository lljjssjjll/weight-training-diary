package com.lljjssjjll.wd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class WorkoutDetail extends BaseEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutDetailId;

    @JoinColumn(name = "workout_id", nullable = false)
    @ManyToOne
    private Workout workout;

    @Column
    private Byte set;

    @Column
    private Short weightByKg;

    @Column
    private Short weightByLb;

    @Column
    private Short duration;

    @Column
    private Short reps;

    @Column
    private Short recoveryTime;

    @Column(nullable = false)
    private Boolean complete;
}
