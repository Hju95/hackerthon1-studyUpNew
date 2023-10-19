package com.kernel360.hackerthon.studyup.study.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;


@Embeddable  // @Embeddable 어노테이션 추가
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class StudyMemberId implements Serializable {

    private Long studyId;
    private Long memberId;

    // equals()와 hashCode() 메서드 오버라이드
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyMemberId that = (StudyMemberId) o;
        return Objects.equals(studyId, that.studyId) &&
                Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studyId, memberId);
    }
}
