package com.kernel360.hackerthon.studyup.member.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberTechStackId implements Serializable {

    private BigInteger studyId;
    private BigInteger stackId;
}
