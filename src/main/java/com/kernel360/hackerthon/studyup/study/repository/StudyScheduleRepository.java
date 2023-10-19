package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.StudySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyScheduleRepository extends JpaRepository<StudySchedule, BigInteger> {
    List<StudySchedule> findAll();

    Optional<StudySchedule> findById(BigInteger id);

    StudySchedule save(StudySchedule studySchedule);

    void delete(StudySchedule studySchedule);
}
