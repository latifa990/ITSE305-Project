package presentation;

import java.util.Scanner;

import business.BookService;
import data.Book;
// Demonstrates the search functionality for books in the library management system
public class SearchBook {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        // Adding some books to the repository
        bookService.addBook(new Book(3, "Effective Java", "Joshua Bloch", "Programming"));
        bookService.addBook(new Book(4, "The Pragmatic Programmer", "Andrew Hunt", "Programming"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book to search: ");  
        String searchTitle = scanner.nextLine();
       
        Book foundBook = bookService.findBookByTitle(searchTitle);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found: " + searchTitle);
        }
        scanner.close();
    }
}