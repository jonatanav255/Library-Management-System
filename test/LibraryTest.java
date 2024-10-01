
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Library.Library;
import Book.Book;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        library = new Library();
        library.addBook(new Book("1984", "George Orwell", 1949, false));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Castro", "George Orwell", 1949, true);
        library.addBook(book);
        assertEquals(3, library.listBooks().size());
        System.out.println(library.listBooks().size());
        assertEquals("Castro", library.listBooks().get(2).getTitle());
        assertEquals("George Orwell", library.listBooks().get(2).getAuthor());
    }

    @Test
    public void testBorrowAvailableBook() {

        library.borrowBook("To Kill a Mockingbird");
        assertFalse(library.listBooks().get(1).isAvailable());
    }

    @Test
    public void testReturnBorrowedBook() {
        library.returnBook("1984");

        assertTrue(library.listBooks().get(0).isAvailable());

    }
}
