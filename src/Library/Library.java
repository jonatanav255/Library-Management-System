package Library;

import java.util.ArrayList;

import Book.Book;

public class Library {

    private ArrayList<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);

    }

    public void listBooks() {
        if (listOfBooks.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : listOfBooks) {
                System.out.println(book.toString()); // This will call the toString() method of the Book class
            }
        }
    }

}
