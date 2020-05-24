package com.company;
import java.util.Scanner;

public class Questionnaire {
    public Questionnaire() {
        Scanner scanner = new Scanner(System.in);

        String question1 = "Who is Donald Trump: ";
        System.out.println (question1);
        String answer1 = scanner.next();

        String question2 = "How old is he: ";
        System.out.println (question2);
        int age = scanner.nextInt();

        String question3 = "Name Elon Musk companies: ";
        System.out.println (question3);
        String companies = scanner.next();

        String question4 = "Visit Europe or Mexico?: ";
        System.out.println (question4);
        String country = scanner.next();

        String question5 = "Use iPhone or Android phone?: ";
        System.out.println (question5);
        String phone = scanner.next();

        String question6 = "Who is your favorite author?: ";
        System.out.println (question6);
        String author = scanner.next();

        String question7 = "What is your favorite memory?: ";
        System.out.println (question7);
        String memory = scanner.next();

        String question8 = "PI?: ";
        System.out.println (question8);
        float pi = scanner.nextFloat();

        System.out.println ("\n=========Result========== \n");
        System.out.print(question1 + answer1 + '\n');
        System.out.print(question2 + age + '\n');
        System.out.print(question3 + companies + '\n');
        System.out.print(question4 + country + '\n');
        System.out.print(question5 + phone + '\n');
        System.out.print(question6 + author + '\n');
        System.out.print(question7 + memory + '\n');
        System.out.print(question8 + pi + '\n');
    }
}
