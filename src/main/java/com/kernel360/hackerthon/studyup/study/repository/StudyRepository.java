package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyRepository extends JpaRepository<Study, BigInteger> {
    List<Study> findAll();

    Optional<Study> findById(BigInteger id);

    Study save(Study study);

    void delete(Study study);
}
