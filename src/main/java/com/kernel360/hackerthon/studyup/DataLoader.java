package com.kernel360.hackerthon.studyup;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.entity.TechStack;
import com.kernel360.hackerthon.studyup.member.repository.MemberRepository;
import com.kernel360.hackerthon.studyup.member.repository.TechStackRepository;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import com.kernel360.hackerthon.studyup.study.repository.StudyMemberRepository;
import com.kernel360.hackerthon.studyup.study.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Component
public class DataLoader {

    // member 의존성
//    @Autowired
//    private BookmarkRepository bookmarkRepository;
    @Autowired
    private MemberRepository memberRepository;
//    @Autowired
//    private PeerReviewRepository peerReviewRepository;
    @Autowired
    private TechStackRepository techStackRepository;


    // study 의존성
    @Autowired
    private StudyMemberRepository studyMemberRepository;
    @Autowired
    private StudyRepository studyRepository;
//    @Autowired
//    private StudyReviewRepository studyReviewRepository;
//    @Autowired
//    private StudyScheduleRepository studyScheduleRepository;


    public void loadInitialData() throws InterruptedException {
        // member
        //createBookmarks();
        createMembers();
        //createPeerReviews();
        createTechStacks();

        // study
        createStudyMembers();
        createStudies();
//        createStudyReviews();
//        createStudySchedulRepositories();
    }

    // member

    private void createMembers() {
        Member alice = Member.builder()
                .email("alice@example.com")
                .name("Alice")
                .nickname("alice123")
                .password("password")
                .registrationDate(LocalDateTime.now())
                .build();

        memberRepository.save(alice);

        Member bob = Member.builder()
                .email("bob@example.com")
                .name("Bob")
                .nickname("bob123")
                .password("password")
                .registrationDate(LocalDateTime.now())
                .build();

        memberRepository.save(bob);
    }

//    private void createPeerReviews() {
//        // 데이터베이스에서 Member 인스턴스 검색 (예: ID로 검색)
//        Member member = memberRepository.findById(BigInteger.ONE).orElse(null);
//
//        // 데이터베이스에서 StudyMember 인스턴스 검색 (예: ID로 검색)
//        StudyMember peer = studyMemberRepository.findById(new StudyMemberId(BigInteger.ONE, BigInteger.ONE)).orElse(null);
//
//        if(member != null && peer != null) {
//            // PeerReview 인스턴스 생성 및 필드 설정
//            PeerReview peerReview = new PeerReview();
//            peerReview.setMember(member);
//            peerReview.setPeer(peer);
//            peerReview.setPeerReviewComment("Excellent teamwork!");
//            peerReview.setPeerReviewScore((short) 5); // 점수 설정
//            peerReview.setCreatedAt(new Timestamp(new Date().getTime()));
//
//            // PeerReview 인스턴스 데이터베이스에 저장
//            peerReviewRepository.save(peerReview);
//
//            System.out.println("Peer review created: " + peerReview.getPeerReviewComment());
//        } else {
//            System.out.println("Member or StudyMember not found.");
//        }
//    }

    private void createTechStacks() {
        TechStack java = TechStack.builder()
                .TechName("Java")
                .build();

        techStackRepository.save(java);

        TechStack python = TechStack.builder()
                .TechName("Python")
                .build();

        techStackRepository.save(python);

        TechStack javascript = TechStack.builder()
                .TechName("JavaScript")
                .build();

        techStackRepository.save(javascript);
    }


    // study
    private void createStudies() {
        Study study = new Study();
        study.setStudyTitle("Java Study Group");
        study.setSummary("Group to study Java together");
        study.setContent("We focus on Java core and advance topics");
        study.setCreatedAt(LocalDateTime.now());
        study.setDeadline(LocalDateTime.now().plusMonths(1));
        studyRepository.save(study);
    }

    private void createStudyMembers() {
        Member member = memberRepository.findById(BigInteger.valueOf(1L))
                .orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));

        Study study = studyRepository.findById(BigInteger.valueOf(1L))
                .orElseThrow(() -> new RuntimeException("스터디를 찾을 수 없습니다."));

        StudyMember studyMember = new StudyMember();
        studyMember.setStudy(study);
        studyMember.setMember(member);
        studyMember.setMemberType('A');
        studyMember.setStudyJoinDate(LocalDateTime.now());

        studyMemberRepository.save(studyMember);
    }





}
