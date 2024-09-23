package org.example;

import java.util.List;

public class CheckBox extends Question {
        private List<String> options;
        private List<String> correctAnswers;

        public CheckBox(String questionText, List<String> options, List<String> correctAnswers) {
            super(questionText);
            this.options = options;
            this.correctAnswers = correctAnswers;
        }

        @Override
        public boolean checkAnswer(List<String> answers) {
            return answers.containsAll(correctAnswers) && answers.size() == correctAnswers.size();
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
