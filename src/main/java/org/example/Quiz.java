package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
   private List<Question> questions;

   public Quiz() {
       questions = new ArrayList<>();
   }

   public void addQuestion(Question question) {
       questions.add(question);
   }

   public void runQuiz() {
       Scanner scanner = new Scanner(System.in);
       int score = 0;

       for (Question question : questions) {
            question.displayQuestion();
            question.displayOptions();

            List<String> userAnswers = new ArrayList<>();
            String input = scanner.nextLine();
            userAnswers.add(input); // Collect user's answer(s)

           if (question.checkAnswer(userAnswers)) {
                System.out.println("Correct!");
                score++;
           } else {
                System.out.println("Incorrect.");
           }
        }

        System.out.println("Your score: " + score + "/" + questions.size());
    }
}
