package com.kernel360.hackerthon.studyup.member.service;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.entity.PeerReview;
import com.kernel360.hackerthon.studyup.study.entity.StudyReview;

import java.util.List;

public interface MemberService {

    /**
     * 회원식별번호로 프로필 조회
     * @param nickname
     * @return
     */
    Member getMemberByNickname(String nickname);



    /**
     * 회원식별번호로 프로필 수정
     * @param memberId
     * @return
     */
    int updateProfile(int memberId);


    /**
     * 참여중인 스터디 리뷰 등록
     * @param studyReview
     * @return
     */
    StudyReview createStudyReview(StudyReview studyReview);


    /**
     * 참여중인 스터디 리뷰 리스트 조회
     * @return
     */
    List<StudyReview> getAllStudyReviews();


    /**
     * 회원식별번호로 참여중인 스터디 리뷰 상세 조회
     * @param memberId
     * @return
     */
    List<StudyReview> getParticipatingStudyReview(int memberId);


    /**
     * 스터디식별번호로 참여중인 스터디 리뷰 수정
     * @param reviewId
     * @return
     */
    int updateStudyReview(int reviewId);


    /**
     * 참여중인 스터디 리뷰 삭제
     * @param reviewId
     * @return
     */
    int deleteStudyReview(int reviewId);


    /**
     * 동료 평가 등록
     * @param peerReview
     * @return
     */
    PeerReview createPeerReview(PeerReview peerReview);


    /**
     * 모든 동료 평가 조회
     * @return
     */
    List<PeerReview> getPeerReviews();


    /**
     * 회원식별번호로 동료 평가 리스트 조회
     * @param memberId
     * @return
     */
    List<PeerReview> getPeerReviews(int memberId);


    /**
     * 동료 식별번호로 동료 평가 수정
     * @param peerId
     * @return
     */
    int updatePeerReview(int peerId);

    /**
     * 동료 식별번호로 동료 평가 삭제
     * @param peerId
     * @return
     */
    int deletePeerReview(int peerId);




}
