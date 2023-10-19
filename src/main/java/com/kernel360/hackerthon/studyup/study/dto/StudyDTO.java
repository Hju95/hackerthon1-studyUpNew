package com.kernel360.hackerthon.studyup.study.dto;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class StudyDTO {
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
    private LocalDateTime  deletedAt;

    public StudyDTO(Study study) {
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
    }
}
