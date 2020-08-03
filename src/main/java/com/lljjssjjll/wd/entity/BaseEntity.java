package com.lljjssjjll.wd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    @Column(nullable = false)
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    @Column(nullable = false)
    private String createUserId;

    @Column
    private String updateUserId;

    @Column(nullable = false)
    private Boolean flag;
}
