package com.lljjssjjll.wd.entity;

import com.lljjssjjll.wd.entity.enums.Role;
import com.lljjssjjll.wd.entity.enums.Sex;
import com.lljjssjjll.wd.entity.enums.WeightUnit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(
    uniqueConstraints = {
        @UniqueConstraint(
            name = "unique_idx_email",
            columnNames = {"email"}
        ),
        @UniqueConstraint(
            name = "unique_idx_nickname",
            columnNames = {"nickname"}
        )
    }
)
@Getter
@Setter
public class User extends BaseEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column
    private LocalDate birthdate;

    @Column
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WeightUnit weightUnit;

    @OneToMany(mappedBy = "user")
    private List<Workout> workoutList;
}