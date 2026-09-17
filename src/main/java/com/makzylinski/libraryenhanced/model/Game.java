package com.makzylinski.libraryenhanced.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int gameOption;

    List<Option> options = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    public Game() {
        Collections.addAll(
                options,
                new Option(0, "Show all books"),
                new Option(1, "Add new book"),
                new Option(2, "Borrow a book"),
                new Option(3, "Return a book"),
                new Option(4, "Exit"));

        Collections.addAll(
                books,
                new Book(1, "1984", new Author(1, "George", "Orwell"), 328, true),
                new Book(2, "Brave New World", new Author(2, "Aldous", "Huxley"), 311, true),
                new Book(3, "Fahrenheit 451", new Author(3, "Ray", "Bradbury"), 194, false),
                new Book(4, "To Kill a Mockingbird", new Author(4, "Harper", "Lee"), 281, true),
                new Book(5, "The Great Gatsby", new Author(5, "F. Scott", "Fitzgerald"), 180, true),
                new Book(6, "Moby Dick", new Author(6, "Herman", "Melville"), 585, false),
                new Book(7, "War and Peace", new Author(7, "Leo", "Tolstoy"), 1225, true),
                new Book(8, "Crime and Punishment", new Author(8, "Fyodor", "Dostoevsky"), 671, true),
                new Book(9, "The Hobbit", new Author(9, "J.R.R.", "Tolkien"), 310, false),
                new Book(10, "Pride and Prejudice", new Author(10, "Jane", "Austen"), 279, true));
    };

    public void startGame() {
        while (gameOption != 5) {
            options.forEach(opt -> System.out.println(opt.getStepIndex() + 1 + " " + opt.getLabel()));

            System.out.println("Pick your option");
            gameOption = Integer.parseInt(sc.nextLine());

            switch (gameOption) {
                case 1:
                    System.out.println("Case 1");
                    books.forEach(b -> {
                        System.out.print(b.getAuthor().getName() + " " + b.getAuthor().getLastName());
                        System.out.println(" - " + b.getTitle());

                    });
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
