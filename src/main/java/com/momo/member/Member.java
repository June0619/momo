package com.momo.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USER_ID", length = 20, nullable = false)
    private String userId;

    @Column(name = "PASSWORD", length = 30, nullable = false)
    private String password;

    @Column(name = "EMAIL", length = 50, nullable = false)
    private String email;
}
