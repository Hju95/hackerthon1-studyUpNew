package com.kernel360.hackerthon.studyup;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.entity.TechStack;
import com.kernel360.hackerthon.studyup.member.repository.MemberRepository;
import com.kernel360.hackerthon.studyup.member.repository.TechStackRepository;
import com.kernel360.hackerthon.studyup.study.entity.MemberType;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import com.kernel360.hackerthon.studyup.study.repository.StudyMemberRepository;
import com.kernel360.hackerthon.studyup.study.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class DataLoader {
    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

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
    @Enumerated(EnumType.STRING)  // Enum 타입을 문자열로 저장
    private MemberType memberType;  // MemberType enum 필드 추가


    public void loadInitialData() throws InterruptedException {
        // member
        //createBookmarks();
        createMembers();
        //createPeerReviews();
        createTechStacks();

        // study
//        createStudyMembers();
        createStudies();
//        createStudyReviews();
//        createStudySchedulRepositories();
    }

    // member

    private void createMembers() {
        try {
            Member alice = Member.builder()
                    .email("alice@example.com")
                    .name("Alice")
                    .nickname("alice123")
                    .password("password")
                    .registrationDate(LocalDateTime.now())
                    .build();

            memberRepository.save(alice);
            logger.info("Member Alice saved.");

            Member bob = Member.builder()
                    .email("bob@example.com")
                    .name("Bob")
                    .nickname("bob123")
                    .password("password")
                    .registrationDate(LocalDateTime.now())
                    .build();

            memberRepository.save(bob);
            logger.info("Member Bob saved.");
        } catch (Exception e) {
            logger.error("Error occurred while creating members.", e);
        }
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
                .techName("Java")
                .build();

        techStackRepository.save(java);

        TechStack python = TechStack.builder()
                .techName("Python")
                .build();

        techStackRepository.save(python);

        TechStack javascript = TechStack.builder()
                .techName("JavaScript")
                .build();

        techStackRepository.save(javascript);
    }


    // study
    private void createStudies() {
        // 첫 번째 스터디 인스턴스 생성
        Study javaStudy = Study.builder()
                .studyTitle("Java Study Group")
                .summary("A group dedicated to learning Java programming")
                .content("We focus on both core and advanced Java topics.")
                .memberNum((short) 20)
                .category("Programming")
                .views(0)
                .studyStatus("recruiting")
                .deadline(LocalDateTime.now().plusWeeks(2))
                .startDate(LocalDateTime.now().plusDays(3))
                .endDate(LocalDateTime.now().plusMonths(6))
                .createdAt(LocalDateTime.now())
                .build();

        // 두 번째 스터디 인스턴스 생성
        Study pythonStudy = Study.builder()
                .studyTitle("Python for Data Science")
                .summary("Learn Python programming and data analysis techniques")
                .content("Focus on libraries like NumPy, Pandas, and Matplotlib")
                .memberNum((short) 25)
                .category("Data Science")
                .views(0)
                .studyStatus("recruiting")
                .deadline(LocalDateTime.now().plusWeeks(4))
                .startDate(LocalDateTime.now().plusDays(10))
                .endDate(LocalDateTime.now().plusMonths(5))
                .createdAt(LocalDateTime.now())
                .build();

        // 스터디 인스턴스를 저장소에 저장
        studyRepository.save(javaStudy);
        studyRepository.save(pythonStudy);

        System.out.println("Studies have been created and saved to the database.");
    }


//    private void createStudyMembers() {
//        Member member = memberRepository.findById(1L)
//                .orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));
//
//        Study study = studyRepository.findById(1L)
//                .orElseThrow(() -> new RuntimeException("스터디를 찾을 수 없습니다."));
//
//        StudyMember studyMember = StudyMember.builder()
//                .study(study)
//                .member(member)
//                .memberType(MemberType.LEADER)
//                .studyJoinDate(LocalDateTime.now())
//                .build();
//
//        studyMemberRepository.save(studyMember);
//
//        System.out.println("Study member has been created and saved to the database.");
//    }






}
