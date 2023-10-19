package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.StudyReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyReviewRepository extends JpaRepository<StudyReview, Long> {
    List<StudyReview> findAll();

    Optional<StudyReview> findById(Long id);

    StudyReview save(StudyReview studyReview);

    void delete(StudyReview studyReview);
}
