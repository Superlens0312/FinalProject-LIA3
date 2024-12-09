/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart4;
import java.util.ArrayList;
/**
 *
 * @author Lenny Manset
 */
public class LibraryTest {
    public static void main(String[] args) {
        // Create a few Book objects
        Book book1 = new Book("How to Speak Chinese", "Your Name", 9.99, "To be confirmed", "123456789-0");
        Book book2 = new Book("Learning Java", "John Doe", 19.99, "Java Publisher", "978-1-111-11111-1");
        Book book3 = new Book("Advanced Programming", "Jane Smith", 29.99, "Tech Publisher", "978-1-1111111-1-1");

        // Add books to the library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Print library contents
        System.out.println("Library Contents:\n");
        System.out.println(library.toString());

        // Search for books containing the keyword "Java"
        ArrayList<Book> searchResults = library.searchBook("Java");
        System.out.println("Search Results for 'Java':\n");
        for (Book book : searchResults) {
            System.out.println(book.toString());
        }
    }
}
