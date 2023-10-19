package com.kernel360.hackerthon.studyup.member.entity;

import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
@Where(clause = "deleted_at IS NULL")
public class PeerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peerReviewId;

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
