/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart4;

/**
 *
 * @author Lenny Manset
 */
public class Book {
    private String title;      // The title of the book
    private String author;     // The author of the book
    private double price;      // The price of the book
    private String publisher;  // The publisher of the book
    private String isbn;       // The ISBN of the book

    // Default constructor
    public Book() {
        title = "To be confirmed";
        author = "To be confirmed";
        price = 0.0;
        publisher = "To be confirmed";
        isbn = "To be confirmed";
    }

    // Constructor with only title
    public Book(String title) {
        this.title = title;
        this.author = "To be confirmed";
        this.price = 0.0;
        this.publisher = "To be confirmed";
        this.isbn = "To be confirmed";
    }

    // Constructor with all data members
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }

    // Method to check the ISBN status (ISBN10 or ISBN13)
    public int checkIsbnStatus() {
        if (isbn.length() == 10 && isbn.matches("\\d{9}-\\d")) {
            return 0; // ISBN10
        } else if (isbn.length() == 13 && isbn.matches("\\d{3}-\\d{1}-\\d{3}-\\d{5}-\\d")) {
            return 1; // ISBN13
        } else {
            return -1; // Invalid ISBN
        }
    }

    // Method to convert the title and author to title case
    public void toTitleCase() {
        this.title = toTitleCase(this.title);
        this.author = toTitleCase(this.author);
    }

    private String toTitleCase(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase())
              .append(word.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }

    // toString method for representing the Book object as a string
    public String toString() {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Price: " + price + "\n" +
               "Publisher: " + publisher + "\n" +
               "ISBN: " + isbn;
    }

    // equals method to compare two Book objects
    public boolean equals(Book other) {
        return this.isbn.equals(other.isbn);
    }

    // clone method to create a copy of the Book object
    public Book clone() {
        return new Book(this);
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
