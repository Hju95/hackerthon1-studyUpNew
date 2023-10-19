//package com.kernel360.hackerthon.studyup.member.service;
//
//import com.kernel360.hackerthon.studyup.member.entity.Member;
//import com.kernel360.hackerthon.studyup.member.exception.GoogleSignInException;
//import com.kernel360.hackerthon.studyup.member.exception.SignupException;
//
//import javax.security.auth.login.LoginException;
//
//public interface AuthenticationService {
//    /**
//     * 기본 회원가입
//     * @param member
//     * @throws SignupException
//     */
//    void signup(Member member) throws SignupException;
//
//    /**
//     * 소셜 회원가입 - 선택
//     * @param googleToken
//     * @throws SignupException
//     */
//    //void signupWithGoogle(String googleToken) throws SignupException;
//
//
//    /**
//     * 기본 로그인
//     * @param member
//     * @throws LoginException
//     */
//    void login(Member member) throws LoginException;
//
//
//    /**
//     * 소셜 로그인 - 선택
//     * @param googleToken
//     * @return
//     * @throws GoogleSignInException
//     */
//    //Member loginWithGoogle(String googleToken) throws GoogleSignInException;
//
//
//}
