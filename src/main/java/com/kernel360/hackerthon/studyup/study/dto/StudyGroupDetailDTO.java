package com.kernel360.hackerthon.studyup.study.dto;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudyGroupDetailDTO {

    private Long studyId;
    private String studyTitle;
    private String summary;
    private String content;
    private short memberNum;
    private String category;
    private Integer views;
    private String studyStatus;
    private LocalDateTime deadline;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;
    private List<StudyMemberDTO> studyMembers;

    public StudyGroupDetailDTO(Study study, List<StudyMemberDTO> studyMemberDTOs) {
        this.studyId = study.getStudyId();
        this.studyTitle = study.getStudyTitle();
        this.summary = study.getSummary();
        this.content = study.getContent();
        this.memberNum = study.getMemberNum();
        this.category = study.getCategory();
        this.views = study.getViews();
        this.studyStatus = study.getStudyStatus();
        this.deadline = study.getDeadline();
        this.startDate = study.getStartDate();
        this.endDate = study.getEndDate();
        this.createdAt = study.getCreatedAt();
        this.modifiedAt = study.getModifiedAt();
        this.deletedAt = study.getDeletedAt();
        this.studyMembers = studyMemberDTOs;
    }
}
