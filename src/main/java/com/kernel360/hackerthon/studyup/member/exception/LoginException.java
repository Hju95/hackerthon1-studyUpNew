package com.kernel360.hackerthon.studyup.member.exception;

public class LoginException extends RuntimeException {
    public LoginException() {}

    public LoginException(String message) {
        super(message);
    }
}
