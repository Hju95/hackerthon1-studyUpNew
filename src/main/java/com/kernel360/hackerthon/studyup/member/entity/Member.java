package com.kernel360.hackerthon.studyup.member.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(length = 20)
    private String phoneNumber;

    private Character gender;

    @Column(nullable = false, length = 50)
    private String password;

    private String introduction;

    private Short profession;

    private Integer experienceYear;

    @CreationTimestamp
    private LocalDateTime registrationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date withdrawalDate;

    @Column(length = 255)
    private String socialId;

    @Column(length = 50)
    private String socialPlatform;
}
