package com.kernel360.hackerthon.studyup.member.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigInteger;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class StudyTechStack {
    @EmbeddedId
    private StudyTechStackId studyTechStackId;

    // 확장성을 고려한 설계
}
