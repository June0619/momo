package com.momo.domain.member;

import com.momo.domain.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(columnNames = "EMAIL")}, indexes = {@Index(columnList = "EMAIL")})
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "EMAIL", length = 50, nullable = false)
    private String email;

    @Column(name = "PASSWORD", length = 30, nullable = false)
    private String password;

}