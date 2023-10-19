package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface TechStackRepository extends JpaRepository<TechStack, BigInteger> {
    List<TechStack> findAll();

    Optional<TechStack> findById(BigInteger id);

    TechStack save(TechStack techStack);

    void delete(TechStack techStack);
}
