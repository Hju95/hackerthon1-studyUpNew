package com.kernel360.hackerthon.studyup.study.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyId;

    @Column(nullable = false, length = 200)
    private String studyTitle;

    @Column(length = 500)
    private String summary;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private short memberNum;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int views;  // Integer에서 int로 변경

    @Column(nullable = false)
    @ColumnDefault("'recruiting'")  // 따옴표 추가
    private String studyStatus;

    @Column(nullable = false)
    private LocalDateTime deadline;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt;  // Date에서 LocalDateTime으로 변경
}
