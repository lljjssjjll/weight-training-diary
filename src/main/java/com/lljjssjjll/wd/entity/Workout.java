package com.lljjssjjll.wd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(
    uniqueConstraints = @UniqueConstraint(
        name = "unique_idx_user_id_exercise_id_date",
        columnNames = {"user_id", "exercise_id", "date"}
    )
)
@Getter
@Setter
public class Workout extends BaseEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutId;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private User user;

    @JoinColumn(name = "exercise_id", nullable = false)
    @ManyToOne
    private Exercise exercise;

    @Column(nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "workout")
    private List<WorkoutDetail> workoutDetailList;

    @Column(nullable = false)
    private Byte seq;
}
