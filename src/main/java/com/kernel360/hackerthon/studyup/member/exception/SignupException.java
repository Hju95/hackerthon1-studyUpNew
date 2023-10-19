package com.kernel360.hackerthon.studyup.member.exception;

public class SignupException extends RuntimeException {
    public SignupException() {}

    public SignupException(String message) {
        super(message);
    }
}
