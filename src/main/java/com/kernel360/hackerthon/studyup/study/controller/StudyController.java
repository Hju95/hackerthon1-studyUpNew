package com.kernel360.hackerthon.studyup.study.controller;

import com.kernel360.hackerthon.studyup.study.dto.StudyGroupDetailDTO;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigInteger;
import java.util.List;

@RestController // redirect 나오면 Controller로 수정
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyController {

    private final StudyService studyService;

    /**
     * (*)스터디 그룹 리스트 조회
     * @return
     */
    @GetMapping("/list")
    public ModelAndView getAllStudies() {
        List<Study> studyList = studyService.getAllStudies();

        ModelAndView view = new ModelAndView();
        // "study/studyList"로 페이지구조 변경 예정
        view.setViewName("study/studyList");
        view.addObject("studyList", studyList);

        return view;
    }

    /**
     * (*)스터디 그룹 상세 조회
     */
    @GetMapping("/{study-id}")
    public ModelAndView getStudy(@PathVariable("study-id") Long studyId) {
        StudyGroupDetailDTO studyGroupDetailDTO = studyService.getStudyById(studyId);

        ModelAndView view = new ModelAndView();
        // "study/studyList"로 페이지구조 변경 예정
        view.setViewName("study/studyDetail");
        view.addObject("studyGroupDetailDTO", studyGroupDetailDTO);

        return view;
    }

    /**
     * (*)스터디 그룹 개설
     * : 스터디 개설하기 버튼을 눌렀을 때 스터디 개설폼으로 이동
     */
    @GetMapping
    public String createStudy() {
        return "study/newStudyForm";
    }

    /**
     * (*)스터디 그룹 개설
     * : 스터디 그룹 개설 폼에서 작성하기 눌렀을 때 스터디 그룹 개설
     * : 스터디 상세 페이지로 이동
     */
    @PostMapping
    public ModelAndView createStudy(@RequestBody Study study) {
        Study createdStudy = studyService.createStudy(study);

        if (createdStudy != null) {
            // 스터디 그룹 개설 성공시 스터디 그룹 상세 페이지로 이동
            return new ModelAndView("redirect:/study/" + createdStudy.getStudyId());
        } else {
            // 실패시 스터디 목록 페이지 이동
            return new ModelAndView("redirect:/study/list");
        }
    }

    /**
     * (**)스터디 참여(미완)
     * : studyDetail.jsp(스터디 상세 페이지)에서 참여하기 버튼을 누르면
     *   로그인 기능이 구현되어서 사용자의 정보를 세션에서 읽어올 수 있다면 mypage에
     *   내가 참여중인 스터디목록에 스터디가 추가될 예정
     */
    @PostMapping("/{study-id}/join")
    // 추후에 매개변수로 세션 받아와야함
    // 알람을 표시하기 위해 RedirectAttributes를 사용하여 리다이렉트시에도 데이터를 유지
    // 일회성의 데이터를 추가하고 싶으면 addFlashAttribute() 메서드를 사용
    public String joinStudy(@PathVariable("study-id") Long studyId, RedirectAttributes redirectAttributes) {
        // 세션에서 현재 사용자의 ID를 가져오는 로직

        if (studyService.joinStudy(studyId)) {
            // 스터디 참여하기 성공하면 mypage로 이동
            return "redirect:/mypage";
        } else {
            // 스터디 참여하기 실패하면 실패 알람을 띄우고 스터디상세페이지 이동
            redirectAttributes.addFlashAttribute("errorMessage", "스터디 참여에 실패했습니다.");
            return "redirect:/study/" + studyId;
        }
    }




//    /**
//     * (*)스터디 그룹 수정
//     */
//    public StudyDTO updateStudy(@PathVariable Long studyId, @RequestBody StudyDTO studyDTO) {
//        int result = studyService.updateStudy(studyId, studyDTO);
//
//    /**
//     * (*)스터디 그룹 삭제
//     */
//    @DeleteMapping("/{study-id}")
//
//    /**
//     * 스터디 그룹 멤버 조회
//     */
//    @GetMapping("/members")
//
//    /**
//     * (*)스터디 검색
//     */
//    @GetMapping("/search")
//
//    /**
//     * 스터디 일정 리스트
//     */
//    @GetMapping("/schedules")
//
//    /**
//     * 스터디 일정 상세조회
//     */
//    @GetMapping("/schedule")
//
//
//    /**
//     * 스터디 일정 등록
//     */
//    @PostMapping("/schedule")
//
//    /**
//     * 스터디 일정 수정
//     */
//    @PatchMapping("/schedule")
//
//    /**
//     * 스터디 일정 삭제
//     */
//    @DeleteMapping("/schedule")
//
//    /**
//     * (선택)찜하기(찜 생성)
//     */
//
//    /**
//     * (선택)찜한 스터디 조회
//     */
//
//    /**
//     * (선택)찜 수정
//     */

}
