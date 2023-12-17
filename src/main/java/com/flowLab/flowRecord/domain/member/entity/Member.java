package com.flowLab.flowRecord.domain.member.entity;

import com.flowLab.flowRecord.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
