package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.PeerReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface PeerReviewRepository extends JpaRepository<PeerReview, Long> {
    List<PeerReview> findAll();

    Optional<PeerReview> findById(Long id);

    PeerReview save(PeerReview peerReview);

    void delete(PeerReview peerReview);
}
