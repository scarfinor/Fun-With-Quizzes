package org.example;

import java.util.List;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(List<String> answers) {
        return answers.size() == 1 && Boolean.parseBoolean(answers.get(0)) == correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
    }

    @Override
    public void displayOptions() {
        System.out.println("1: True");
        System.out.println("2: False");
    }
}
