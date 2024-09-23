package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    private String questionText;
    private boolean isAnswered;

    public Question (String questionText) {
    this.questionText = questionText;
    this.isAnswered = false;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public abstract boolean checkAnswer(List<String> answers);
    public abstract void displayQuestion();
    public abstract void displayOptions();
}
