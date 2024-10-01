package Library;

import Book.Book;
import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);

    }

    public ArrayList<Book> listBooks() {
        return listOfBooks;
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

    public void returnBook(String title) {
        boolean bookFound = false;

        for (Book book : listOfBooks) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                bookFound = true;
                System.out.println("the book hasn't been borrowed");
                break;

            } else if (book.getTitle().equals(title) && !book.isAvailable()) {
                bookFound = true;
                book.setAvailable(true);
                System.out.println("You have successfully returned: " + title);
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Sorry, the book with title '" + title + "' was not found.");
        }
    }

}
