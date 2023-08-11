package org.example.Model;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private LocalDate publicationDate;
    private String title;
    private List<Author> authors; // Если у книги может быть несколько авторов
    private int publicationYear;
    private String genre;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
}
