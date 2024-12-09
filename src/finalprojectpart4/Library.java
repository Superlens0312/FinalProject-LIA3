/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart4;

/**
 *
 * @author Lenny Manset
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;  // ArrayList to hold the collection of books

    // Default constructor
    public Library() {
        books = new ArrayList<Book>();
    }

    // Constructor with ArrayList of books
    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    // Copy constructor
    public Library(Library other) {
        this.books = new ArrayList<Book>(other.books);
    }

    // Method to search books by keyword in the title or author
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    // equals method to compare two Library objects
    public boolean equals(Library other) {
        return this.books.equals(other.books);
    }

    // toString method to represent the Library object as a string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.toString()).append("\n\n");
        }
        return sb.toString();
    }

    // Getter and setter methods
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
}
