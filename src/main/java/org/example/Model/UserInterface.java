package org.example.Model;

import org.example.Model.LibraryService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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

        System.out.print("Введите дату публикации (в формате dd.MM.yyyy): ");
        String dateString = reader.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate publicationDate;
        try {
            publicationDate = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, введите снова.");
            return;
        }

        System.out.print("Введите жанр: ");
        String genre = reader.readLine();

        System.out.print("Введите имя автора: ");
        String firstName = reader.readLine();

        System.out.print("Введите фамилию автора: ");
        String lastName = reader.readLine();
        libraryService.addBook(title, genre, publicationDate, firstName, lastName);

        System.out.println("Книга успешно добавлена!");

    }
}
