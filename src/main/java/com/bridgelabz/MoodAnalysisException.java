package com.bridgelabz;

public class MoodAnalysisException extends Throwable {
    enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }
    exceptionType type;
    public MoodAnalysisException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
