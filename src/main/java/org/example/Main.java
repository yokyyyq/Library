package org.example;

import org.example.Model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        LibraryService libraryService = new LibraryService(library);
        UserInterface userInterface = new UserInterface(libraryService);
        userInterface.start();
    }
}