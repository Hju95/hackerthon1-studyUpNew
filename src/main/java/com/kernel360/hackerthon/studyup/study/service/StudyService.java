package com.kernel360.hackerthon.studyup.study.service;

import com.kernel360.hackerthon.studyup.member.entity.Bookmark;
import com.kernel360.hackerthon.studyup.study.dto.StudyDTO;
import com.kernel360.hackerthon.studyup.study.dto.StudyGroupDetailDTO;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import com.kernel360.hackerthon.studyup.study.entity.StudySchedule;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface StudyService {
    /**
     * 스터디 그룹 리스트 조회
     * @return
     */
    List<Study> getAllStudies();

    /**
     * 스터디 그룹 상세 조회
     * @param studyId
     * @return
     * DTO 객체 새로 생성 ( 스터디 정보 + 스터디에 속한 멤버 + 스터디 리뷰 + 기술 스택 + 스택 별점)
     */
    StudyGroupDetailDTO getStudyById(BigInteger studyId);

    /**
     * 스터디 그룹 개설
     */
    Study createStudy(Study study);

    /**
     * 스터디 참여
     */
    boolean joinStudy(Long studyId); // 추후에 멤버 id 받아오는 로직 추가

    /**
     * 스터디 그룹 수정
     * @param studyId, studyDTO
     * @return
     */
    int updateStudy(Long studyId, StudyDTO studyDTO);


    /**
     * 스터디 그룹 삭제
     * @param studyId
     */
    int deleteStudy(Long studyId);


    /**
     * 스터디 그룹 모든 멤버 조회
     * @return
     */
    List<StudyMember> getAllStudyMembers();


    /**
     * 스터디 모든 일정 리스트
     * @return
     */
    List<StudySchedule> getAllStudySchedules();


    /**
     * 스터디 일정 상세 조회
     * @param scheduleId
     * @return
     */
    StudySchedule getStudySchedule(int scheduleId);


    /**
     * 스터디 제목으로 검색
     * @param studyTitle
     * @return
     */
    Study getStudyScheduleByStudyId(int studyTitle);


    /**
     * 스터디 일정 등록
     * @param studySchedule
     * @return
     */
    int createStudySchedule(StudySchedule studySchedule);


    /**
     * 스터디 일정 수정
     * @param studySchedule
     * @return
     */
    int updateStudySchedule(StudySchedule studySchedule);


    /**
     * 스터디 이름과 날짜로 일정 삭제
     * @param studyId
     * @param date
     * @return
     */
    int deleteStudyScheduleByStudyDate(int studyId, Date date);

    /**
     * 찜하기 (찜 생성)
     * @param bookmark
     * @return
     */
    int createBookmark(Bookmark bookmark);

    /**
     * 찜한 스터디 조회
     * @param bookmarkId
     * @return
     */
    List<Study> getStudyByBookmarkId(int bookmarkId);

    /**
     * 찜 수정
     * @param bookmarkId
     * @return
     */
    int updateBookmarkByBookmarkId(int bookmarkId);



}
