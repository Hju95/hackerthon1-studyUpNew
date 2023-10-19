package com.kernel360.hackerthon.studyup.member.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigInteger;


@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class StudyTechStackId implements Serializable {
    @Column(name = "study_id")
    private Long studyId;

    @Column(name = "tech_stack_id")
    private Long techStackId;
}