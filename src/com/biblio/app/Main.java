package com.biblio.app;

import com.biblio.model.Book;
import com.biblio.model.Isbn;

public class Main {
    public static void main(String[] args) {
        Isbn isbn = new Isbn("9782253045175");
        Book book = new Book(isbn, "Cours de java", "Adam", 2024);
        System.out.println(book);
    }
}