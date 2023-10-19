package com.kernel360.hackerthon.studyup.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigInteger;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberTechStack {
    @EmbeddedId
    private BigInteger memberTeckStackId;

    // 확장성을 고려한 설계

}


