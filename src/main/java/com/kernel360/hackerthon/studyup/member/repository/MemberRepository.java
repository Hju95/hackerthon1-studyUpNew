package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.study.dto.StudyMemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, BigInteger> {
    Optional<Member> findById(BigInteger id);

    //List<Member> findByIdIn(List<BigInteger> memberIds);

    @Query("SELECT new com.kernel360.hackerthon.studyup.member.dto.MemberDTO(m.id, m.name, m.email) FROM Member m WHERE m.id IN :memberIds")
    List<StudyMemberDTO> findDTOByMemberIds(@Param("memberIds") List<BigInteger> memberIds);


    Member save(Member member);

    Member findByNickName(String name);
}