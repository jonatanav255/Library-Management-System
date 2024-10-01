package Library;

import Book.Book;
import java.util.ArrayList;

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

    public void borrowBook(String title) {
        boolean bookFound = false;

        for (Book book : listOfBooks) {
            if (book.getTitle().equals(title)) {
                bookFound = true;

                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have successfully borrowed: " + book.getTitle());
                } else {
                    System.out.println("Sorry, the book is already borrowed.");
                }
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Sorry, the book with title '" + title + "' was not found.");
        }
    }

}
