package com.kernel360.hackerthon.studyup.study.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class StudySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id", nullable = false)
    private Study study;

    @Column(nullable = false)
    @NotNull // Validation 추가
    private LocalDate studyDate;

    @Column(nullable = false)
    @NotNull // Validation 추가
    private LocalTime startTime;

    @Column(nullable = false)
    @NotNull // Validation 추가
    private LocalTime endTime;

    @Column(nullable = false, length = 500)
    private String studyTask;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt; // @Temporal 어노테이션 제거 및 타입 변경
}
