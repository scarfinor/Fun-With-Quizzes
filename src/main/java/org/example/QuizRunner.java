package org.example;

import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add multiple choice question
        quiz.addQuestion(new MultipleChoice("What is the capital of America?",
                Arrays.asList("St.Louis", "Washington DC", "Atlanta", "Bend"), "Washington DC"));

        // Add checkbox question
        quiz.addQuestion(new CheckBox("Select all prime numbers:",
                Arrays.asList("2", "3", "4", "5", "6"), Arrays.asList("2", "3", "5")));

        // Add true/false question
        quiz.addQuestion(new TrueFalse("A square has 5 sides.", false));

        // Run the quiz
        quiz.runQuiz();
    }
}