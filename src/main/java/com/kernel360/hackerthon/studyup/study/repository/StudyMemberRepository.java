package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyMemberRepository extends JpaRepository<StudyMember, Long> {
    List<StudyMember> findAll();

    List<Long> findStudyMembersByStudyMemberId(Long memberIds);

    Optional<StudyMember> findById(Long id);

    StudyMember save(StudyMember studyMember);

    void delete(StudyMember studyMember);
}
