package com.kernel360.hackerthon.studyup.member.entity;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigInteger;


@Embeddable
@Getter @Setter
public class MemberTechStackId implements Serializable {

    private Long memberId;
    private Long memberTechStackId;

}
