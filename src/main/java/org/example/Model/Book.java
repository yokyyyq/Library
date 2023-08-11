package org.example.Model;

public class Book {
    private String title;
    private Author author;
    private String isbn;
    private int publicationYear;
    private String genre;

    public Book(String title, Author author, String isbn, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }
}
