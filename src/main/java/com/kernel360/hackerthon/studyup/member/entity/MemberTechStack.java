package com.kernel360.hackerthon.studyup.member.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigInteger;

@Entity
public class MemberTechStack {
    @EmbeddedId
    @Getter @Setter
    private MemberTechStackId memberTechStackId;

    // 확장성을 고려한 설계
}


