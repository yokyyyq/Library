package org.example.Model;

import org.example.Model.Author;
import org.example.Model.Library;
import org.example.Model.Book;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBook(String title, String genre, LocalDate publicationDate, String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        Book book = new Book();
        book.setTitle(title);
        book.setPublicationDate(publicationDate);
        book.setGenre(genre);

        book.setAuthors(authors);

        library.addBook(book);
    }
}
