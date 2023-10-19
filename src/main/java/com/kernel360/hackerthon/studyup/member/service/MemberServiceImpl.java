package com.kernel360.hackerthon.studyup.member.service;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.entity.PeerReview;
import com.kernel360.hackerthon.studyup.member.repository.MemberRepository;
import com.kernel360.hackerthon.studyup.study.entity.StudyReview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

//    public MemberServiceImpl(MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }
    // 종민
    @Override
    public Member getMemberByNickname(String nickname) {
        memberRepository.findByNickName(nickname);
        return null;
    }


    @Override
    public int updateProfile(int memberId) {
        return 0;
    }

    //
    @Override
    public StudyReview createStudyReview(StudyReview studyReview) {
        return null;
    }

    //
    @Override
    public List<StudyReview> getAllStudyReviews() {
        return null;
    }


    @Override
    public List<StudyReview> getParticipatingStudyReview(int memberId) {
        return null;
    }

    @Override
    public int updateStudyReview(int reviewId) {
        return 0;
    }

    @Override
    public int deleteStudyReview(int reviewId) {
        return 0;
    }

    @Override
    public PeerReview createPeerReview(PeerReview peerReview) {
        return null;
    }

    @Override
    public List<PeerReview> getPeerReviews() {
        return null;
    }

    @Override
    public List<PeerReview> getPeerReviews(int memberId) {
        return null;
    }

    @Override
    public int updatePeerReview(int peerId) {
        return 0;
    }

    @Override
    public int deletePeerReview(int peerId) {
        return 0;
    }

    // 1
}
