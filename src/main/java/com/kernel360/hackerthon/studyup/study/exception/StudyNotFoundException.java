package com.kernel360.hackerthon.studyup.study.exception;

public class StudyNotFoundException extends Throwable {
    public StudyNotFoundException() {}

    public StudyNotFoundException(String message) {
        super(message);
    }
}
