package com.bridgelabz.exception;

public class MoodAnalysisException extends Throwable {
    public exceptionType type;

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }
    exceptionType getType;
    public MoodAnalysisException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
