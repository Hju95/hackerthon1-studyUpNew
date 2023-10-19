package com.kernel360.hackerthon.studyup.member.controller;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequiredArgsConstructor
public class AuthentificationController {

    // AuthentificationServiceImpl 구현하면 에러 사라질 것
    @Autowired
    private final AuthenticationService authenticationService;

    /**
     * 회원가입
     */
    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // 회원가입 페이지
    }

    @PostMapping("/signup")
    public String signup(Member member, Model model) {
        try {
            authenticationService.signup(member);
            return "redirect:/login";  // 회원가입에 성공시, 로그인 페이지도 이동
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "signup";  // 회원가입에 실패시, 회원가입 페이지에 머무름
        }
    }

    /**
     * 로그인
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // 로그인 페이지
    }

    @PostMapping("/login")
    public String login(Member member, Model model) {
        try {
            authenticationService.login(member);
            return "redirect:/";  // 로그인에 성공시, 홈페이지 이동
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "login";  // 로그인에 실패시, 로그인 페이지에 머무름
        }
    }

    /**
     * (미완성) 로그아웃
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션을 사용할 거면, 모든 세션의 정보를 삭제하는 아래와 같은 코드를 사용
        //session.invalidate();
        return "redirect:/";
    }


}
