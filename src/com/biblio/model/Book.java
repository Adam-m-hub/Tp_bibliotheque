package com.biblio.model;
import java.time.Year;
import java.util.Objects;
import static com.biblio.util.ValidationUtil.requireNonEmpty;
public final class Book {
    private final Isbn isbn;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(Isbn isbn, String title, String author, int publicationYear) {
        this.isbn = Objects.requireNonNull(isbn);
        this.title = requireNonEmpty(title, "title");
        this.author = requireNonEmpty(author, "author");
        int year = publicationYear;
        int current = Year.now().getValue();
        if (year <= 0 || year > current) throw new IllegalArgumentException("année invalide");
        this.publicationYear = year;
    }
    // getters, equals/hashCode/toString
    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                isbn.equals(book.isbn) &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publicationYear);
    }
}

