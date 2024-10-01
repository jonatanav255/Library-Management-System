
import Book.Book;
import Library.Library;

public class App {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
        library.addBook(new Book("1984", "George Orwell", 1949, false));

        // library.listBooks();

        library.borrowBook("The Catcher in the Rye");
        library.borrowBook("1984");

    }
}
