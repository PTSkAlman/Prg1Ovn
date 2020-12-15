package Uppgifter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);
        Scanner quizInput = null;
        try {
            quizInput = new Scanner(new File("quizQuestions"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (quizInput.hasNextLine()) {
            questions.add(quizInput.nextLine());
            options.add(quizInput.nextLine());
            answers.add(quizInput.nextInt());
            quizInput.nextLine();

            System.out.println(questions.get(0) + "\n" + options.get(0));
            int svar = userInput.nextInt();
            if (answers.get(0) == svar) {
                System.out.println("Korrekt!");
            } else {
                System.out.println("Fel!");
            }

        }

    }

}
