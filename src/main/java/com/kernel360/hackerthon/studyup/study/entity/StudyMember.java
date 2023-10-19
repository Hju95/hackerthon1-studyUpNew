package com.kernel360.hackerthon.studyup.study.entity;  // 패키지 이름은 예시입니다.

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.study.entity.MemberType;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "study_member")  // 테이블 이름 지정 (필요에 따라 변경 가능)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class StudyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyMemberId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id", nullable = false)
    private Study study;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)  // Enum 타입 사용
    @Column(nullable = false)
    private MemberType memberType;  // Enum 타입으로 변경

    @Column(nullable = false)
    private LocalDateTime studyJoinDate;

    private LocalDateTime studyWithdrawalDate;  // Date에서 LocalDateTime으로 변경
}

// 추가: MemberType Enum

