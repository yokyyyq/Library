package org.example.Model;

import org.example.Model.LibraryService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInterface {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private LibraryService libraryService;

    public UserInterface(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void start() throws Exception {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Выйти");
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    addBook();
                    break;

                case "2":
                    System.out.println("Выход");
                    return;

                case "3":
                default:
                    System.out.println("Попробуйте другую команду");
            }
        }
    }

    public void addBook() throws Exception {
        System.out.print("Введите название книги: ");
        String title = reader.readLine();

        System.out.print("Введите год публикации: ");
        int year = Integer.parseInt(reader.readLine());

        System.out.print("Введите жанр: ");
        String genre = reader.readLine();

        System.out.print("Введите ISBN: ");
        String isbn = reader.readLine();

        System.out.print("Введите имя автора: ");
        String firstName = reader.readLine();

        System.out.print("Введите фамилию автора: ");
        String lastName = reader.readLine();
        libraryService.addBook(title, year, genre, isbn, firstName, lastName);
        System.out.println("Книга успешно добавлена!");

    }
}
