package org.example;

import java.util.List;

public class MultipleChoice extends Question {
    private List<String> options;
    private String correctAnswer;

    public MultipleChoice(String questionText, List<String> options, String correctAnswer){
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean checkAnswer(List<String> answers) {
        return answers.size() == 1 && answers.get(0).equals(correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
    }

    @Override
    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ": " + options.get(i));
        }
    }
}
