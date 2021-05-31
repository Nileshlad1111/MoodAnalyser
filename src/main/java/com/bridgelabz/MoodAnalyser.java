package com.bridgelabz;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY,"Please enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException | MoodAnalysisException e){
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL,"Please enter Proper Mood");
        }
    }
}
