package Praktikum14;
public class Book {
    String isbn;
    String title;

    public Book(){

    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + isbn + " Title: " + title;
    }
}
