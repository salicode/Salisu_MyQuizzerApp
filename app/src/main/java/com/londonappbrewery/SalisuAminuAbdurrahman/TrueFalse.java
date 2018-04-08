package com.londonappbrewery.SalisuAminuAbdurrahman;

public class TrueFalse {
    private int mQuationId;
    private boolean mAnswer;

    public TrueFalse(int quationIdResourseId, boolean trueorFalse) {
        mQuationId = quationIdResourseId;
        mAnswer = trueorFalse;
    }

    public int getQuationId() {
        return mQuationId;
    }

    public void setQuationId(int quationId) {
        mQuationId = quationId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
