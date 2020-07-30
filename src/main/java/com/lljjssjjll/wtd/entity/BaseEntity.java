package com.lljjssjjll.wtd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updateDate;
    @Column
    private String createUserId;
    @Column
    private String updateUserId;
}
