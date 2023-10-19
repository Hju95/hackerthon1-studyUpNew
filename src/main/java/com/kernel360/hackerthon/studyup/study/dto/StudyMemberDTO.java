package com.kernel360.hackerthon.studyup.study.dto;

import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class StudyMemberDTO {
    private StudyDTO study;
    private String nickname;
    private LocalDateTime studyJoinDate;
    private Date studyWithdrawalDate;

    public StudyMemberDTO(StudyMember studyMember) {
        this.study = new StudyDTO(studyMember.getStudy());
        this.nickname = studyMember.getMember().getNickname();
        this.studyJoinDate = studyMember.getStudyJoinDate();
        this.studyWithdrawalDate = studyMember.getStudyWithdrawalDate();
    }
}
