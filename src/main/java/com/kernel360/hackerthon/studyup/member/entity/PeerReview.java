package com.kernel360.hackerthon.studyup.member.entity;

import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger peerReviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_member_id", referencedColumnName = "studyMemberId", nullable = false)
    private StudyMember peer;

    @Column(nullable = false)
    private String peerReviewComment;

    @Column(nullable = false)
    private Short peerReviewScore;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
}
