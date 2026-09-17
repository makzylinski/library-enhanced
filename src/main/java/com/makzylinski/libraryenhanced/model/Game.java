package com.makzylinski.libraryenhanced.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int gameOption;

    Option o1 = new Option(0, "Show all books");
    Option o2 = new Option(1, "Add new book");
    Option o3 = new Option(2, "Borrow a book");
    Option o4 = new Option(3, "Return a book");
    Option o5 = new Option(4, "Exit");

    List<Option> options = new ArrayList<>();

    public Game() {
        Collections.addAll(options, o1, o2, o3, o4, o5);
    }

    public void startGame() {
        while (gameOption != 5) {
            options.forEach(opt -> System.out.println(opt.getStepIndex() + 1 + " " + opt.getLabel()));

            System.out.println("Pick your option");
            gameOption = Integer.parseInt(sc.nextLine());

            switch (gameOption) {
                case 1:
                    System.out.println("Case 1");

                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    System.out.println("Case 3");
                    break;
                case 4:
                    System.out.println("Case 4");
                    break;
                case 5:
                    System.out.println("Closing...");
                    break;
            }
        }
    }


}
