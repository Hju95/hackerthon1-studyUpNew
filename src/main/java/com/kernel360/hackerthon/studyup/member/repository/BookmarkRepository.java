package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, BigInteger> {
    List<Bookmark> findAll();

    Optional<Bookmark> findById(BigInteger id);

    Bookmark save(Bookmark bookmark);

    void delete(Bookmark bookmark);
}
