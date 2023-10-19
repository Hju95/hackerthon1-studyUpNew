package com.kernel360.hackerthon.studyup.study.entity;

import lombok.*;
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
public class StudyReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyReviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_member_id", nullable = false)
    private StudyMember studyMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id", nullable = false)
    private Study study;

    @Column(nullable = false)
    private String reviewComment; // 필드 이름 변경

    @Column(nullable = false)
    private Short studyRating; // 데이터 타입을 short에서 Short로 변경

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
}
