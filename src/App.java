
import Book.Book;
import Library.Library;

public class App {

    public static void main(String[] args) {

        // System.out.println("Hello, World!");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true);
        Library library = new Library();
        library.addBook(book);
        library.listBooks();

    }
}
