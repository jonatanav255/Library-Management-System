import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Book.Book;

public class BookTest {

    private Book book;

    // This method runs before each test
    @Before
    public void setUp() {
        book = new Book("1984", "George Orwell", 1949, true);
    }

    @Test
    public void testGetTitle() {
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void testGetYear() {
        assertEquals(1949, book.getYear());
    }

    @Test
    public void testIsAvailable() {
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetAvailability() {
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test
    public void testSetTitle() {
        book.setTitle("Animal Farm");
        assertEquals("Animal Farm", book.getTitle());
    }

    @Test
    public void testSetAuthor() {
        book.setAuthor("Someone Else");
        assertEquals("Someone Else", book.getAuthor());
    }
}
